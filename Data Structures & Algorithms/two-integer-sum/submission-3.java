class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, List<Integer>> arraySet = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            arraySet.putIfAbsent(nums[i], new ArrayList<Integer>());
            arraySet.get(nums[i]).add(i);
        }

        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            System.out.println("debug "+i +" " + (target-nums[i]));
            int diff = target-nums[i];
            if(diff == nums[i]) {
                if(arraySet.get(diff).size() > 1) {
                    result[0] = arraySet.get(diff).get(0);
                    result[1] = arraySet.get(diff).get(1);
                    break;
                }
                continue;
            }

            if(arraySet.containsKey(diff)) {
                result[0] = i;
                result[1] = arraySet.get(diff).get(0);
                break;
            }
        }

        Arrays.sort(result);
        return result;
    }
}