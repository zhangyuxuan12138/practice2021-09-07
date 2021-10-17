package arithmetic.datastructure;

/**
 * @description: 手写的栈数据机构
 * @author: zhangyuxuan
 * @date: 2021/10/17 下午7:18 周日
 */
public class LinkedStack<T> {
    private static class Node<T> {
        T item;
        Node<T> next;

        Node() {
            item = null;
            next = null;
        }

        Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>();

    public void push(T item) {
        top = new Node<>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> stringLinkedStack = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            stringLinkedStack.push(s);
        }
        String s;
        while ((s = stringLinkedStack.pop()) != null) {
            System.out.println(s);
        }
    }
}
