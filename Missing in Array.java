class Solution {
    int missingNum(int arr[]) {
        // code here
        long big=0;
        long sum =0;
        long len =arr.length;
        for (int i=0;i<len;i++)
        {
            sum=sum+arr[i];
            if(arr[i]>big)
            {
                big=arr[i];
            }
        }
        long a=big*(big+1);
        a=a/2;
        long ans=a-sum;
        int aa=(int)ans;
        if(ans ==0){
            return (int)big+1;
        }
        return aa;

    }
}