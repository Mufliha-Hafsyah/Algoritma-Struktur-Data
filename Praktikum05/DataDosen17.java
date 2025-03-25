package Praktikum05;

public class DataDosen17 {
    int jmlhDsn;
    Dosen17[] dataDosen;
    int idx; 

    DataDosen17(int jmlh){
        jmlhDsn=jmlh;
        dataDosen=new Dosen17[jmlhDsn];
    }

    void tambahDosen (Dosen17 dsn){
        if (idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++;
        } else { 
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++){ 
            dataDosen[i].tampil();
            System.out.println("----------------------------");
        }
    }

    void SortingASC(Dosen17[] dsn){
        for (int i=0; i<dataDosen.length-1; i++){
            for (int j=1; j<dataDosen.length-i; j++){
                if (dataDosen[j].usia < dataDosen[j-1].usia){
                    Dosen17 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void sortingDSC(){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen17 temp = dataDosen[i];
            int j = i - 1; 
            while (j >= 0 && dataDosen[j].usia < temp.usia) { 
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen17 temp = dataDosen[i];
            int j = i - 1; 
            while (j >= 0 && dataDosen[j].usia < temp.usia) { 
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
    }

    int found=0;
    int PencarianDataSequential17(String cariNama){
        int posisi = -1;
        for(int j=0; j<dataDosen.length; j++){
            if (dataDosen[j].nama.equalsIgnoreCase(cariNama)){
                posisi = j;
                found++;
            }
        }
        return posisi;
    }

    void tampilDataSearchSequential(String x, int pos){
        if (pos != -1){
            if (found == 1){
                System.out.println("Data dosen dengan nama : " +x+ " ditemukan pada indeks " +pos); 

                System.out.println("Nama Dosen      : "+x);
                System.out.println("Kode            : "+dataDosen[pos].kode);
                System.out.println("Jenis Kelamin   : " + (dataDosen[pos].jenisKelamin ? "L" : "P"));
                System.out.println("Usia            : "+dataDosen[pos].usia);
            } else {
                System.out.println("Peringatan!!! Terdapat lebih dari satu dosen dengan nama " + x + "!");
            }
        } else {
            System.out.println("Data dosen dengan nama : " +x+ " tidak ditemukan");
        }
    }

    int PencarianDataBinary17(int usia, int left,int right){
        SortingASC(dataDosen);
        int mid;
        if (right >= left){
            mid = (left+right)/2;
            if (usia == dataDosen[mid].usia){
                return (mid);
            } else if (dataDosen[mid].usia > usia){
                return PencarianDataBinary17(usia, left, mid-1);
            } else {
                return PencarianDataBinary17(usia, mid+1, right);
            }
        }
        return -1;
    }

    void tampilPosisiBinary(int x, int pos){
        if(pos!=-1){
            System.out.println("Data dosen dengan usia : " +x+ " ditemukan pada indeks " +pos);
        } else {
            System.out.println("Data dosen dengan usia : " +x+ "tidak ditemukan");
        }
    }

    void tampilDataSearchBinary(int x, int pos){
        if (pos != -1){
            System.out.println("Nama Dosen      : "+dataDosen[pos].nama);
            System.out.println("Kode            : "+dataDosen[pos].kode);
            System.out.println("Jenis Kelamin   : " + (dataDosen[pos].jenisKelamin ? "L" : "P"));
            System.out.println("Usia            : "+ x);
        } else {
            System.out.println("Data dosen dengan usia : " +x+ " tidak ditemukan");
        }
    }

}
