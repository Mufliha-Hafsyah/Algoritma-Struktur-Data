import java.util.Scanner;

public class IPSemester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        // Deklarasi Array 
        String[] matKul = {"Pancasila","Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemograman", "Praktikum Dasar Pemograman", "Kesehatan dan Keselamatan Kerja"};
        double[][] nilaiMatKul = new double[matKul.length][2];
        String[] nilaiHuruf = new String[matKul.length];
        double[] sks = new double[matKul.length];

        //input nilai
        for (int i=0; i<matKul.length; i++){
            System.out.print("Masukkan nilai angka untuk MK "+matKul[i]+": ");
            nilaiMatKul[i][0] = input.nextDouble();
            System.out.print("Masukkan bobot sks: ");
            sks[i] = input.nextDouble();

            //nilai huruf 
            if (nilaiMatKul[i][0]>80 && nilaiMatKul[i][0]<=100){
                nilaiHuruf[i] = "A";
            }else if (nilaiMatKul[i][0] >73 && nilaiMatKul[i][0] <=80 ){
                nilaiHuruf[i] =  "B+";
            }else if (nilaiMatKul[i][0] >65 && nilaiMatKul[i][0] <=73 ){
                nilaiHuruf[i] = "B";
            }else if (nilaiMatKul[i][0] >60 && nilaiMatKul[i][0] <=65){
                nilaiHuruf[i] = "C+";
            }else if (nilaiMatKul[i][0] >50 && nilaiMatKul[i][0] <=60){
                nilaiHuruf[i] = "C";
            }else if (nilaiMatKul[i][0] >39 && nilaiMatKul[i][0] <=50){
                nilaiHuruf[i] = "D";
            }else if (nilaiMatKul[i][0] <=39){
                nilaiHuruf[i] = "E";
            }
        }

        //bobot nilai
        for(int i=0; i<matKul.length; i++){
            if (nilaiHuruf[i].equals("A")){
                nilaiMatKul[i][1] = 4;
            }else if (nilaiHuruf[i].equals("B+")){
                nilaiMatKul[i][1] = 3.5;
            }else if (nilaiHuruf[i].equals("B")){
                nilaiMatKul[i][1] = 3;
            }else if (nilaiHuruf[i].equals("C+")){
                nilaiMatKul[i][1] = 2.5;
            }else if (nilaiHuruf[i].equals("C")){
                nilaiMatKul[i][1] = 2;
            }else if (nilaiHuruf[i].equals("D")){
                nilaiMatKul[i][1] = 1;
            }else if (nilaiHuruf[i].equals("E")){
                nilaiMatKul[i][1] = 0;
            }
        }

        //tabel hasil konversi nilai
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf(String.format("%-50s", "Mk"));
        System.out.println("Nilai Angka\t" + "Nilai Huruf\t" + "Bobot Nilai\t");
        for(int i=0; i<nilaiMatKul.length; i++){
            System.out.printf(String.format("%-50s", matKul[i]));
            System.out.println(nilaiMatKul[i][0]+ "\t\t" + nilaiHuruf[i] + "\t\t" +  nilaiMatKul[i][1]);
        }

        //hitung IP Semester
        double nilaiTotal=0;
        double keseluruhanSKS=0;
        for(int i=0; i<matKul.length; i++){
            nilaiTotal = nilaiTotal+(nilaiMatKul[i][1]*sks[i]);
            keseluruhanSKS = keseluruhanSKS+sks[i];
        }

        double IP = nilaiTotal/keseluruhanSKS;
        System.out.println("IP : "+ String.format("%2f", IP));
    }
}

