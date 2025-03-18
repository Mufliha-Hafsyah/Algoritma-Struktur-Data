package Praktikum05;

public class Dosen17 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;
    
    Dosen17 (String kd, String name, Boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Nama Dosen: "+nama);
        System.out.println("Kode Dosen: "+kode);
        System.out.println("Jenis Kelamin: "+(jenisKelamin? "L" : "P"));
        System.out.println("Usia: "+usia);
    }
}
