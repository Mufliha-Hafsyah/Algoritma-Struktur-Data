package JOBSHEET9_STACK;

public class StackSurat17 {
    Surat17[] stack;
    int size, top;

    public StackSurat17(int size) {
        this.size = size;
        stack = new Surat17[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Surat17 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat izin lagi.");
        }
    }

    public Surat17 pop() {
        if (!isEmpty()) {
            Surat17 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin untuk diambil.");
            return null;
        }
    }

    public Surat17 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin yang dikumpulkan.");
            return null;
        }
    }
    
    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equals(nama)) {
                return true;
            }
        }
        return false;
    }
}