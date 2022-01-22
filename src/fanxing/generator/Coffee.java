package fanxing.generator;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/10/17 下午9:57 周日
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
