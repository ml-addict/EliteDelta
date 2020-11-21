public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        int mid;

        while (left < right) {
            mid = left + (right / 2);
            if (nums[mid] == target) {
                int leftEnd = findLeft(nums, left, mid-1, target);
                int rightEnd = findRight(nums, mid+1, right, target);
                return new int[]{leftEnd, rightEnd};
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        // Can't find the target.
        return new int[]{-1, -1};
    }

    public int findLeft(int[] nums, int left, int right, int target) {
        while (left < right) {
            mid = left + (right / 2);
            if (nums[mid] == target) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }

    public int findRight(int[] nums, int left, int right, int target) {
        return 0;
    }
}
