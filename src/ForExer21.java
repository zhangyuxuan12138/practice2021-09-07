/**
 * @description:
 * @author: zhangyuxuan
 * @date: 2021/10/28 下午10:15 周四
 */
public class ForExer21 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            if(i % 2 == 1 ){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("" + sum);
    }
}
