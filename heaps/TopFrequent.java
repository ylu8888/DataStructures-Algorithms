class TopFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        int [] arr = new int[k];

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        for(int key: map.keySet()){
            heap.add(map.get(key));
        }

        for(int i = 0; i < k; i++){
            for(int j = 0; j < nums.length; j++){
                if(map.get(nums[j]) == heap.peek()){
                    heap.remove();
                    map.remove(nums[j]);
                    arr[i] = nums[j];
                    break;
                }
            }
        }

        return arr;
    }
}
