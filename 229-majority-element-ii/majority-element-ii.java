class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        float l=n/3;
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            hs.add(nums[i]);
        }
        for(int x:hs)
        {
            if(hm.get(x)>l)
            {
                ans.add(x);
            }
        }
        return ans;
    }
}