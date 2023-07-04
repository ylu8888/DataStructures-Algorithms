class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        List<String> arr = new ArrayList<>();
        List<String> newArr = new ArrayList<>();

        for(String s: strs){
            newArr.add(s);
        }

        while(!newArr.isEmpty()){
            arr = new ArrayList<>();
            arr.add(newArr.get(0));
            String temp = newArr.get(0);
            arr.remove(0);

            List<String> copy = new ArrayList<>(newArr);
            for(String s: copy){
                if(isAnagram(temp, s)){
                    arr.add(s);
                    newArr.remove(s);
                }
            }

            list.add(arr);
        }
        

        return list;

    }

    public boolean isAnagram(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }

        for(char c: t.toCharArray()){
            if(map.containsKey(c)){
                int count = map.get(c);
                if(count == 1){
                    map.remove(c);
                }else{
                    map.put(c, map.get(c) -1);
                }
            }else{
                return false;
            }
        }

        return true;
        
    }
}
