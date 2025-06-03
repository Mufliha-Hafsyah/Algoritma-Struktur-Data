package Pertemuan14;

public class BinaryTreeArrayMain17 {
    public static void main(String[] args) {
        BinaryTreeArray17 bta = new BinaryTreeArray17();
        Mahasiswa17 mhs1 = new Mahasiswa17("244160121", "Ali", "A", 3.57);
        Mahasiswa17 mhs2 = new Mahasiswa17("244160185", "Candra", "C", 3.41);
        Mahasiswa17 mhs3 = new Mahasiswa17("244160221", "Badar", "B", 3.75);
        Mahasiswa17 mhs4 = new Mahasiswa17("244160220", "Dewi", "B", 3.35);

        Mahasiswa17 mhs5 = new Mahasiswa17("244160131", "Devi", "A", 3.48);
        Mahasiswa17 mhs6 = new Mahasiswa17("244160205", "Ehsan", "D", 3.61);
        Mahasiswa17 mhs7 = new Mahasiswa17("244160170", "Fizi", "B", 3.86);

        Mahasiswa17[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6; 
        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
        System.out.println("\nPreOrder Traversal Mahasiswa: ");
        bta.traversePreOrder(0);

        Mahasiswa17 mhs8 = new Mahasiswa17("244160190", "Ghery", "C", 3.91);
        bta.add(mhs8);
        Mahasiswa17 mhs9 = new Mahasiswa17("244160200", "Helen", "A", 3.12);
        bta.add(mhs9);

        System.out.println("\nInorder Traversal Mahasiswa setelah penambahan 2 mahasiswa:");
        bta.traverseInOrder(0);
        System.out.println("\nPreOrder Traversal Mahasiswa setelah penambahan 2 mahasiswa:");
        bta.traversePreOrder(0);   
    }
}
