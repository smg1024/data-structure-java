package chap04;

class IntQueue {
    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    public IntQueue(int capacity) {
        num = front = rear = 0;
        this.capacity = capacity;

        try {
            que = new int[this.capacity];
        } catch (OutOfMemoryError e) {
            this.capacity = 0;
        }
    }

    public int enqueue(int x) throws OverflowQueueException {
        if (num >= capacity) throw new OverflowQueueException();

        que[rear++] = x;
        num++;

        if (rear == capacity) rear = 0;
        return x;
    }

    public int dequeue() throws EmptyQueueException {
        if (num <= 0) throw new EmptyQueueException();

        int x = que[front++];
        num--;

        if (front == capacity) front = 0;
        return x;
    }

    public int peek() throws EmptyQueueException {
        if (num <= 0) throw new EmptyQueueException();

        return que[front];
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x) return idx;
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
                System.out.printf("que[%d] = %d\n", idx, que[idx]);
            }
        }
    }

    public int orderOf(int x) {
        int idx = indexOf(x);
        if (idx <= -1) {
            return idx;
        } else {
            int order = idx - front + 1;
            return (order > 0) ? order : order + capacity;
        }
    }
}
