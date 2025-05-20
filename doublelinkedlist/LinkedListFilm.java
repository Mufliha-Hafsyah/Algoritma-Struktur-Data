package doublelinkedlist;

public class LinkedListFilm {
    NodeFilm head;
    NodeFilm tail;
    int size;

    LinkedListFilm() {
        this.head = null;
        size=0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(String idFilm, String judulFilm, double rating) {
        NodeFilm newNode = new NodeFilm(idFilm, judulFilm, rating);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(String idFilm, String judulFilm, double rating) {
        NodeFilm newNode = new NodeFilm(idFilm, judulFilm, rating);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    void add(int index, String idFilm, String judulFilm, double rating) throws Exception{
        if(isEmpty()){
            addFirst(idFilm, judulFilm, rating);;
        }else if(index<0||index>size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            NodeFilm current=head;
            int i=0;
            while (i<index) {
                current=current.next;
                i++;
            }
            if(current.prev==null){
                NodeFilm newNode=new NodeFilm(idFilm, judulFilm, rating);
                current.prev=newNode;
                head=newNode;
            }else{
                NodeFilm newNodeFilm=new NodeFilm(idFilm, judulFilm, rating);
                newNodeFilm.prev=current.prev;
                newNodeFilm.next=current;
                current.prev.next=newNodeFilm;
                current.prev=newNodeFilm;
                System.out.println("Data film ini akan masuk di urutan ke-" + index);
            }
            size++;
        }
    }

    int size(){
            return size;
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong");
            return;
        }
        String judulDihapus = head.judulFilm;
        String idDihapus = head.idFilm;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        System.out.println("Film " + "\"" + judulDihapus + "\"" + " dengan ID " + idDihapus + " berhasil dihapus");
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
            return;
        }
        String judulDihapus = tail.judulFilm;
        String idDihapus = tail.idFilm;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        System.out.println("Film " + "\"" + judulDihapus + "\"" + " dengan ID " + idDihapus + " berhasil dihapus");
    }

    void remove(int index) throws Exception{
        if(isEmpty()||index>=size){
            throw new Exception("Nilai indeks di luar batas");
        }else if(index==0){
            removeFirst();
        }else{
            NodeFilm current=head;
            int i=0;
            while(i<index){
                current=current.next;
                i++;
            }
            if(current.next==null){
                current.prev.next=null;
            }else if(current.prev==null){
                current=current.next;
                current.prev=null;
                head=current;
            }else{
                current.prev.next=current.next;
                current.next.prev=current.prev;
            }
            size--;
        }
    }

    void searchByID(String idCari) throws Exception{
        if (isEmpty()) {
            throw new Exception("Daftar film kosong");
        }
        NodeFilm current = head;
        int node = 1;
        while (current != null) {
            if (current.idFilm.equals(idCari)) {
                System.out.println("Data id film: " + idCari + "  berada di node ke-" + node);
                System.out.println("IDENTITAS:");
                System.out.println("    ID Film: " + current.idFilm);
                System.out.println("    Judul Film: " + current.judulFilm);
                System.out.println("    IMDB Rating: " + current.rating);
                return;
            }
            current = current.next;
            node++;
        }
        System.out.println("Film tidak ditemukan");
    }

    void sortingRatingDSC() {
        if (isEmpty() || head == tail) {
            return;
        }
        boolean swap;
        NodeFilm current;
        NodeFilm batas = null;
        do {
            swap = false;
            current = head;
            while (current.next != batas) {
                if (current.rating < current.next.rating) {   
                    String tempId = current.idFilm;
                    String tempJudul = current.judulFilm;
                    double tempRating = current.rating;
                    current.idFilm = current.next.idFilm;
                    current.judulFilm = current.next.judulFilm;
                    current.rating = current.next.rating;
                    current.next.idFilm = tempId;
                    current.next.judulFilm = tempJudul;
                    current.next.rating = tempRating;
                    swap = true;
                }
                current = current.next;
            }
            batas = current;
        } while (swap);
    }

    void print() throws Exception{
        if (isEmpty()) {
            throw new Exception("Daftar film kosong.");
        }
        NodeFilm current = head;
        while (current != null) {
            System.out.println("ID: " + current.idFilm);
            System.out.println("    Judul Film: " + current.judulFilm);
            System.out.println("    Rating: " + current.rating);
            current = current.next;
        }
        System.out.println("==========================");
    }
}

