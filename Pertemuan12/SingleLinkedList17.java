public class SingleLinkedList17 {
    Node17 head;
    Node17 tail;
    int count;
    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node17 tmp = head;
            System.out.println("Isi Linked List:\t ");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa17 input) {
        // if (count > 10){
        //     System.out.println("Antrian penuh, tdk dpt ditambahkan");
        //     System.exit(1);
        // }
        Node17 ndInput = new Node17(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa17 input) {
        Node17 ndInput = new Node17(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa17 input) {
        Node17 ndInput = new Node17(input, null);
        Node17 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa17 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node17 temp = head;
            for (int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node17(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData(int index) {
        Node17 tmp = head;
        for (int i=0; i<index; i++){
            tmp = tmp.next;
        }   
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        Node17 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }   
    }

    public void removeFirst() {
        // for (int i = 0; i < 2; i++){
            if (isEmpty()) {
                System.out.println("Linked list masih kosong, tidak dapat dihapus!");
            } else if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        //}
    }

    public void removeLast() {
        if (isEmpty()) {
        System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node17 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    public void remove(String key){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else {
            Node17 temp = head;
            while (temp.next != null){
                if ((temp.next.data.nama.equalsIgnoreCase(key)) && (temp == head)){
                    this.removeFirst();
                    break;
                } else if (temp.next.data.nama.equalsIgnoreCase(key) && (temp != head)){
                    temp.next = temp.next.next;
                    if (temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node17 temp = head;
            for (int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }
}

// public void removeLast() {
//     if(count % 2 == 0){
//         for(int i=0; i < 2; i++){
//            if (isEmpty()) {
//             System.out.println("Linked list masih kosong, tidak dapat dihapus!");
//             } else if (head == tail) {
//                 head = tail = null;
//             } else {
//                 Node17 temp = head;
//                 while (temp.next != tail) {
//                     temp = temp.next;
//                 }
//                 temp.next = null;
//                 tail = temp;
//             }
//             count--; 
//         }
//     }else{
//         if (isEmpty()) {
//         System.out.println("Linked list masih kosong, tidak dapat dihapus!");
//         } else if (head == tail) {
//             head = tail = null;
//         } else {
//             Node17 temp = head;
//             while (temp.next != tail) {
//                 temp = temp.next;
//             }
//             temp.next = null;
//             tail = temp;
//         }
//         count--;
//     }
// }
