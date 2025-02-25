package JOBSHEET3;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa17[] arrayofMahasiswa = new Mahasiswa17[3];
        String dummy;

        for (int i=0; i<3; i++){
            arrayofMahasiswa[i] = new Mahasiswa17();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM     : ");
            arrayofMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayofMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayofMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayofMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------");
        }
        for (int i=0; i<3; i++){
            System.out.println("Data Mahasiswa ke-"  + (i+1));
            arrayofMahasiswa[i].cetakInfo();
            System.out.println("------------------------------------");
        }

        
    }
}
