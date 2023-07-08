//Sort Characters By Frequency

class SortCharByFreq {
    public String frequencySort(String s) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Character, Integer> map = new HashMap <>();
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }

        for(char key: map.keySet()){
            heap.add(map.get(key));
        }
        
        while(!heap.isEmpty()){
            for(char c: s.toCharArray()){
                if(map.get(c) == heap.peek()){
                    int len = heap.remove();
                    for(int i = 0; i < len; i++){
                        sb.append(c);
                    }
                    map.remove(c);
                    break;
                }
            }
        }

        return sb.toString();
    }
}
