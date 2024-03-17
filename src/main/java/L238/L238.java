package L238;

public class L238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int left = 1, right = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}
