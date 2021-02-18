/* implementation of
singly circular linked list
 */

package implimetation;


import myinterface.MySinglyCircularLinkedListADT;

public class MySinglyCircularLinkedList implements MySinglyCircularLinkedListADT {
    private int size;
    private Node tail;

    public MySinglyCircularLinkedList() {
        size = 0;
        tail = null;
    }
    @Override
    public boolean isEmpty(){
        return tail==null;
    }
    @Override
    public void addFirst(int element) {
        Node node = new Node(element);
        if(isEmpty()){
            tail=node;
            node.setNext(node);
        }
        else{
            node.setNext(tail.getNext());
            tail.setNext(node);
        }
        size++;
    }

    @Override
    public void addLast(int element) {
        Node node=new Node(element);
        if(!isEmpty()){
            node.setNext(tail.getNext());
            tail.setNext(node);
            tail=node;
        }
        else{
            tail=node;
            node.setNext(tail);
        }
        size++;
    }

    @Override
    public int removeFirst() {
        int response=0;//considering 0 as invalid data
        if(!isEmpty()){
            if(tail==tail.getNext()){
                tail=null;
            }
            else{
                response=tail.getNext().getData();
                tail.setNext(tail.getNext().getNext());
            }
            size--;
        }
        return response;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void traverse() {

    }

    @Override
    public int sizeByTraversing() {
        return 0;
    }

}
