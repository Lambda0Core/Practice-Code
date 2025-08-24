import java.util.HashMap;
import java.util.Map;

public class TwoSumPractice {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }

            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solutions");
    }

    public static void main(String[] args) {
        TwoSumPractice solution = new TwoSumPractice();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        if (result != null) {
            System.out.println("Index 1: " + (result[0] + 1));
            System.out.println("Index 2: " + result[1]);

        } else {
            System.out.println("No two sum solutions");
        }
    }
}