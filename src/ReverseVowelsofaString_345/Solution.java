package ReverseVowelsofaString_345;

import java.util.Arrays;

/**
 * Created by drafthj on 2016/11/18 9:39.
 */
public class Solution {
    public final static char[] vowels = new char[]{'A','E','I','O','U','a','e','i','o','u'};
    private boolean contains(char c){
        return Arrays.binarySearch(vowels,c)>-1;
    }
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0,end=chars.length-1;
        while(start < end){
            while (start<end){
                if(contains(chars[start])){
                    break;
                }
                start++;
            }
            while (end>start){
                if(contains(chars[end])){
                    break;
                }
                end--;
            }
            if(start>=end)break;
            char t = chars[start];
            chars[start++] = chars[end];
            chars[end--] = t;
        }
        return new String(chars);
    }
}
