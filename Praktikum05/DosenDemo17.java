package Praktikum05;

import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        System.out.print("Masukkan jumlah dosen: ");
        int jmlDsn = input.nextInt();
        DataDosen17 data = new DataDosen17(jmlDsn);

        do {
            System.out.println("============= MENU ============");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Insertion Sort");
            System.out.println("6. Cari Nama Dosen (Sequential Search)");
            System.out.println("7. Cari Usia Dosen (Binary Search)");
            System.out.println("0. Keluar");
            System.out.println("-------------------------------");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine(); // Membersihkan newline

            switch (menu) {
                case 1:
                    for (int i = 0; i < jmlDsn; i++) {
                        System.out.println("Masukkan Data Dosen ke-" + (i + 1));
                        System.out.print("Nama Dosen: ");
                        String nama = input.nextLine();
                        System.out.print("Kode Dosen: ");
                        String kode = input.nextLine();
                        System.out.print("Jenis Kelamin (L/P): ");
                        String jk = input.nextLine();
                        boolean gender=false;
                            if (jk.equalsIgnoreCase("L")) {
                                gender = true;
                            } else if (jk.equalsIgnoreCase("P")) {
                                gender = false;
                            } 
                        System.out.print("Usia: ");
                        int usia = input.nextInt();
                        input.nextLine(); 
                        System.out.println("------------------------------------------");

                        Dosen17 dosen = new Dosen17(kode, nama, gender, usia);
                        data.tambahDosen(dosen);
                    }
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    System.out.println("Data dosen diurutkan berdasarkan usia (ASC): ");
                    data.SortingASC(null);
                    data.tampil();
                    break;
                case 4:
                    System.out.println("Data dosen diurutkan berdasarkan usia (DSC): ");
                    data.sortingDSC();
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Data dosen diurutkan berdasarkan usia (Insertion Sort):");
                    data.insertionSort();
                    data.tampil();
                    break;
                case 6:
                    //Melakukan pencarian data sequential
                    System.out.println("Masukkan nama dosen yang dicari: ");
                    System.out.print("Nama Dosen: ");
                    String cari = input.nextLine();

                    // System.out.println("Menggunakan sequential searching");
                    int posisi = data.PencarianDataSequential17(cari);
                    data.tampilDataSearchSequential(cari, posisi);
                    break;
                case 7:
                    //Melakukan pencarian data binary
                    System.out.println("Masukkan usia dosen yang dicari: ");
                    System.out.print("Usia Dosen : ");
                    int cariUsia = input.nextInt();
                    
                    int posisi2 = data.PencarianDataBinary17(cariUsia, 0, jmlDsn-1);
                    data.tampilPosisiBinary(jmlDsn, posisi2);
                    data.tampilDataSearchBinary(jmlDsn, posisi2);
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 0);
    }
}