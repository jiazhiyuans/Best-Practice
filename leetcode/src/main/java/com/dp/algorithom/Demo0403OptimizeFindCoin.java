package com.dp.algorithom;

import java.util.Arrays;

/**
 * @author jiazhiyuan
 * @date 2021/12/4 5:52 下午
 */
public class Demo0403OptimizeFindCoin {


    int getMinCounts(int k, int[] values) {
        int[] memo = new int[k + 1];
        // 创建备忘录
        memo[0] = 0; // 初始化状态
        for (int i = 1; i < k + 1; i++) {
            memo[i] = k + 1;
        }
        for (int i = 1; i < k + 1; i++) {
            for (int coin : values) {
                if (i - coin < 0) {
                    continue;
                }
                memo[i] = Math.min(memo[i], memo[i - coin] + 1); // 作出决策
            }
        }
        return memo[k] == k + 1 ? -1 : memo[k];
    }

    int getMinCountsDPSolAdvance() {
        int[] values = {3, 5}; // 硬币面值
        int total = 22; // 总值
        return getMinCounts(total, values); // 输出答案
    }
}





    
