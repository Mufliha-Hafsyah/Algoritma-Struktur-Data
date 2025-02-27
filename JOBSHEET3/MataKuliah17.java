package JOBSHEET3;

import java.util.Scanner;

public class MataKuliah17 {
    Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah17(){

    }
    public MataKuliah17(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tambahData (){
        String dummy;
        System.out.print("Kode      : ");
        this.kode=sc.nextLine(); 
        System.out.print("Nama      : ");
        this.nama=sc.nextLine();
        System.out.print("SKS       : ");
        dummy = sc.nextLine();
        this.sks=Integer.parseInt(dummy);
        System.out.print("Jumlah Jam: ");
        dummy = sc.nextLine();
        this.jumlahJam=Integer.parseInt(dummy);
    }
    void cetakInfo(){
        System.out.println("Kode       : "+ kode);
        System.out.println("Nama       : "+ nama);
        System.out.println("SKS        : "+ sks);
        System.out.println("Jumlah Jam : "+ jumlahJam);
    }
}
