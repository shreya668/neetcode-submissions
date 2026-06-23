class Solution {

    public void createSets(int[] nums, int currIndex, int maxLen, List<List<Integer>> result, List<Integer> temp) {

        if(temp.size() == maxLen) {
            //System.out.println("max size " + temp.size());
            result.add(new ArrayList<>(temp));
            return;
        }

        if(currIndex >= nums.length) {
            return;
        }

        temp.add(nums[currIndex]);
        createSets(nums, currIndex+1, maxLen, result, temp);
        temp.remove(temp.size()-1);
        createSets(nums, currIndex+1, maxLen, result, temp);
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        //for(int i = 0; i < nums.length; i++) {
        List<Integer> temp = new ArrayList<>();
        

        for(int j = 0; j <= nums.length; j++ ) {
            createSets(nums, 0, j, result, temp);
        }
        //}

        return result;
        
    }
}
