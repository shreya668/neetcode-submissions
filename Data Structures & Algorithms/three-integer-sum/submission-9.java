class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
         List<List<Integer>> result = new ArrayList<>();
         HashSet<String> visited = new HashSet<>();

        while(i < nums.length-2) {
            int l = i+1;
            int r = nums.length-1;
            int target = -nums[i];

            while(l < r) {
                int sum = nums[l] + nums[r];
                if(sum == target) {
                    String v = String.valueOf(nums[i]) + String.valueOf(nums[l]) + String.valueOf(nums[r]);
                    if(!visited.contains(v)) {
                        result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        visited.add(v);
                    }
                    l++;r--;

                } else {
                    if(sum > target) r--;
                    else l++;
                }
                
            }
            i++;
        }

        return result;
    }
}
