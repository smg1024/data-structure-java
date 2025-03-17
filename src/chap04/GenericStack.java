package chap04;

class GenericStack<E> {
    private E[] stk;
    private int capacity;
    private int ptr;

    public GenericStack(int capacity) {
        ptr = 0;
        this.capacity = capacity;

        try {
            this.stk = (E[]) new Object[this.capacity];
        } catch (OutOfMemoryError e) {
            this.capacity = 0;
        }
    }

    public E push(E x) throws OverflowStackException {
        if (ptr >= capacity) throw new OverflowStackException();
        return stk[ptr++] = x;
    }

    public E pop() throws EmptyStackException {
        if (ptr <= 0) throw new EmptyStackException();
        return stk[--ptr];
    }

    public E peek() throws EmptyStackException {
        if (ptr <= 0) throw new EmptyStackException();
        return stk[ptr - 1];
    }

    public void clear() {
        ptr = 0;
    }

    public int indexOf(E x) {
        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i] == x) return i;
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= capacity;
    }

    public void dump() {
        if (ptr <= 0) System.out.println("Stack is empty.");
        else {
            for (int i = 0; i < ptr; i++) {
                System.out.printf("stk[%d] = %s\n", i, stk[i].toString());
            }
        }
    }
}
