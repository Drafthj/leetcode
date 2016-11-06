package ZigZagConversion_6;

/**
 * Created by drafthj on 2016/11/6 15:22.
 */
public class Solution {
    public String convert(String s, int numRows) {
        int max_space = (numRows-1)*2;
        int length = s.length();
        if(length <= numRows||numRows==1){
            return s;
        }
        char[] array = s.toCharArray();
        StringBuffer result = new StringBuffer();
        int space[] = new int[2];
        int t;
        for(int i = 0;i<numRows;i++){
            space[0] = max_space-i*2;
            space[1] = i*2;
            int j = i;
            int count = 0;
            while(j < length){
                t = space[count++%2];
                if(t == 0)continue;
                result = result.append(array[j]);
                j = j + t;
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().convert("AB", 1));
    }
}
