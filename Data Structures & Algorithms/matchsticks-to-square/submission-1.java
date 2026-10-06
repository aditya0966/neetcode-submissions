class Solution {

    private boolean valid(int stt,int[] arr,int[] nums,int length){

        if(stt == nums.length){
            return true;
        }

        for(int i = 0;i < 4;++i){
            if(nums[stt] + arr[i] > length){
                continue;
            }
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }

            arr[i] += nums[stt];
            if(valid(stt+1,arr,nums,length)){
                return true;
            }
            arr[i] -= nums[stt];
            // return true;
        }
        return false;
    }

    private void reverse(int[] nums){
        int st = 0;
        int end = nums.length - 1;

        while(st <= end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }

    public boolean makesquare(int[] nums) {
        int sum = 0;

        for(int i : nums){
            sum += i;
        }

        if(sum % 4 != 0){
            return false;
        }

        int[] arr = new int[4];
        int length = sum/4;
        Arrays.sort(nums);
        reverse(nums);
        return valid(0,arr,nums,length);
    }
}