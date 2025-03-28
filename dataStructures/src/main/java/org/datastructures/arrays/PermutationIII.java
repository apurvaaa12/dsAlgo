package org.datastructures.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationIII {
    public static void main(String[] args) {
        int n = 4;
        int[][] output = permute(n);
        for(int i=0;i< output.length;i++){
            System.out.println(Arrays.toString(output[i]));
        }
    }

    public static int[][] permute(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        boolean[] used = new boolean[n];

        int[] candidate = new int[n];

        List<List<Integer>> result = new ArrayList<>();

        helper(nums, 0, used, candidate, result);

        int[][] output = new int[result.size()][n];
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < n; j++) {
                output[i][j] = result.get(i).get(j);
            }
        }

        return output;
    }

    static void helper(int[] nums, int pos, boolean[] used, int[] candidate, List<List<Integer>> result) {
        if (pos == nums.length) {
            List<Integer> permutations = new ArrayList<>();
            for (int i = 0; i < candidate.length; i++) {
                permutations.add(candidate[i]);
            }
            result.add(permutations);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                if (pos == 0 || candidate[pos - 1] % 2 != nums[i] % 2) {
                    candidate[pos] = nums[i];
                    used[i] = true;
                    helper(nums, pos + 1, used, candidate, result);
                    used[i] = false;
                }
            }
        }
    }


}
