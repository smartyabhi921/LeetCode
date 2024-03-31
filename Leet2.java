import java.util.*;

class Solution {
    public int countSubarrays(int[] nums, int minK, int maxK) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                if (min == minK && max == maxK)
                    result++;
            }
        }
        return result;
    }
}

public class Leet2 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 2, 7, 5 };
        int minK = 1;
        int maxK = 5;
        System.out.println(new Solution().countSubarrays(nums, minK, maxK)); // Output: 2
    }
}
