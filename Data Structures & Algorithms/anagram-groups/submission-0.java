class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> sortMap = new HashMap<String, List<String>>();
        List<List<String>> result = new ArrayList<>();

        for(String s : strs) {
             // Step 1: convert to char array
            char[] chars = s.toCharArray();

            // Step 2: sort the array
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(sortMap.containsKey(sorted)) {
                sortMap.get(sorted).add(s);
            } else {
                sortMap.put(sorted, new ArrayList<>(List.of(s)));
            }
        }


        for(String s : sortMap.keySet()) {
            result.add(sortMap.get(s));
        }

        return result;

    }
}
