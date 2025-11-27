package Com.Leetcode;

class SumofTwoNumber3 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
    	SumOfTwoNumber sol = new SumOfTwoNumber();
    	int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = sol.twoSum(nums3, target3);
        System.out.println("Example 3 Output: [" + result3[0] + ", " + result3[1] + "]");
    }
}
