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

    void SortingASC(){
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
}
