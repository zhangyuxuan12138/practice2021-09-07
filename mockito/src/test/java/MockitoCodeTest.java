import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/10/4 下午7:44 周一
 */
public class MockitoCodeTest {
    @Test
    @SuppressWarnings("unchecked")
    public void test1() {
        List<String> mock = Mockito.mock(List.class);
        Mockito.when(mock.get(0)).thenReturn("123");
        mock.get(0);
        Mockito.verify(mock).get(0);
    }
}
