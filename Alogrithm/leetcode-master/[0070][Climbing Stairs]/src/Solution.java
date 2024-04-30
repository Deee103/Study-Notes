/**
 * Author: 王俊超
 * Date: 2015-07-25
 * Time: 09:10
 * Declaration: All Rights Reserved !!!
 */
public class Solution {
    /**
     * <pre>
     * 设f(n) 表示爬n 阶楼梯的不同方法数，为了爬到第n 阶楼梯，有两个选择：
     * - 从第n - 1 阶前进1 步；
     * - 从第n - 1 阶前进2 步；
     * 因此，有f(n) = f(n - 1) + f(n - 2)。
     * </pre>
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {

        int result = 0;

        // 只有一阶
        if (n == 1) {
            result = 1;
        }
        // 只有两阶
        else if (n == 2) {
            result = 2;
        }
        // 楼梯阶数大于2
        else if (n > 2) {
            // 保存所有的解法
            int[] ways = new int[n];

            ways[0] = 1;
            ways[1] = 2;

            for (int i = 2; i < ways.length; i++) {
                ways[i] = ways[i - 1] + ways[i - 2];
            }

            result = ways[ways.length - 1];
        }

        return result;
    }
}
