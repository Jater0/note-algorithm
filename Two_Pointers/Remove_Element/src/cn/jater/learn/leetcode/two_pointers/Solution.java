package cn.jater.learn.leetcode.two_pointers;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int num : nums) {
            if (num != val) {
                nums[i] = num;
                i++;
            }
        }
        System.out.println(nums);
        return i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 2;
        int index = solution.removeElement(nums, val);
        System.out.println(index);
    }
}
