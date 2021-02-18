package main;

import implimetation.MySinglyCircularLinkedList;

public class MyMain {
    public static void main(String[] args) {
        MySinglyCircularLinkedList cl=new MySinglyCircularLinkedList();
        System.out.println(cl.isEmpty());
        cl.traverse();
        System.out.println(cl.sizeByTraversing());
        cl.addFirst(20);
        cl.addLast(10);
        cl.addLast(100);
        cl.traverse();
        cl.sizeByTraversing();
        cl.removeFirst();
        cl.traverse();
        System.out.println(cl.size());
        System.out.println(cl.sizeByTraversing());
    }
}
