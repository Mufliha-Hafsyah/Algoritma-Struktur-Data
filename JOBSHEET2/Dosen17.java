public class Dosen17 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi(){
        System.out.println("Nama Dosen: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        System.out.print("Status aktif: ");setStatusAktif(statusAktif);
        System.out.println("Tahun bergabung ke perguruan tinggi: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean status){
        if (statusAktif == true){
            System.out.println("Aktif");
        } else {
            System.out.println("Tidak Aktif");
        }
    }
    int hitungMasaKerja(int thnSkrg){
        int lamaKerja=0;
        lamaKerja = thnSkrg - tahunBergabung;
        return lamaKerja;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
    public Dosen17(){

    }
    public Dosen17(String nm, String id, boolean status, int thn, String bidang){
        nama = nm;
        idDosen = id;
        statusAktif = status;
        tahunBergabung = thn;
        bidangKeahlian = bidang;
    }
}
