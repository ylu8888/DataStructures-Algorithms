class productOfArray {
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int [nums.length];
        int prod = 1;

        ans[0] = 1; //[1, 2, 3, 4]
        
        for(int i = 1; i < nums.length; i++){
            prod *= nums[i-1];   //[1, 1, 2, 6]  
            ans[i] = prod;
        }

        prod = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            prod *= nums[i+1];   //[24, 12, 4, 1]
            ans[i] *= prod;
        }

        //[24,12,8,6]

        return ans;
    }
}
