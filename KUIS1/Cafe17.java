package KUIS1;

import java.util.Scanner;

public class Cafe17 {
    Scanner sc = new Scanner(System.in);
    public String menu;
    public String namaPembeli;
    public int jumlahPesanan;
    public Cafe17(){

    }
    public Cafe17(String nama, String menu, int jumlahPesanan){
        namaPembeli= nama;
        this.menu = menu;
        this.jumlahPesanan = jumlahPesanan;
    }
    void tampilkanMenu(){
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Americano    - Rp 15.000");
        System.out.println("2. Cappuccino   - Rp 20.000");
        System.out.println("3. Creamy Latte - Rp 22,000");
        System.out.println("4. Matcha Latte - Rp 25,000");
        System.out.println("5. Red Velvet   - Rp 20,000");
        System.out.println("6. Toast        - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
        System.out.println("=====================");
    }
    void tambahPesanan(){
        String dummy;
        System.out.print("Nama Customer : ");
        this.namaPembeli=sc.nextLine(); 
        System.out.print("Menu          : ");
        this.menu=sc.nextLine();
        System.out.print("Jumlah Pesanan: ");
        dummy = sc.nextLine();
        this.jumlahPesanan=Integer.parseInt(dummy);
    }

    void tampilkanPesanan() {
        System.out.println("===== RINCIAN PESANAN =====");
        System.out.println("Nama Customer : " + namaPembeli);
        System.out.println("Menu          : " + menu);
        System.out.println("Jumlah Pesanan: " + jumlahPesanan);
        System.out.println("===========================");
    }

}
