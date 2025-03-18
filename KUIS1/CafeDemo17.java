package KUIS1;

import java.util.Scanner;

import JOBSHEET3.DataDosen17;
import JOBSHEET3.Dosen17;

public class CafeDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cafe17[] arrayOfCafe17 = new Cafe17[1000];
        String nama, menu, dummy;
        int pilihanMenu, jumlahPesanan;
        
        for (int i=0; i<arrayOfCafe17.length; i++){
            
            System.out.println("Masukkan Data Pembeli ke-" + (i+1));
            System.out.print("Nama Customer : ");
            nama=sc.nextLine(); 
            System.out.print("Menu         : ");
            menu=sc.nextLine();
            System.out.print("Jumlah Pesanan: ");
            dummy = sc.nextLine();
            jumlahPesanan=Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfCafe17[i] = new Cafe17(nama, menu, jumlahPesanan);
        }
        Cafe17 cf = new Cafe17();
        cf.tampilkanMenu();
        cf.tambahPesanan();
        cf.tampilkanPesanan();
    }
}
