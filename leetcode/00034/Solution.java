public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        int mid;

        while (left <= right) {
            mid = left + (right-left) / 2;
            if (nums[mid] == target) {
                int leftEnd = findLeft(nums, left, mid-1, target);
                int rightEnd = findRight(nums, mid+1, right, target);
                return new int[]{leftEnd, rightEnd};
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        // Can't find the target.
        return new int[]{-1, -1};
    }

    /**
     * Find the left range index of the target.
     * [1, 2, 3, 4] target = 4, left = 0, right = 3
     * mid = 1, nums[mid] = 2
     * 2 != 4, left = 1
     * ---
     * mid = 2, nums[mid] = 3
     * left = 3
     * ---
     * mid = 4
     */
    public int findLeft(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right-left) / 2;
            if (nums[mid] == target) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int findRight(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {};
        int[] result = s.searchRange(nums, 0);
        System.out.println(result[0] + "," + result[1]);
    }
}
