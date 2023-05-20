class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int middle = 0;

        while (l <= r) {
            middle = l + ((r - l) / 2);

            if (target > nums[middle]) {
                l = middle + 1;
            } else if (target < nums[middle]) {
                r = middle - 1;
            } else {
                return middle;
            }
        }

        return l;
    }
}
