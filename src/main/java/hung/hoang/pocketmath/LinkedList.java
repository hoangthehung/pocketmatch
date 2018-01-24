/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung.hoang.pocketmath;

/**
 *
 * @author hoanghung
 */
public class LinkedList<T> {

    private LinkedListNode<T> first;

    public LinkedList() {
        this.first = null;
    }

    
    public void insert(LinkedListNode<T> node) {
        node.setNext(first);
        first = node;
    }
    
    public boolean add(LinkedListNode<T> node){
        LinkedListNode<T> current = first;
        while (current.getNext() != null) current = current.getNext();
        current.setNext(node);
        return true;
    }
    public LinkedListNode<T> get(int index){
        int i = 0;
        LinkedListNode<T> current = first;
        while (current.getNext() != null && i < index){
            current = current.getNext();
            i++;
        }
        if (i == index) return current;
        else
            throw new IndexOutOfBoundsException("Out of index in LinkedList");
    }
    
    public void remove() {
        if (first.getNext() != null) {
            first = first.getNext();
        } else {
            first = null;
        }
    }
    
    
    private void printList(LinkedListNode<T> node) {
        System.out.println("Node is " + node.getValue());
        if (node.getNext() != null) {
            printList(node.getNext());
        }
    }

    public void print() {
        printList(first);
    }

}
class LinkedListNode<T> {

    private T value;
    private LinkedListNode<T> next;

    public LinkedListNode(T value) {
        this.value = value;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }
}
