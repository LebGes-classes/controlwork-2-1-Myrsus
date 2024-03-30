public class MyLinkedList<E> implements IMyCollection<E> {
    private Node<E> head;
    private int size = 0;

    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(E e) {
        if (head == null) return false;

        if (head.data.equals(e)) {
            head = head.next;
            size--;
            return true;
        }

        Node<E> current = head;
        Node<E> prev = null;

        while (current != null && !current.data.equals(e)) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        prev.next = current.next;
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

}