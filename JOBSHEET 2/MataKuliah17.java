public class MataKuliah17 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Total jam pertemuan per minggu: " +jumlahJam);
        System.out.println();
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diperbarui!");
    }
    void tambahJam(int jam){
        jumlahJam += jam;
    }
    void kurangiJam(int jam){
        if (jumlahJam < jam){
            System.out.println("Pengurangan jam tidak dapat dilakukan!");
        } else {
            jumlahJam -= jam;
        }
    }
    public MataKuliah17(){

    }
    public MataKuliah17 (String nm, String kode, int sks, int jm){
        nama = nm;
        kodeMK = kode;
        this.sks = sks;
        jumlahJam = jm;
    }
}
