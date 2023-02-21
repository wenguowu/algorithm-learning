package cn.wl.algorithm.array;

/**
 * Copyright (c) 2023/2/2 jaalantech. All Rights Reserved.
 * 题目描述 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 * <p>
 * 每行的元素从左到右升序排列。 每列的元素从上到下升序排列。
 *
 * @author::brett. Created on 2023/2/2
 */
public class DoubleArraySearch {
    private static boolean find(int target, int[][] array) {
        //边界判定
        if (array == null || array.length == 0 ||
                array[0] == null || array[0].length == 0) {
            return false;
        }
        //取出 m，n
        int m = array.length, n = array[0].length;
        //初始化遍历数组下标
        int i = 0, j = array[i].length - 1;
        while (i <= m - 1) {
            if (array[i][j] > target) {
                j--;
            } else if (array[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(find(7, array));
    }
}
