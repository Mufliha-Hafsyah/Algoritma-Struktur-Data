import java.util.Scanner;

public class Kubus {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choose;
        do{
            System.out.println("==== MENU RUMUS PERHITUNGAN BANGUN RUANG KUBUS ====");
            System.out.println("1. Menghitung Volume Kubus");
            System.out.println("2. Menghitung luas permukaaan kubus");
            System.out.println("3. Menghitung keliling kubus");
            System.out.print("Pilih menu: ");
            choose = input.nextInt();
            input.nextLine();

            switch (choose) {
                case 1:
                    hitungVolumeKubus();
                    break;
                case 2:
                    hitungLuasPermukaanKubus();
                    break;
                case 3:
                    hitungKelilingKubus();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }while(choose !=3);
    }

    //Fungsi untuk menghitung volume kubus
    static void hitungVolumeKubus(){
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();
        double volume = sisi*sisi*sisi;
        System.out.println("Volume Kubus : " + volume);
        System.out.println();
    }

    //Fungsi untuk menghitung luas permukaan kubus
    static void hitungLuasPermukaanKubus(){
        System.out.print("Masukkan panjang sisi kubus: ");
        double s = input.nextDouble();
        double luasPermukaan = 6*s*s;
        System.out.println("Luas Permukaan Kubus : " + luasPermukaan);
        System.out.println();
    }

    //Fungsi untuk menghitung keliling kubus
    static void hitungKelilingKubus(){
        System.out.print("Masukkan panjang rusuk kubus: ");
        double r = input.nextDouble();
        double keliling = 12*r;
        System.out.println("Keliling Kubus : " + keliling);
        System.out.println();
    }
}
