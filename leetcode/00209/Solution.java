/**
 * Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int minLength = nums.length;
        while (right < nums.length) {
            if (sum == s && right - left < minLength) {
                minLength = right - left;
            }
        }
    }
}
