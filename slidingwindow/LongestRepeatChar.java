class LongestRepeatChar{
    public int characterReplacement(String s, int k) {
        HashSet<Character> map = new HashSet<>();
        int max = 1;
        int count = 0;
        int temp = k;

        for(int i = 0; i < s.length(); i++){
            map = new HashSet<>();
            count = 0;
            map.add(s.charAt(i));
            k = temp;
           
            for(int j=i; j < s.length(); j++){
                if(map.contains(s.charAt(j))){
                    count++;
                    if(count > max){
                        max = count;
                    }
                }
                else{ 
                  if(k != 0){
                    count++;
                    if(count > max){
                    max = count;
                    }
                    k--;
                    }
                  else{
                    break;
                  }
                    
                    
                }
            }
        }
    
    
        

        return max;
    }
}
