class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>();
        int maxSeqLen = 0;

        for(int i = 0; i < nums.length; i++) {
            if(visited.containsKey(nums[i])) continue;
            int nextNum = nums[i]+1;
            int currSeqLen = 1;
            ArrayList<Integer> toProcess = new ArrayList<>();
            toProcess.add(nums[i]);

            while(set.contains(nextNum)) {
                if(visited.containsKey(nextNum)) {
                    currSeqLen += visited.get(nextNum);
                    break;
                } else {
                    toProcess.add(nextNum);
                    nextNum++;
                    currSeqLen++;

                }
            }

            for(int visit : toProcess) {
                visited.put(visit, currSeqLen);
            }

            if(currSeqLen > maxSeqLen) {
                maxSeqLen = currSeqLen;
            }
             
        }

        return maxSeqLen;

    }
}
