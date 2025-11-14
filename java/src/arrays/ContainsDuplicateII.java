package arrays;// Challenge: https://leetcode.com/problems/contains-duplicate-ii/?envType=problem-list-v2&envId=sliding-window

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        java.util.Map<Integer, Integer> window = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer pos = window.get(nums[i]);

            if (pos != null && (i-pos) <= k) {
                return true;
            }

            window.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateII solution = new ContainsDuplicateII();

        System.out.println(solution.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        System.out.println(solution.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        System.out.println(solution.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}


/** Examples
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */