import java.util.Scanner;

public class AntrianMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianMahasiswa queue = new AntrianMahasiswa(5);
        int choose;
        do {
            System.out.println("\n==== LAYANAN UNIT KEMAHASISWAAN ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            choose = sc.nextInt(); sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("\n--- Tambah Antrian ---");
                    System.out.print("Masukkan NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = sc.nextDouble(); 
                    sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, kelas, ipk);
                    queue.enqueue(mhs);
                    break;

                case 2:
                    System.out.println("\n--- Panggil Antrian ---");
                    queue.dequeue();
                    break;

                case 3:
                    System.out.println("\n--- Tampilkan Semua Antrian ---");
                    queue.printQueue();
                    break;

                case 4:
                    System.out.println("\n--- Lihat Antrian Terdepan---");
                    String first = queue.getFirst();
                    System.out.println("Antrian terdepan : " + first);
                    break;

                case 5:
                    System.out.println("\n--- Lihat Antrian Paling Akhir---");
                    String last = queue.getLast();
                    System.out.println("Antrian paling akhir : " + last);
                    break;

                case 6:
                    System.out.println("\n--- Lihat Jumlah Antrian ---");
                    System.out.println("Jumlah antrian saat ini: " + queue.getSize());
                    break;

                case 7:
                    System.out.println("\n--- Kosongkan Antrian ---");
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (choose != 0);
    }
}