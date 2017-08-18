package com.company;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

public class Tasks {


    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 8, 3, 2, 11, 4, 3, 0, 5};
        MaxElement(arr);
        MinElement(arr);
        ArrSum(arr);
        ArrayAverage(arr);
        CountElements(arr);
        MultArray(arr,5);
    }

    public static void ArrSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма чисел массива: " + sum);
    }

    public static void MaxElement(int arr[]) {

        int max = arr[0];
        int maxindex = 0;

        for (int i = 0; i != arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                maxindex = i;
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Индекс максимального элемента: " + maxindex);
    }

    public static void MinElement(int arr[]) {
        int min = arr[0];
        int minindex = 0;
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minindex = i;
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Индекс минимального элемента: " + minindex);
    }

    public static void ArrayAverage(int arr[]) {

        int average = 0;
        int sum = 0;
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            average = sum / arr.length;
            System.out.println("Среднее значение массива: " + average);
        }
    }

    public static void CountElements(int arr[]) {
        int SpecialElement = 3;
        int CountZeroElement = 0;
        int CountNotZero = 0;
        int CountSpecialElement = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == SpecialElement) {
                CountSpecialElement++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                CountZeroElement++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                CountNotZero++;
            }
        }
        System.out.println("Количество элементов 3: " + CountSpecialElement);
        System.out.println("Количество элементов 0: " + CountZeroElement);
        System.out.println("Количество элементов больше 0: " + CountNotZero);
    }

    public static void MultArray(int arr[], int mult) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr[i]* mult;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Массив умноженый на число: " + arr[i]);
        }
    }
}
