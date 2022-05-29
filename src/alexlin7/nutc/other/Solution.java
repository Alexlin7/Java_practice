package alexlin7.nutc.other;

public class Solution {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(new Solution().coinChange(coins, 11));
    }

    public int coinChange(int[] coins, int amount) {
        if(amount < 0) return 0;
        return cal(coins, amount, new int[amount]);

    }

    int cal(int[] coins, int rem, int[] count) {
        if(rem < 0) return -1;
        if(rem == 0) return 0;
        if(count[rem - 1] != 0) return count[rem - 1];
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            System.out.println("金幣" + coin);
            int res = cal(coins, rem - coin, count);
            if(res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }
}
