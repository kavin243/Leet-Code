class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            int c=2;
            while(c<=i)
            {
                temp.add(ans.get(i-1).get(c-2)+ans.get(i-1).get(c-1));
                c++;
            }
            if(i!=0)
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
}