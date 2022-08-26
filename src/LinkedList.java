public class LinkedList<K> {
    public INode<K> head;
    public INode<K> tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode) {
        if(this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            newNode.setNext(this.head);
            this.head= newNode;
        }
    }

    public INode<K> peak() {
        return this.head;
    }

    public void append(INode<K> myNode) {
        if (this.tail == null)
            this.tail = myNode;
        if (this.head == null) {
            this.head = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public INode<K> pop() {
        INode<K> tempNode = this.head;
        this.head = tempNode.getNext();
        tempNode.setNext(null);
        return tempNode;
    }

    public void popLast() {
        INode<K> tempNode = this.head;
        if (tempNode.getNext().getNext() != null) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(null);
    }

    public void print() {
        INode<K> temp = head;
        while(temp != null) {
            System.out.print(temp);
            temp = temp.getNext();
        }
        System.out.println();
    }
}