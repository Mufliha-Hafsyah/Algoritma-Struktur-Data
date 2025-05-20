import java.util.Scanner;

public class Mahasiswa17 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa17(){

    }

    Mahasiswa17(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void inputData(Scanner sc) {
        System.out.print("Nama    : ");
        nama = sc.nextLine();
        System.out.print("NIM     : ");
        nim = sc.nextLine();
        System.out.print("Kelas   : ");
        kelas = sc.nextLine();
        System.out.print("IPK     : ");
        ipk = sc.nextDouble();
        sc.nextLine();
    }

    void tampilInformasi(){
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}
