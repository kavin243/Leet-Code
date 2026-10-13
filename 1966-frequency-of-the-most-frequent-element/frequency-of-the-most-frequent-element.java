class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        long sum=0;
        int l=0,max=0;
        for(int e=0;e<n;e++)
        {
            
            sum=sum+nums[e];
            
            while((long)(e-l+1)*nums[e]>sum+k)
            {
                sum=sum-nums[l];
                l++;
            }
            max=Math.max((e-l+1),max);
        }
        return max;
    }
}