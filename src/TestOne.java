import java.util.ArrayList;
import java.util.HashMap;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/9/7 上午9:21 周二
 */
public class TestOne {
    public static void main(String[] args) {
        try {
            double d = 1.0;
            double dd = d/0;
            System.out.println(dd);
            float f = 1f;
            System.out.println(f/0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
