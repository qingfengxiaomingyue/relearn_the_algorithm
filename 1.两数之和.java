/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length < 2) {
            return res;
        }
        // key: 数字，value: 数字对应的索引
        Map<Integer, Integer> map = new HashMap<>();
        // 遍历数组，寻找是否存在 complement = target - nums[i]
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // 如果存在 complement，则返回 complement 的索引和当前数字的索引
            if(map.containsKey(complement)) {
                res[0] = map.get(complement);
                res[1] = i;
                return res;
            }
            // 将当前数字和索引存入哈希表中
            map.put(nums[i], i);
        }
        return res;
    }
}
// @lc code=end

