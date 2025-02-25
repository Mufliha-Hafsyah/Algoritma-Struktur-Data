

import java.util.Scanner; 

public class NilaiAkhirMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        //input nilai
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double UTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double UAS = input.nextDouble();
       
        System.out.println("==============================");
        System.out.println("==============================");

        //cek valid or tidak valid
        if(tugas<0 || tugas>100 || kuis<0 || kuis>100 || UTS<0 || UTS>100 || UAS<0 || UAS>100){
            System.out.println("Nilai Tidak Valid");
            System.out.println("==============================");
            System.out.println("==============================");
            return;
        }
        
        //perhitungan nilai akhir
        tugas = tugas*20/100;
        kuis = kuis*20/100;
        UTS = UTS*30/100;
        UAS = UAS*40/100;
        double nilaiAkhir = tugas + kuis + UTS + UAS;

        //nilai akhir huruf 
        String nilaiAkhirHuruf="";
        if (nilaiAkhir>80 && nilaiAkhir<=100){
            nilaiAkhirHuruf = "A";
        }else if (nilaiAkhir >73 && nilaiAkhir <=80 ){
            nilaiAkhirHuruf =  "B+";
        }else if (nilaiAkhir >65 && nilaiAkhir <=73 ){
            nilaiAkhirHuruf = "B";
        }else if (nilaiAkhir >60 && nilaiAkhir <=65){
            nilaiAkhirHuruf = "C+";
        }else if (nilaiAkhir >50 && nilaiAkhir <=60){
            nilaiAkhirHuruf = "C";
        }else if (nilaiAkhir >39 && nilaiAkhir <=50){
            nilaiAkhirHuruf = "D";
        }else if (nilaiAkhir <=39){
            nilaiAkhirHuruf = "E";
        }

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiAkhirHuruf);
        System.out.println("==============================");
        System.out.println("==============================");

        if(nilaiAkhirHuruf.equals("A")|| nilaiAkhirHuruf.equals("B+")|| nilaiAkhirHuruf.equals("B") || nilaiAkhirHuruf.equals("C+") || nilaiAkhirHuruf.equals("C")){
            System.out.println("SELAMAT ANDA DINYATAKAN LULUS");
        }else{
            System.out.println("ANDA DINYATAKAN TIDAK LULUS");
        }

    }
    
}