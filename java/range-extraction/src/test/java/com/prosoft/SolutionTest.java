package com.prosoft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тестирование класса Solution
 */
@DisplayName("Methods testing the Solution class")
class SolutionTest {

    @Test
    @DisplayName("rangeExtraction(new int[]{-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}) => '-10--8,-6,-3-1,3-5,7-11,14,15,17-20'")
    void rangeExtractionExecutedSuccess() {
        assertEquals("-10--8,-6,-3-1,3-5,7-11,14,15,17-20", Solution.rangeExtraction(new int[]{-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }

    @Test
    @DisplayName("rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}) => '-6,-3-1,3-5,7-11,14,15,17-20'")
    void rangeExtractionExecutedSuccess2() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", Solution.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
    }

    @Test
    @DisplayName("rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20}) => '-3--1,2,10,15,16,18-20'")
    void rangeExtractionExecutedSuccess3() {
        assertEquals("-3--1,2,10,15,16,18-20", Solution.rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20}));
    }

}