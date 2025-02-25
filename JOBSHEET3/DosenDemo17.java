package JOBSHEET3;

import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen yang akan diinput: ");
        int jumlahData = sc.nextInt();
        sc.nextLine();
        Dosen17[] arrayOfDosen17 = new Dosen17[jumlahData];
        String kode, nama, dummy;
        Boolean jenisKelamin = false;
        int usia;

        for (int i=0; i<arrayOfDosen17.length; i++){
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode Dosen    : ");
            kode=sc.nextLine(); 
            System.out.print("Nama Dosen    : ");
            nama=sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();
            if (jk.equalsIgnoreCase("pria")) {
                jenisKelamin = true;
            } else if (jk.equalsIgnoreCase("wanita")) {
                jenisKelamin = false;
            } 
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia=Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfDosen17[i] = new Dosen17(kode, nama, jenisKelamin, usia);
        }

        DataDosen17 dosen = new DataDosen17();
        dosen.dataSemuaDosen(arrayOfDosen17);
        dosen.jumlahDosenPerJenisKelamin(arrayOfDosen17);
        dosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen17);
        dosen.infoDosenPalingTua(arrayOfDosen17);
        dosen.infoDosenPalingMuda(arrayOfDosen17);
    }
    
}
