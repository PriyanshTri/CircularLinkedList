package myinterface;

public interface MySinglyCircularLinkedListADT {
    boolean isEmpty();
    void addFirst(int element);
    void addLast(int element);
    int removeFirst();
    int size();
    void traverse();
    int sizeByTraversing();
}
