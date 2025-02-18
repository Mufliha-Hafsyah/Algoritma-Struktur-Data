public class MataKuliahMain17 {
    public static void main(String[] args) {
        MataKuliah17 mk1 = new MataKuliah17();
        mk1.nama = "Rekayasa Perangkat Lunak";
        mk1.kodeMK = "RPL_TI";
        mk1.sks = 3;
        mk1.jumlahJam = 16;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(2);
        mk1.kurangiJam(18);
        mk1.tampilkanInformasi();

        MataKuliah17 mk2 = new MataKuliah17("Bahasa Inggris", "BING_TI", 2, 10);
        mk2.tambahJam(5);
        mk2.tampilkanInformasi();
    }
}
