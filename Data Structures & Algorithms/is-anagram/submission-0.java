class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> charMap = new HashMap<>();

        for(char c : s.toCharArray()) {
            int count = 0;
            if(charMap.containsKey(c)) {
                count = charMap.get(c);
            }
            charMap.put(c, count+1);
        }

        for(char c : t.toCharArray()) {
             if(!charMap.containsKey(c)) return false;
             int count = charMap.get(c);
             if(count == 0) return false;
             charMap.put(c, count-1);

        }

        return true;

    }
}
