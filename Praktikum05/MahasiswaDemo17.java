package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();
        Scanner sc = new Scanner(System.in);
        // System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs=5;
        // jmlMhs= sc.nextInt();
        // MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17(jmlMhs);
        // sc.nextLine();
        
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            // double ipk = sc.nextDouble();
            // sc.nextLine();
            String ipk = sc.nextLine();
            double ip = Double.parseDouble(ipk);
            System.out.println("------------------------------------------");

            // Mahasiswa17 m = new Mahasiswa17(nim, nama, kelas, ipk);
            // list.tambah(m);
            list.tambah(new Mahasiswa17(nim, nama, kelas, ip));
        }

        list.tampil();
        // //Melakukan pencarian data sequential
        // System.out.println("------------------------------------");
        // System.out.println("Pencarian Data");
        // System.out.println("------------------------------------");
        // System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        // System.out.print("IPK : ");
        // double cari = sc.nextDouble();

        // System.out.println("Menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        //Melakukan pencarian data binary
        System.out.println("------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();
        System.out.println("-------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-------------------------");
        
        double posisi2 = list.findBinarySearch(cari, 0, jmlMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);


        // System.out.println("\nData mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();;
        // list.tampil();

        // System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionSort();
        // list.tampil();
    }
}
