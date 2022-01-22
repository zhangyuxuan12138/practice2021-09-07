package fanxing.generator.adapter;

import fanxing.generator.Generator;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/10/17 下午10:46 周日
 */
public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.println(fibonacci.next());
        }
    }
}
