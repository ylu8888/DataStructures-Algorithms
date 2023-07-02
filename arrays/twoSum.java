// O(n^2) Nested for loops (inner loop uses int j = i + 1), Optimal: O(n) check hashmap that counts indices of each number in array if it contains the complement = nums[i] - target;

class twoSum{
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
       
        for(int i = 0; i < nums.length; i++){
            
            int complement = target - nums[i]; 

            if(map.containsKey(complement)){
                return new int [] {i, map.get(complement)};
            }
            else{
                map.put(nums[i], i);
            }
        }

        return new int [] {};
    }
}
