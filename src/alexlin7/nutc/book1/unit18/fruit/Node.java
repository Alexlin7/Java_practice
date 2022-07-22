package alexlin7.nutc.book1.unit18.fruit;

public class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

}
