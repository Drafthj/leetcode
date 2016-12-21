package NumberOf1Bits_191;

/**
 * Created by drafthj on 2016/12/21 14:31.
 */
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0){
            count = count + (n&1);
            n = n >>> 1;
        }
        return count;
    }
}
