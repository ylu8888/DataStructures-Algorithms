class ContainsDuplicate{
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
