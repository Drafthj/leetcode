package TwoSum_1;

import java.util.*;

/**
 * Created by drafthj on 2016/11/6 23:47.
 */
public class Solution {
    class Node{
        private int key;
        private int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        List<Node> nodes = new ArrayList<>();
        for(int i=0;i<length;i++){
            nodes.add(new Node(i,nums[i]));
        }
        Collections.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                    int v1 = o1.getValue();
                    int v2 = o2.getValue();
                    return v1>v2?1:v1==v2?0:-1;
            }
        });
        int start = 0;
        int end = length-1;
        int t;
        Node n1,n2;
        while (start<end){
            n1 = nodes.get(start);
            n2 = nodes.get(end);
            t = n1.getValue()+n2.getValue();
            if(t == target){
                return new int[]{n1.getKey(),n2.getKey()};
            }
            if(t < target)start++;
            if(t > target)end--;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{0,4,3,0},0)));
    }
}
