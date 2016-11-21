package FindTheDifference_389;

/**
 * Created by drafthj on 2016/11/18 13:37.
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        int num[] = new int[123];
        int length = s.length();
        for(int i = 0;i<length;i++){
            num[sa[i]]++;
            num[ta[i]]++;
        }
        num[ta[length]]++;
        for(int i = 0;i<num.length;i++){
            if(num[i]%2==1)
                return (char) i;
        }
        return ' ';
    }
}
