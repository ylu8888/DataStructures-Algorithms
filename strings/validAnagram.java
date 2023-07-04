class validAnagram {
    public boolean isAnagram(String s, String t) {
        char [] chars = s.toCharArray();
        char [] chars2 = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars2);

        String s1 = new String(chars);
        String s2 = new String(chars2);

        return s1.equals(s2);
        
    }
}
