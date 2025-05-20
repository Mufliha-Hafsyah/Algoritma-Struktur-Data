// import java.util.Scanner;

// public class SLLMain17 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String nim, nama, kelas;
//         double ipk;
//         int pilihan, jumlahData;
//         SingleLinkedList17 sll = new SingleLinkedList17();

//         do {
//             System.out.println("============= MENU ============");
//             System.out.println("1. Tambahkan Data Mahasiswa");
//             System.out.println("2. Tambahkan Data Mahasiswa di Awal");
//             System.out.println("3. Tambah Data Mahasiswa di Akhir");
//             System.out.println("4. Tambah Data Mahasiswa Setelah Nama Tertentu");
//             System.out.println("5. Tambah Data Mahasiswa pada Indeks Tertentu");
//             System.out.println("6. Tampilkan Data Mahasiswa");
//             System.out.println("0. Keluar");
//             System.out.println("-------------------------------");
//             System.out.print("Pilih menu: ");
//             pilihan = sc.nextInt();
//             sc.nextLine(); 

//             switch (pilihan) {
//                 case 1: 
//                     System.out.println("Masukkan Data Mahasiswa");
//                     System.out.print("NIM     : ");
//                     nim = sc.nextLine();
//                     System.out.print("Nama    : ");
//                     nama = sc.nextLine();
//                     System.out.print("Kelas   : ");
//                     kelas = sc.nextLine();
//                     System.out.print("IPK     : ");
//                     ipk = sc.nextDouble();
//                     sc.nextLine();
//                     Mahasiswa17 m = new Mahasiswa17(nim, nama, kelas, ipk);
//                     sll.addLast(m);
//                     System.out.println();
//                     break;
//                 case 2:
//                     System.out.println("Masukkan data mahasiswa yang akan ditambahkan di awal");
//                     System.out.print("NIM     : ");
//                     nim = sc.nextLine();
//                     System.out.print("Nama    : ");
//                     nama = sc.nextLine();
//                     System.out.print("Kelas   : ");
//                     kelas = sc.nextLine();
//                     System.out.print("IPK     : ");
//                     ipk = sc.nextDouble();
//                     sc.nextLine();
//                     Mahasiswa17 m1 = new Mahasiswa17(nim, nama, kelas, ipk);
//                     sll.addFirst(m1);
//                     System.out.println();
//                     break;
//                 case 3:
//                     System.out.println("Masukkan data mahasiswa yang akan ditambahkan di akhir");
//                     System.out.print("NIM     : ");
//                     nim = sc.nextLine();
//                     System.out.print("Nama    : ");
//                     nama = sc.nextLine();
//                     System.out.print("Kelas   : ");
//                     kelas = sc.nextLine();
//                     System.out.print("IPK     : ");
//                     ipk = sc.nextDouble();
//                     sc.nextLine();
//                     Mahasiswa17 m2 = new Mahasiswa17(nim, nama, kelas, ipk);
//                     sll.addLast(m2);
//                     System.out.println();
//                     break;
//                 case 4:
//                     System.out.println("Masukkan data mahasiswa yang akan ditambahkan setelah nama tertentu");
//                     System.out.print("Nama yang dicari: ");
//                     String key = sc.nextLine();
//                     System.out.print("NIM     : ");
//                     nim = sc.nextLine();
//                     System.out.print("Nama    : ");
//                     nama = sc.nextLine();
//                     System.out.print("Kelas   : ");
//                     kelas = sc.nextLine();
//                     System.out.print("IPK     : ");
//                     ipk = sc.nextDouble();
//                     sc.nextLine();
//                     Mahasiswa17 m3 = new Mahasiswa17(nim, nama, kelas, ipk);
//                     sll.insertAfter(key, m3);
//                     System.out.println();
//                     break;
//                 case 5:
//                     System.out.println("Masukkan data mahasiswa yang akan ditambahkan pada indeks tertentu");
//                     System.out.print("Indeks yang dicari: ");
//                     int index = sc.nextInt();
//                     sc.nextLine();
//                     System.out.print("NIM     : ");
//                     nim = sc.nextLine();
//                     System.out.print("Nama    : ");
//                     nama = sc.nextLine();
//                     System.out.print("Kelas   : ");
//                     kelas = sc.nextLine();
//                     System.out.print("IPK     : ");
//                     ipk = sc.nextDouble();
//                     sc.nextLine();
//                     Mahasiswa17 m4 = new Mahasiswa17(nim, nama, kelas, ipk);
//                     sll.insertAt(index, m4);
//                     System.out.println();
//                     break;
//                 case 6:
//                     sll.print();
//                     System.out.println();
//                     break;
//                 case 0 :
//                     System.out.println("Program selesai. Terima kasih");
//                     break;
//                 default:
//                     System.out.println("Pilihan tidak valid. Silakan coba lagi.");
//                     System.out.println();
//                     break;
//             }
//         }while (pilihan != 0);
//     }
// }
    
//     /*Mahasiswa17 mhs1 = new Mahasiswa17("24212200","Alvaro", "1A", 4.0);
//     Mahasiswa17 mhs2 = new Mahasiswa17("23212201", "Bimon", "2B", 3.8);
//     Mahasiswa17 mhs3 = new Mahasiswa17("22212202", "Cintia", "3C", 3.5);
//     Mahasiswa17 mhs4 = new Mahasiswa17("21212203", "Dirga", "4D", 3.6);*/

//     // sll.print();
//     // sll.addFirst(mhs);
//     // sll.print();
//     // sll.addLast(mhs1);
//     // sll.print();
//     // sll.insertAfter("Dirga", mhs3);
//     // sll.insertAt(2, mhs2);
//     // sll.print();

import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList17 sll = new SingleLinkedList17();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // clear newline

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data Mahasiswa ke-" + (i + 1) + ":");
            Mahasiswa17 mhs = new Mahasiswa17();
            mhs.inputData(sc);
            sll.addLast(mhs);
        }
        
        System.out.println("\ndata index 1 : ");
        sll.getData(1); 
   
        System.out.println("data mahasiswa an Bimon berada pada index :" + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
