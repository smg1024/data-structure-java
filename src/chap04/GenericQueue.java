package chap04;

class GenericQueue<E> {
    private E[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    public GenericQueue(int capacity) {
        num = front = rear = 0;
        this.capacity = capacity;

        try {
            que = (E[]) new Object[this.capacity];
        } catch (OutOfMemoryError e) {
            this.capacity = 0;
        }
    }

    public E enqueue(E x) throws OverflowQueueException {
        if (num >= capacity) throw new OverflowQueueException();

        que[rear++] = x;
        num++;

        if (rear == capacity) rear = 0;
        return x;
    }

    public E dequeue() throws EmptyQueueException {
        if (num <= 0) throw new EmptyQueueException();

        E x = que[front++];
        num--;

        if (front == capacity) front = 0;
        return x;
    }

    public E peek() throws EmptyQueueException {
        if (num <= 0) throw new EmptyQueueException();

        return que[front];
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int indexOf(E x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx].equals(x)) return idx;
        }

        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        if (num <= 0) System.out.println("Queue is empty.");
        else {
            for (int i = 0; i < num; i++) {
                int idx = (i + front) % capacity;
                System.out.printf("que[%d] = %s\n", idx, que[idx].toString());
            }
        }
    }

    public int orderOf(E x) {
        int idx = indexOf(x);
        if (idx <= -1) {
            return idx;
        } else {
            int order = idx - front + 1;
            return (order > 0) ? order : order + capacity;
        }
    }
}
