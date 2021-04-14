package cn.jater.learn.leetcode.two_pointers;

public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, res = 0;
        while (left < right) {
            res = height[left] < height[right]?
                    Math.max(res, (right - left) * height[left++]):
                    Math.max(res, (right - left) * height[right--]);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int max = solution.maxArea(height);
        System.out.println(max);
    }
}
