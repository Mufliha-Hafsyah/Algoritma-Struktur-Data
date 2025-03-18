package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17(jmlMhs);
        sc.nextLine();
        
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("------------------------------------------");

            Mahasiswa17 m = new Mahasiswa17(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();;
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
