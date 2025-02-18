public class DosenMain17 {
    public static void main(String[] args) {
        Dosen17 dsn1 = new Dosen17();
        dsn1.nama = "Candra Bella Vista, S.Kom., MT.";
        dsn1.idDosen = "1654-VIS";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Rekayasa Perangkat Lunak, Basis Data";

        dsn1.tampilInformasi();
        int lamaKerja = dsn1.hitungMasaKerja(2025);
        System.out.println("Masa Kerja: " + lamaKerja + " tahun");
        dsn1.ubahKeahlian("Bahasa Inggris, Dasar Pemograman");

        Dosen17 dsn2 = new Dosen17("Satrio Binusa S, SS, M.Pd", "1764-SBS", false, 2000, "Bahasa Inggris, Desain Antarmuka");
        lamaKerja = dsn2.hitungMasaKerja(2025);
        dsn2.ubahKeahlian("Bahasa Jerman, Aljabar Linear");
        dsn2.tampilInformasi();
    }
}