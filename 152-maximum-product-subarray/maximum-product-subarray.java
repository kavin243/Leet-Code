class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int pro = nums[0];
        int min = nums[0];
        for (int i = 1; i < n; i++) {
            int temp=pro;
            pro = Math.max(nums[i], Math.max(pro * nums[i], min * nums[i]));
            min = Math.min(nums[i], Math.min(temp * nums[i], min * nums[i]));
            max = Math.max(pro, max);
        }
        return max;
    }
}