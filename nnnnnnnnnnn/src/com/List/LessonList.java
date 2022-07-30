package com.List;

import java.util.Scanner;

public class LessonList {
    public static void main(String[] args) {


        int[] ourElements = {4, 8, 44, 7, 10, 34};

        int result = sumOfTowLargestElements(ourElements);

        System.out.println("The Sum Of Two Largest Element is : " + result);

    }

    public static int sumOfTowLargestElements(int[] elements) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;

        for (int value : elements) {
            if (value > max) {
                secondMax = max;
                max = value;
            } else if (value > secondMax && value < max) {
                secondMax = value;
            }
        }
        System.out.println("The Large Element is : " + max);
        System.out.println("The Second Large Element is : " + secondMax);

        int sum = max + secondMax;

        return sum;
    }
}
