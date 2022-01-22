package arithmetic.datastructure;

/**
 * @description: 手写的栈数据机构
 * @author: zhangyuxuan
 * @date: 2021/10/17 下午7:18 周日
 */
public class LinkedStack<T> {//LinkedStack相当于容器，存放链表的top节点，通过这个节点可以找到所有节点
    private static class Node<T> {//Node相当于容器中的节点，存放每一个具体的数据并指向下一个节点
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

    private Node<T> top = new Node<>();//对象创建时初始化top节点，其item和next都是null

    public void push(T item) {//向堆的顶部放入新的元素，并将栈顶指针（引用）指向新放入的元素
        top = new Node<>(item, top);//向栈中push元素，其实就是将新的Node节点赋值给top属性，同时将新节点的next属性指向原来的top节点
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {//只要堆非空，那就弹出元素，并将栈顶指针（引用）指向下一个节点
            top = top.next;//其实就是top属性指向下一个节点，已经弹出的节点，就不再进行引用了，如果没有其他地方引用，那就可以垃圾回收掉了
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
