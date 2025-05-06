package JOBSHEET10_QUEUE;

public class AntrianKRS17 {
    Mahasiswa17[] data;
    int front, rear, size, max, totalProses;

    public AntrianKRS17 (int max){
        this.max = max;
        this.data = new Mahasiswa17[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty(){
        if (size == 0){
            System.out.println("Antrian kosong.");
            return true;
        } else {    
            System.out.println("Antrian tidak kosong.");
            return false;
        }
    }

    public boolean isFull(){
        if (size == max){
            System.out.println("Antrian penuh.");
            return true;
        } else {
            System.out.println("Antrian tidak penuh.");
            return false;
        }
    }

    public void clearAntrian(){
        if (!isEmpty()){
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrianMahasiswa(Mahasiswa17 mhs){
        if (isFull()){
           System.out.println("Antrian penuh, tidak dapat menambah mahasiswa baru");
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public void memprosesKRS(){
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa diproses.");
        } else {
            System.out.println("Memproses 2 mahasiswa:");
            for (int i = 0; i < 2; i++) {
                data[front].tampilkanData();
                front = (front + 1) % max;
                size--;
                totalProses++;
            }
        }
    }

    public void tampilkanSemua(){
        if (isEmpty()){
            System.out.println("Antrian kosong.");
        }
        System.out.println("Daftar Mahasiswa dalam Antrian");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++){
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatDuaTerdepan(){
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa.");
        } else {
            int i = front;
            for (int j = 0; j < 2; j++) {
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[i].tampilkanData();
                i = (i + 1) % max;
            }
        }
    }
    public void lihatAntrianTerakhir(){
        if (isEmpty()){
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terakhir dalam antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int tampilJumlahAntrian(){
        return size;
    }

    public int tampilJmlProsesKRS(){
        return totalProses;
    }

    public int tampilSisaProsesKRS(){
        return (30 - totalProses);
    }
}
