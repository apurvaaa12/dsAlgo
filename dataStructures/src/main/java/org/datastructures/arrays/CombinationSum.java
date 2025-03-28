package org.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> sumPairs = combinationSum(candidates, target);
        System.out.println(sumPairs);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        makeCombination(candidates, target, 0, new ArrayList<>(), 0, res);
        return res;
    }

    private static void makeCombination(int[] candidates, int target, int index, List<Integer> comb,
                                        int total, List<List<Integer>> res) {
        if (total == target) {
            res.add(new ArrayList<>(comb));
            return;
        }

        if (total > target || index >= candidates.length) {
            return;
        }

        comb.add(candidates[index]);
        makeCombination(candidates, target, index, comb, total + candidates[index], res);
        comb.remove(comb.size() - 1);
        makeCombination(candidates, target, index + 1, comb, total, res);
    }
}
