package Praktikum05;

public class MahasiswaBerprestasi17 {
    int jmlhMhs;
    Mahasiswa17 [] listMhs;
    int idx; 

    MahasiswaBerprestasi17(int jmlh){
        jmlhMhs=jmlh;
        listMhs=new Mahasiswa17[jmlhMhs];
    }

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
}
