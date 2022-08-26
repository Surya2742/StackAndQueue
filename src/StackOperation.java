public class StackOperation {
    LinkedList linkedList = new LinkedList();
    public void push(INode element) {
        linkedList.add(element);
    }

    public void peak() {
        System.out.println(linkedList.peak());
    }

    public void pop() {
        System.out.println(linkedList.pop());
    }

    public boolean isEmpty() {
        if(linkedList.head == null) {
            return true;
        }
        else
            return false;
    }

}
