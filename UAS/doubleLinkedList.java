package UAS;

public class doubleLinkedList {
    node head;
    int size;

    public doubleLinkedList() {
        head = null;
        size = 0;
    }
    
    boolean isEmpty() {
        return head == null;
    }

    //Menambahkan data di depan
    public void addFirst(int item){
        if (isEmpty()) {
            head = new node(null, item, null);
        } else {
            node newNode = new node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    //Menghapus data dibelakang
    public void removeLast() throws Exception{
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
}
