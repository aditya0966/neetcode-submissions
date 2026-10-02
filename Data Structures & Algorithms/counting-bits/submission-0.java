class Solution {
    public int[] countBits(int n) {
        
        // int count = 0;
        int[] nums = new int[n+1];
        nums[0] = 0;

        for(int i = 1;i <= n;i++){
            int temp = i;
            int count = 0;
            while(temp > 0){
                count += (temp & 1);
                temp >>= 1;
            }
            nums[i] = count;
        }
        return nums;
    }
}
