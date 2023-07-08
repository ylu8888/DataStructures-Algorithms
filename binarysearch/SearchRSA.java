class SearchRSA{
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int pivot = pivot(nums);

        if(target >= nums[pivot] && target <= nums[right]){
            left = pivot;
        }else if(target >= nums[pivot] && target > nums[right]){
            right = pivot;
        }

        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return -1;
    }

    public int pivot(int [] nums){
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = (left + right)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }

        return left;
    }
}
