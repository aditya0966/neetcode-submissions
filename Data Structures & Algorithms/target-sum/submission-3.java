class Solution {
    private Map<String, Integer> memo = new HashMap<>();

    private int valid(int i, int[] nums, int target) {
        if (i == nums.length) {
            if (target == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        String key = i + "," + target;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int sum = valid(i + 1, nums, target - nums[i]);
        int sub = valid(i + 1, nums, target + nums[i]);

        memo.put(key, sum + sub);
        return sum + sub;
    }

    public int findTargetSumWays(int[] nums, int target) {
        memo.clear();
        return valid(0, nums, target);
    }
}