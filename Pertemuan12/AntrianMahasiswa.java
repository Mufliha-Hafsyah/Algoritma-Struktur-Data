public class AntrianMahasiswa {
    Node front, rear;
    int size, max; 

    public AntrianMahasiswa(int max) {
        this.max = max;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa input) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            Node ndInput = new Node(input, null);
            if (isEmpty()) {
                front = ndInput;
                rear = ndInput;
            } else {
                rear.next = ndInput;
                rear = ndInput;
            }
        }
        System.out.println("Mahasiswa berhasil masuk antrian.");
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        System.out.println("Mahasiswa telah dipanggil. ");
        size --;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public String getFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        } 
        return front.data.nama;
    }

    public String getLast() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        } 
        return rear.data.nama;
    }

    public void printQueue(){
        if (!isEmpty()) {
            Node tmp = front;
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrean Kosong");
        }
    }

    public int getSize() {
        return size;
    }
}
