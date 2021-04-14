# Algorithm
> Order By Methods

## Two Pointers(双指针法)
### Description

### Demo
#### Remove Element(Easy)
```Java
public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int num : nums) {
            if (num != val) {
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
}
```

-----

#### Remove Duplicates from Sorted Array(Easy): 删除有序数组中的重复项

> Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
> Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
> Clarification:
> Confused why the returned value is an integer but your answer is an array?
> Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.



> 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
> 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
> 说明:
> 为什么返回数值是整数，但输出的答案是数组呢?
> 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。

```java
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
```

-----

#### Container With Most Water(Middle)

```Java
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
}
```

-----

#### Smallest Range Covering Elements from K Lists(Hard)

