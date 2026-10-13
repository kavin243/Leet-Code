class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean[] arr=new boolean[n];
        
        for(int i=2;i<n;i++)
        {
            arr[i]=true;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==true)
            {
                for(int j=i*2;j<n;j=j+i)
                {
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(arr[i]==true)
            {
                count++;
            }
        }
        return count;
    }
}