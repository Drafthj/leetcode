package PlusOne_66;

/**
 * Created by drafthj on 2016/11/21 10:06.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int length;
        length = digits.length;
        int t = digits[length-1]+1;
        int i;
        for(i = length-2;i>=0;i--){
            if(t == 10){
                digits[i+1] = 0;
                t = digits[i]+1;
            }else{
                digits[i+1] = t;
                break;
            }
        }
        int num[];
        if(t == 10) {
            num = new int[length + 1];
            num[0] = 1;
            return num;
        }

        if(i==-1){
            digits[0] = t;
            return digits;
        }
        else{
            return digits;
        }
    }
}
