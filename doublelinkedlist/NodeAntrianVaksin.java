package doublelinkedlist;

public class NodeAntrianVaksin {
    String noAntrian;
    String nama;
    NodeAntrianVaksin next, prev;

    NodeAntrianVaksin(NodeAntrianVaksin prev, String nomor, String nm, NodeAntrianVaksin next){
        noAntrian = nomor;
        nama = nm;
        this.next=next;
        this.prev=prev;
    }
}
