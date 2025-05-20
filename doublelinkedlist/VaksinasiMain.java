package doublelinkedlist;
import java.util.Scanner;

public class VaksinasiMain {
    public static void main(String[] args) throws Exception {
        QueueVaksin dll = new QueueVaksin();
        Scanner sc = new Scanner(System.in);
        int choose;

        do{
            System.out.println("\n+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("\n1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("Masukkan pilihan Anda: ");
            choose=sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian: ");
                    String nomorAntrian = sc.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = sc.nextLine();
                    dll.add(nomorAntrian, nama);
                    break;
                case 2:
                    System.out.println("\n--- Hapus Data Pengantri Vaksin (Vaksinasi) ---");
                    dll.delete();
                    break;
                case 3:
                    System.out.println("\n--- Daftar Penerima Vaksin (Antrian) ---");
                    dll.print();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }while(choose!=4);
    }
}
