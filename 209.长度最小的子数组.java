/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 滑动窗口左界，右界
        int left = 0, right = 0;
        // 窗口内值的和
        int sum = 0;
        // 结果
        int result = Integer.MAX_VALUE;
        while (right < nums.length) {
            // 滑动窗口里面的和
            sum += nums[right];
            // 如果滑动窗口里面的值小于target
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
            right++;
        }
        return Objects.equals(result, Integer.MAX_VALUE) ? 0 : result;
    }
}
// @lc code=end

