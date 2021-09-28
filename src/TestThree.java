import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/9/13 下午6:39 周一
 */
public class TestThree {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "1");
        String s = map.get("1") + "";
        System.out.println(s);
    }
}
