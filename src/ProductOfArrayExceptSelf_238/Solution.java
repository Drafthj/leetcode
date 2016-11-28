package ProductOfArrayExceptSelf_238;

import java.util.Arrays;

/**
 * Created by drafthj on 2016/11/28 13:38.
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] products = new int[length];
        products[0] = 1;
        for(int i = 1;i<length;i++) {
            products[i] = products[i - 1] * nums[i-1];
        }
        int right = 1;
        for(int i = length-1;i>=0;i--){
            products[i] *= right;
            right = right*nums[i];
        }
        return products;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().productExceptSelf(new int[]{1,2,3,4})));
    }
}