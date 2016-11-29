package LengthofLastWord_58;

/**
 * Created by drafthj on 2016/11/29 9:23.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        char[] cc = s.toCharArray();
        int length = cc.length;
        int fact_length = length;
        if(length == 0)return 0;
        for(int i = length-1;i>=0;i--){
            if(cc[i]==' '){
                fact_length--;
            }else {
                break;
            }
        }
        int max = 0;
        for(int i =0;i<fact_length;i++){
            max = cc[i]==' '?0:max+1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("b   a    "));
    }
}
