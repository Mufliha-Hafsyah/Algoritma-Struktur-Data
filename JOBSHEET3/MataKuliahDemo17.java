package JOBSHEET3;

import java.util.Scanner;

public class MataKuliahDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data mata kuliah yang akan diinput: ");
        int jumlahData = sc.nextInt();
        MataKuliah17[] arrayofMataKuliah17 = new MataKuliah17[jumlahData];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i<arrayofMataKuliah17.length; i++){
            arrayofMataKuliah17[i] = new MataKuliah17();
            System.out.println("Masukkan Data Mata Kuliah ke-:" + (i+1));
            arrayofMataKuliah17[i].tambahData();
            System.out.println("------------------------------------");
        }
        for (int i=0; i<arrayofMataKuliah17.length; i++){
            System.out.println("Data Mata Kuliah ke-"  + (i+1));
            arrayofMataKuliah17[i].cetakInfo();
            System.out.println("------------------------------------");
        }
    }
}
