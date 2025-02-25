package JOBSHEET3;

public class DataDosen17 {
    String nama;
    Boolean jenisKelamin;
    int usia, pria=0, wanita=0;

    void dataSemuaDosen(Dosen17[] arrayOfDosen17){
        for(Dosen17 dataDosen : arrayOfDosen17){
            System.out.println("Data Dosen");
            System.out.println("Kode Dosen    : " + dataDosen.kode);
            System.out.println("Nama Dosen    : " + dataDosen.nama);
            System.out.println("Jenis Kelamin : " + (dataDosen.jenisKelamin? "Pria":"Wanita"));
            System.out.println("Usia          : " + dataDosen.usia);
            System.out.println("------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen17[] arrayDosen17){
        for (int i=0; i<arrayDosen17.length; i++){
            if (arrayDosen17[i].jenisKelamin == true){
                pria++;
            } else{
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen17[] arrayDosen17) {
        int usiaDosenPria=0, usiaDosenWanita=0;
        for (int i=0; i<arrayDosen17.length; i++){
            if (arrayDosen17[i].jenisKelamin == true){
                usiaDosenPria+=arrayDosen17[i].usia;
            } else if (arrayDosen17[i].jenisKelamin == false){
                usiaDosenWanita+=arrayDosen17[i].usia;
            }
        }

        double rataPria=(double)usiaDosenPria/pria;
        double rataWanita=(double)usiaDosenWanita/wanita;
        System.out.println("Rata-Rata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-Rata Usia Dosen Wanita : " + rataWanita);
    }

    void infoDosenPalingTua(Dosen17[] arrayDosen17){
        int palingTua=0, indeks=0;
        for (int i=0; i<arrayDosen17.length; i++){
            if(arrayDosen17[i].usia>palingTua){
                palingTua = arrayDosen17[i].usia;
                indeks = i;
            }
        }
        System.out.println("Dosen Paling Tua : " + arrayDosen17[indeks].nama + " , Usia : " + arrayDosen17[indeks].usia);
    }

    void infoDosenPalingMuda(Dosen17[] arrayDosen17){
        int palingMuda=100, indeks=0;
        for (int i=0; i<arrayDosen17.length; i++){
            if(arrayDosen17[i].usia<palingMuda){
                palingMuda = arrayDosen17[i].usia;
                indeks = i;
            }
        }
        System.out.println("Dosen Paling Muda : " + arrayDosen17[indeks].nama + " , Usia : " + arrayDosen17[indeks].usia);
    }
}   
