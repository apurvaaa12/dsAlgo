package org.datastructures.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptimalAccountBalance {
    public static void main(String[] args){
        int[][] transactions = {{0,1,10},{2,0,5}};
        int minTransfer = minTransfers(transactions);
        System.out.println(minTransfer);
    }
    public static int minTransfers(int[][] transactions) {
        Map<Integer, Integer> balanceMap = new HashMap<>();

        //Calculate the balance for each person
        for(int[] transaction : transactions){
            balanceMap.put(transaction[0],balanceMap.getOrDefault(transaction[0],0)-transaction[2]); //Debitor
            balanceMap.put(transaction[1], balanceMap.getOrDefault(transaction[1],0)+transaction[2]); //creditor
        }
        System.out.println("Balance Map: "+balanceMap);

        // Step 2: Convert balances to a list and remove zero balances
        List<Integer> balances = new ArrayList<>();
        for (int amount : balanceMap.values()) {
            if (amount != 0) {
                balances.add(amount);
            }
        }
        System.out.println("Balance List: "+balances);

        // Step 3: Use backtracking to minimize transactions
        return settleDebts(balances, 0);
    }

    private static int settleDebts(List<Integer> balances, int start) {
        //Skip settled people
        while (start < balances.size() && balances.get(start) == 0) {
            start++;
        }

        // Base case: If everyone is settled
        if (start == balances.size()) return 0;

        int minTransactions = Integer.MAX_VALUE;

        for (int i = start + 1; i < balances.size(); i++) {
            if (balances.get(start) * balances.get(i) < 0){
                balances.set(i, balances.get(i) + balances.get(start));
                minTransactions = Math.min(minTransactions, 1 + settleDebts(balances, start + 1));
                balances.set(i, balances.get(i) - balances.get(start)); // Backtrack
            }
        }

        return minTransactions;
    }
}
