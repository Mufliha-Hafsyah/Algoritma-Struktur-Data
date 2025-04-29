package JOBSHEET9_STACK;

public class Mahasiswa17 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa17(){

    }

    Mahasiswa17(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
    
}
