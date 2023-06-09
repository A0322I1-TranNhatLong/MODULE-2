package ss10_dsa_danh_sach.bai_tap.LinkedList;

public class MyLinkedList<E> {
    Node head;
    int numNodes = 0;

    public MyLinkedList() {
    }

    private class Node {
        Node next;
        E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        if (numNodes == 0) {
            addFirst(element);
        } else {
            Node current = head;
            for (int i = 1; i < numNodes; i++) {
                current = current.next;
            }
            current.next = new Node(element);
            numNodes++;
        }
    }

    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else if (index >= numNodes) {
            addLast(element);
        } else {
            Node previous = head;
            for (int i = 1; i < index - 1; i++) {
                previous = previous.next;
            }
            Node temp = previous.next;
            previous.next = new Node(element);
            previous.next.next = temp;
            numNodes++;
        }
    }

    public E remove(int index) {
        if (numNodes > 0) {
            if (index < 0 || index >= numNodes) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Numbers of Nodes: " + numNodes);
            } else if (index == 0) {
                Node temp = head;
                head = head.next;
                numNodes--;
                return temp.getData();
            } else {
                Node previous = head;
                for (int i = 1; i < index; i++) {
                    previous = previous.next;
                }
                Node temp = previous.next;
                previous.next = previous.next.next;
                numNodes--;
                return temp.getData();
            }
        }
        return null;
    }

    public boolean remove(E element) {
        Node current = head;
        for (int i = 0; i < numNodes; i++) {
            if (current.getData().equals(element)) {
                remove(i);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> newLinkedList = new MyLinkedList<>();
        Node current = head;
        for (int i = 0; i < numNodes; i++) {
            newLinkedList.addLast(current.getData());
            current = current.next;
        }
        return newLinkedList;
    }

    public boolean contains(E object) {
        Node current = head;
        for (int i = 0; i < numNodes; i++) {
            if (current.getData().equals(object)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(E object) {
        Node current = head;
        for (int i = 0; i < numNodes; i++) {
            if (current.getData().equals(object)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public E get(int index) {
        if (numNodes > 0) {
            if (index < 0 || index >= numNodes) {
                throw new IndexOutOfBoundsException("Index: " + index + " out of bounds");
            } else {
                Node current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                return current.getData();
            }
        }
        return null;
    }

    public E getFirst() {
        return head.getData();
    }

    public E getLast() {
        Node current = head;
        for (int i = 1; i < numNodes; i++) {
            current = current.next;
        }
        return current.getData();
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }
}
