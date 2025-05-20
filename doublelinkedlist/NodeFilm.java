package doublelinkedlist;

public class NodeFilm {
    String idFilm;
    String judulFilm;
    double rating;
    NodeFilm prev;
    NodeFilm next;

    public NodeFilm(String idFilm, String judulFilm, double rating) {
        this.idFilm = idFilm;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

