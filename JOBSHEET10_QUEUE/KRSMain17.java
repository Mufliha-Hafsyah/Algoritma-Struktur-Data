package JOBSHEET10_QUEUE;
import java.util.Scanner;
public class KRSMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS17 antrian = new AntrianKRS17(10);
        int pilihan;
        do{
            System.out.println("\n=== Menu Antrian Persetujuan Kartu Rencana Studi(KRS) ===");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Mengosongkan Antrian");
            System.out.println("4. Tambah Mahasiswa ke Antrian");
            System.out.println("5. Proses KRS Mahasiswa");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Tampilkan 2 Mahasiswa Terdepan");
            System.out.println("8. Tampilkan Mahasiswa Terakhir");
            System.out.println("9. Tampilkan Jumlah Antrian");
            System.out.println("10. Tampilkan Jumlah KRS Mahasiswa yang Sudah Diproses");
            System.out.println("11. Tampilkan Jumlah KRS Mahasiswa yang Belum Diproses");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan){ 
                case 1:
                    antrian.isEmpty();
                    break;
                case 2:
                    antrian.isFull();
                    break;
                    case 3:
                    antrian.clearAntrian();
                    break;
                case 4:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = sc.nextLine();
                    Mahasiswa17 mhs = new Mahasiswa17(nim, nama, prodi, kelas);
                    antrian.tambahAntrianMahasiswa(mhs);
                    break;
                case 5:
                    antrian.memprosesKRS();
                    break;
                case 6:
                    antrian.tampilkanSemua();
                    break;
                case 7:
                    antrian.lihatDuaTerdepan();
                    break;
                case 8:
                    antrian.lihatAntrianTerakhir();
                    break;
                case 9:
                    System.out.println("Jumlah dalam antrian: " + antrian.tampilJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Jumlah KRS yang sudah diproses: " + antrian.tampilJmlProsesKRS());
                    break;
                case 11:
                    System.out.println("Jumlah KRS yang belum diproses: " + antrian.tampilSisaProsesKRS());
                    break;
                default:
                    break;
            }
        }while (pilihan != 0);
    }
}
