public class Stack {
    public static void main(String[] args) {
        StackOperation so = new StackOperation();
        Node<Integer> firstNode = new Node<>(70);
        so.push(firstNode);
        Node<Integer> secondNode = new Node<>(30);
        so.push(secondNode);
        Node<Integer> thirdNode = new Node<>(56);
        so.push(thirdNode);
    }
}