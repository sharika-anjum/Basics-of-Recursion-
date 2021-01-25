package com.company;

public class ReversePairs {
    public static void main(String args[]) {
        int[] num = {1, 3,2,3,1};
        System.out.println(reversePairs(num));
    }
    public static int reversePairs(int[] nums) {
        return reversePairsHelper(nums, 0, nums.length - 1);
    }

    private static int reversePairsHelper(int [] nums, int l, int r){
        if(l >= r ) return 0;

        int m = l + ((r - l) >> 1);
        int ans = reversePairsHelper(nums, l, m) + reversePairsHelper(nums, m + 1, r);

        int left = l, right = m + 1, i = 0, pair = m + 1;
        int [] merge = new int[r - l + 1];

        while(left <= m){
            // search
            while(pair <= r && nums[left] > 2L * nums[pair]) pair++;
            ans += pair - (m + 1);

            // merge (insert)

            while(right <= r && nums[left] >= nums[right]) merge[i++] = nums[right++];
            merge[i++] = nums[left++];
        }

        // add the leftover from right to r;
        while(right <= r) merge[i++] = nums[right++];

        System.arraycopy(merge, 0, nums, l, merge.length);

        return ans;
    }

}
