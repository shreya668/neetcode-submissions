class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> visited = new HashMap<>();
        int maxL = 0;

        while(j < s.length()) {
            char current = s.charAt(j);
            int currL = (j-i);
            //System.out.println("i j" + i +" "+ j);
            if(visited.containsKey(current)) {
                maxL = Math.max(currL, maxL);
                int nextLeft = visited.get(current)+1;
                while(i < nextLeft) {
                    //System.out.println("Update i " + i);
                    visited.remove(s.charAt(i));
                    i++;
                }
            } else {
                maxL = Math.max(currL+1, maxL);
            }

            visited.put(current, j);
            j = j+1;
        }

        return maxL;
    }
}













