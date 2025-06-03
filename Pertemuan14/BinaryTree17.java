package Pertemuan14;

public class BinaryTree17 {
    Node17 root;
    public BinaryTree17() {
        root = null;
    }

    public boolean isEmpty() {
            return root == null;
        }

    public void add(Mahasiswa17 mahasiswa) {
        Node17 newNode = new Node17(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node17 current = root;
            Node17 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
        
    }

    boolean find(double ipk) {
        boolean result = false;  
        Node17 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node17 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node17 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node17 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node17 getSuccessor(Node17 del) {
        Node17 successor = del.right;
        Node17 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete (double ipk){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        Node17 parent = root;
        Node17 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break; 
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else { 
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null; 
                } else {
                    if (isLeftChild) {
                    parent.left = null; 
                    } else {
                        parent.right = null; 
                    }
                }
            } else if (current.left == null) { //jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right; 
                } else {
                    if (isLeftChild) {
                        parent.left = current.right; 
                    } else {
                        parent.right = current.right; 
                    }
                }
            } else if (current.right == null) { //jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left; 
                } else {
                    if (isLeftChild) {
                        parent.left = current.left; 
                    } else {
                        parent.right = current.left; 
                    }
                }
            } else { //jika punya 2 anak
                Node17 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor; 
                } else {
                    if (isLeftChild) {
                        parent.left = successor; 
                    } else {
                        parent.right = successor; 
                    }
                }
                successor.left = current.left; 
            }
        }
    } 

    public void addRekursif(Mahasiswa17 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }
    private Node17 addRekursif(Node17 current, Mahasiswa17 mahasiswa) {
        if (current == null) {
            return new Node17(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk){
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }

    public Mahasiswa17 cariMinIPK(){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return null;
        }
        Node17 current = root;
        while (current.left != null) {
            current = current.left; 
        }
        return current.mahasiswa; 
    }

    public Mahasiswa17 cariMaxIPK(){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return null;
        }
        Node17 current = root;
        while (current.right != null) {
            current = current.right; 
        }
        return current.mahasiswa; 
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtas(Node17 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}
