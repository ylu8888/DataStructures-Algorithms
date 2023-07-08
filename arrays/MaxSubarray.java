class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int right = 0;

        while(right < nums.length){
            sum += nums[right];
            max = Math.max(max, sum);

            if(sum < 0){
                sum = 0;
            }

            right++;
        }
        

        return max;
    }
}
