/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/9/13 下午3:15 周一
 */
public class TestTwo {
    public static void main(String[] args) {
        Integer integer;
        Integer integer1 = null;
        String s = "null";
        integer = s == null ? 0 : integer1;
        System.out.println(integer);
    }
}
