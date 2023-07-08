class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int max = 0;

        while(end < s.length()){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            else{
                set.add(s.charAt(end));
                end++;
                max = Math.max(max, end - start);
            }
        }

        return max;
    }
}
