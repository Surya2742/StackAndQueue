public class Stack {
    public static void main(String[] args) {
        StackOperation so = new StackOperation();
        Node<Integer> firstNode = new Node<>(70);
        so.enqueue(firstNode);
        Node<Integer> secondNode = new Node<>(30);
        so.enqueue(secondNode);
        Node<Integer> thirdNode = new Node<>(56);
        so.enqueue(thirdNode);
        System.out.print("Linked List in Stack are : ");
        so.print();
    }
}