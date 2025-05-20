package doublelinkedlist;

import java.util.Scanner;

public class FilmMain{
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        LinkedListFilm film = new LinkedListFilm();
        int pilihan;

        do {
            System.out.println("\n========================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("========================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Awal");
            System.out.println("5. Hapus Data Akhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak Data");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("=========================================");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                System.out.println("\nMasukkan Data Film Posisi Awal");
                    System.out.print("ID Film: ");
                    String idAwal = input.nextLine();
                    System.out.print("Judul Film: ");
                    String judulAwal = input.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingAwal = input.nextDouble();
                    input.nextLine();
                    film.addFirst(idAwal, judulAwal, ratingAwal);
                    break;
                case 2:
                    System.out.println("\nMasukkan Data FIlm Posisi Akhir");
                    System.out.print("ID Film: ");
                    String idAkhir = input.nextLine();
                    System.out.print("Judul Film: ");
                    String judulAkhir = input.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingAkhir = input.nextDouble();
                    input.nextLine();
                    film.addLast(idAkhir, judulAkhir, ratingAkhir);
                    break;
                case 3:
                    System.out.println("\nMasukkan Data Film");
                    System.out.print("Urusan ke-");
                    System.out.print("Masukkan Indeks: ");
                    int indeksTambah = input.nextInt();
                    input.nextLine();
                    System.out.print("ID Film: ");
                    String idIndeks = input.nextLine();
                    System.out.print("Judul Film: ");
                    String judulIndeks = input.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingIndeks = input.nextDouble();
                    input.nextLine();
                    film.add(indeksTambah, idIndeks, judulIndeks, ratingIndeks);
                    break;
                case 4:
                    System.out.println("\nHapus Data Awal");
                    film.removeFirst();
                    break;
                case 5:
                    System.out.println("\nHapus Data Akhir");
                    film.removeLast();
                    break;
                case 6:
                    System.out.println("\nHapus Data Tertentu");
                    System.out.print("Masukkan ID Film yang ingin dihapus: ");
                    int id = input.nextInt();
                    film.remove(id);;
                    break;
                case 7:
                    System.out.println("\nCetak Data");
                    film.print();
                    break;
                case 8:
                    System.out.println("\nCari Data");
                    System.out.print("Masukkan ID Film yang ingin dicari: ");
                    String idCari = input.nextLine();
                    film.searchByID(idCari);
                    break;
                case 9:
                    System.out.println("\nUrut Data Rating Film DSC");
                    film.sortingRatingDSC();
                    film.print();
                    break;
                case 10:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 10);

        input.close();
    }
}
