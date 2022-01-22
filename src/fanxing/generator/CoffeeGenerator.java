package fanxing.generator;

import java.util.Iterator;
import java.util.Random;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/10/17 下午10:17 周日
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {//实现Iterable接口，就可以做foreach循环语法糖，就像List等集合一样
    private final Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    private static final Random random = new Random(47);

    public CoffeeGenerator() {
    }

    private int size = 0;

    public CoffeeGenerator(int sz) {
        size = sz;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(5)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {//迭代器内部类，迭代器可以获取容器的相关属性和参数，通过hasNext()和next()方法操纵容器元素
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {//返回迭代器
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(coffeeGenerator.next());
        }
        for (Coffee coffee : new CoffeeGenerator(5)) {
            System.out.println(coffee);
        }
    }
}
