// Challenge: https://leetcode.com/problems/two-sum/description/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        java.util.Map<Integer, Integer> index = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (index.containsKey(target - num))
                return new int[]{index.get(target - num), i};

            index.put(num, i);
        }
        return new int[]{};
    }

    static void main() {
        TwoSum solution = new TwoSum();

        int[] result = solution.twoSum(new int[]{2,7,11,15}, 9);
        if (result.length > 1)
            System.out.println("[" + result[0] + ", " + result[1] + "]");

        result = solution.twoSum(new int[]{3,2,4}, 6);
        if (result.length > 1)
            System.out.println("[" + result[0] + ", " + result[1] + "]");

        result = solution.twoSum(new int[]{3,3}, 6);
        if (result.length > 1)
            System.out.println("[" + result[0] + ", " + result[1] + "]");

        result = solution.twoSum(new int[]{3,2,3}, 6);
        if (result.length > 1)
            System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}

/** EXAMPLES
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */