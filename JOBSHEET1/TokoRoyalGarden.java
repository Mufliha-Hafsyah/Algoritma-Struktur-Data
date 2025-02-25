public class TokoRoyalGarden {
    static int[][] stockBunga = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9} };
    static int[] harga = {75000, 50000, 60000, 10000};
    public static void main(String[] args) {
        tampilkanPendapatan();
        System.out.println();

        tampilkanStokCabang(4);
        System.out.println();
    }   
    // Fungsi untuk menampilkan pendapatan setiap cabang
    public static void tampilkanPendapatan() {
        System.out.println("Pendapatan Setiap Cabang:");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }

    // Fungsi untuk menampilkan stok setiap jenis bunga pada cabang tertentu
    public static void tampilkanStokCabang(int cabang) {
        System.out.println("Stok Bunga RoyalGarden " + cabang + ":");
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < stockBunga[cabang - 1].length; i++) {
            System.out.println(jenisBunga[i] + ": " + stockBunga[cabang - 1][i]);
        }
    }
}


