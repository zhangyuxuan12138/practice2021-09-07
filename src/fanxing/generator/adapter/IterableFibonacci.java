package fanxing.generator.adapter;

import java.util.Iterator;

/**
 * @description: 想让Fibonacci具有循环遍历的特性，可是又不想修改Fibonacci类使其实现Iterable接口；
 * 那么就采用适配器模式，写一个新的类，extends继承Fibonacci类并implements实现Iterable接口；
 * 这样extends继承可以保留原有Fibonacci类的属性和方法，implements实现又得到了循环特性。
 * @author: zhangyuxuan
 * @date: 2021/10/17 下午10:52 周日
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;//需要传入一个数，让hasNext方法判断结束

    public IterableFibonacci(int count) {
        n = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }
        };
    }

    public static void main(String[] args) {
        for (Integer integer : new IterableFibonacci(18)) {
            System.out.println(integer);
        }
    }
}
