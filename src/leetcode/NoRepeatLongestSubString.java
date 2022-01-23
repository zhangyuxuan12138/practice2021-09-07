package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 *
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/solution/wu-zhong-fu-zi-fu-de-zui-chang-zi-chuan-by-leetc-2/
 *
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 *
 * 输入: s = ""
 * 输出: 0
 *  
 *
 * 提示：
 *
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 *
 * @author: zhangyuxuan
 * @date: 2022/1/22 下午5:29 周六
 */
public class NoRepeatLongestSubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstringForHashMap("axpwpek"));
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int length = s.length();
        int rightPoint = -1, maxCount = 0;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (rightPoint + 1 < length && set.add(s.charAt(rightPoint + 1))) {
                rightPoint++;
            }
            maxCount = Math.max(maxCount, rightPoint - i + 1);
        }
        return maxCount;
    }

    public static int lengthOfLongestSubstringForHashMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)){
                start = Math.max(map.get(ch)+1,start);
            }
            max = Math.max(max,end - start + 1);
            map.put(ch,end);
        }
        return max;
    }
}
