package Praktikum05;

public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    //Konstruktor default
    Mahasiswa17(){

    }

    //Konstukrtor berparameter (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    Mahasiswa17(String nm, String name, String kls, double ip){
        nim = nm;
        nama =name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("Nama: "+nama);
        System.out.println("NIM: " +nim);
        System.out.println("Kelas: "+kelas);
        System.out.println("IPK: "+ipk);
    }
}
