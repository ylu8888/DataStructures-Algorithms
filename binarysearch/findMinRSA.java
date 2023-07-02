class findMinRSA {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = (left + right)/2;
            //if middle element is greater than rightmost, its not sorted properly
            if(nums[mid] > nums[right]){  
                left = mid+1;   //thus change the left pointer to the middle
            }
            else{
                right = mid;   
            }
        }

        return nums[left]; //the left will always be the pivot index after while loop finishes
    }
}
