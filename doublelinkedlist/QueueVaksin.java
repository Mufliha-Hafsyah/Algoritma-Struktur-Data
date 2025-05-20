package doublelinkedlist;

public class QueueVaksin {
    NodeAntrianVaksin head, tail;
    int size;

    QueueVaksin(){
        head=null;
        size=0;
    }

    boolean isEmpty(){
        return head==null;
    }

    void add(String noAntrian, String nama){
        NodeAntrianVaksin newNode = new NodeAntrianVaksin(null, noAntrian, nama, null);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        size++;
        System.out.println("Data " + nama + " antrian nomor " + noAntrian + "  berhasil ditambahkan");
    }

    void delete() throws Exception{
       if(isEmpty()){
            throw new Exception("Antrian kosong");
       }
       NodeAntrianVaksin tmp=head;
       if(size==1){
            head=null;
            size=0;
       }else{
            head=head.next;
            head.prev=null;
            size--;
       }
       System.out.println(tmp.nama + " telah selesai divaksinasi");
    }

    void print() throws Exception{
        if(isEmpty()){
            throw new Exception("Antrian kosong");
        }else{
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("|" + "No." + "    |" + "Nama           " + "|");
            NodeAntrianVaksin current=head;
            while(current!=null){
                System.out.printf("| %-5s | %-13s |\n", current.noAntrian, current.nama);
                current=current.next;
            }
        }
        System.out.println("Sisa Antrian: " + size);
    }
}


