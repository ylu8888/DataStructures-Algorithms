class validPalindrome{
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\W+", "");
        s= s.replaceAll("_", "");

        int i = 0;
        int j = s.length() - 1;

        while(i < s.length()/2){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
