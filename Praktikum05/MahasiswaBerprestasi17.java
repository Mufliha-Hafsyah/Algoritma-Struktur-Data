package Praktikum05;

public class MahasiswaBerprestasi17 {
    // int jmlhMhs;
    // Mahasiswa17 [] listMhs;
    // int idx; 
    
    Mahasiswa17[] listMhs = new Mahasiswa17[5];
    int idx;

    // MahasiswaBerprestasi17(int jmlh){
    //     jmlhMhs=jmlh;
    //     listMhs=new Mahasiswa17[jmlhMhs];
    // }

    void tambah(Mahasiswa17 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else { 
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++){ 
            listMhs[i].tampilInformasi();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort(){
        for (int i=0; i<listMhs.length-1; i++){
            for (int j=1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa17 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin =i;
            for(int j=i+1; j<listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa17 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // void insertionSort(){
    //     for(int i=1; i<listMhs.length; i++){
    //         Mahasiswa17 temp = listMhs[i];
    //         int j = 1;
    //         while (j>0 && listMhs[j-1].ipk > temp.ipk) {
    //             listMhs[j] = listMhs[j-1];
    //             j--;
    //         }
    //         listMhs[j] = temp;
    //     }
    // }
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa17 temp = listMhs[i];
            int j = i - 1; // Perubahan: mulai dari i-1
            while (j >= 0 && listMhs[j].ipk < temp.ipk) { // Perubahan: tanda <
                listMhs[j + 1] = listMhs[j];
                j--;
            }
            listMhs[j + 1] = temp;
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for(int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if(pos!=-1){
            System.out.println("Data mahasiswa dengan IPK : " +x+ " ditemukan pada indeks " +pos);
        } else {
            System.out.println("Data " +x+ "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos != -1){
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : "+listMhs[pos].kelas);
            System.out.println("ipk\t : "+x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " +x+ " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left,int right){
        int mid;
        if (right >= left){
            mid = (left+right)/2;
            if (cari == listMhs[mid].ipk){
                return (mid);
            } else if (listMhs[mid].ipk > cari){
                return findBinarySearch(cari, left, mid-1);
            } else {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}
