class 3Sum{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums); //first sort the array

        for(int i = 0; i < nums.length; i++){ 
            int left = i + 1;
            int right = nums.length - 1;  //nested for loop then solve 2Sum

            while(left < right){    //two pointers approach
                if(nums[left] + nums[right] + nums[i] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    temp.add(nums[i]);
                    set.add(temp); //use sets since they add *unique* elements
                    left++; 
                    right--;   //increment left/right ptrs otherwise infinite while loop
                }
                else if(nums[left] + nums[right] + nums[i] > 0){
                    right--;
                }
                else{
                    left++;
                }
            }

        }

        for(List<Integer> list: set){
            ans.add(list);
        }

        return ans;
    }
}
