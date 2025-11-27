package Com.Leetcode;

class SumofTwoNumber {
    public int[] twoSum(int[] nums, int target2) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target2) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
    	  SumOfTwoNumber sol = new  SumOfTwoNumber ();
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = sol.twoSum(nums2, target2);
        System.out.println("Example 2 Output: [" + result2[0] + ", " + result2[1] + "]");

    }
}
