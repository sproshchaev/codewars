package com.prosoft;

import java.util.ArrayList;
import java.util.List;

public class Snail {

    /**
     * Method snail.
     * Snail Sort
     * Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling
     * clockwise.
     * <p>
     * array = [[1,2,3],
     *          [4,5,6],
     *          [7,8,9]]
     * snail(array) #=> [1,2,3,6,9,8,7,4,5]
     * <p>
     * For better understanding, please follow the numbers of the next array consecutively:
     * array = [[1,2,3],
     *          [8,9,4],
     *          [7,6,5]]
     * snail(array) #=> [1,2,3,4,5,6,7,8,9]
     * NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d
     * array in a clockwise snailshell pattern.
     * NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].
     *
     * @param array
     * @return
     */
    public static int[] snail(int[][] array) {
        int[] result = new int[array.length * array[0].length];
        int step = 0, resultIndex = 0;
        while ((step < array.length) && ((getA(array, step).length != 0) || (getB(array, step).length != 0)
                || (getC(array, step).length != 0) || (getD(array, step).length != 0))) {
            System.arraycopy(getA(array, step), 0, result, resultIndex, getA(array, step).length);
            resultIndex += getA(array, step).length;
            System.arraycopy(getB(array, step), 0, result, resultIndex, getB(array, step).length);
            resultIndex += getB(array, step).length;
            System.arraycopy(getC(array, step), 0, result, resultIndex, getC(array, step).length);
            resultIndex += getC(array, step).length;
            System.arraycopy(getD(array, step), 0, result, resultIndex, getD(array, step).length);
            resultIndex += getD(array, step).length;
            step++;
        }
        return result;
    }

    private static int[] getA(int[][] array, int step) {
        List<Integer> result = new ArrayList<>();
        for (int i = step; i < array[step].length - step; i++) {
            result.add(array[step][i]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    private static int[] getB(int[][] array, int step) {
        List<Integer> result = new ArrayList<>();
        for (int i = step + 1; i < array.length - step; i++) {
            result.add(array[i][array[i].length - 1 - step]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    private static int[] getC(int[][] array, int step) {
        List<Integer> result = new ArrayList<>();
        for (int i = array[array.length - 1 - step].length - 1 - step - 1; i >= step; i--) {
            result.add(array[array.length - 1 - step][i]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    private static int[] getD(int[][] array, int step) {
        List<Integer> result = new ArrayList<>();
        for (int i = array.length - 1 - step - 1; i >= 1 + step; i--) {
            result.add(array[i][step]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

}
