package JOBSHEET9_STACK;

import java.util.Scanner;

public class SuratDemo17 {
    public static void main(String[] args) {
        StackSurat17 stack = new StackSurat17(5);
        Scanner scan = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Melihat Surat Teratas");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); 
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S: Sakit, I: Izin keperluan lain): ");
                    char jenisIzin = scan.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    Surat17 surat = new Surat17(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    scan.nextLine();
                    System.out.printf("Surat %s berhasil dikumpulkan\n", surat.idSurat);    
                    break;
                case 2:
                    Surat17 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Proses surat dari " + dinilai.namaMahasiswa);
                        System.out.print("Masukkan status (1 untuk diterima, 0 untuk ditolak): ");
                        int status = scan.nextInt();
                        if (status == 1) {
                            System.out.printf("Surat %s diterima\n", dinilai.idSurat);
                        } else {
                            System.out.printf("Surat %s ditolak\n", dinilai.idSurat);
                        }
                    }
                    break;
                case 3:
                    Surat17 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");                    
                    String cariNama = scan.nextLine();
                    boolean ditemukan = stack.cariSurat(cariNama);
                    System.out.println(ditemukan ? "Surat ditemukan." : "Surat tidak ditemukan.");
                    break;
                default:
                    if (pilih != 0) {
                        System.out.println("Pilihan tidak valid!");
                    }
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
