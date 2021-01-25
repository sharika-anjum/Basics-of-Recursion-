package com.company;
import java.util.*;

public class TwoSumProblem {
    public static void main(String args[]) {
        int[] num = {1, 2, 3, 4, 6,11};
        int tar = 10;
        System.out.println(twoSum(num, tar));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
