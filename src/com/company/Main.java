package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Double[] arr = {3.14, 5.23, 5.21, 9.43};
        ArrayList<Double> arr1 = arrList(arr);
        System.out.println(arr1);
        swap(arr, 1, 2);
    }
    public static <T> ArrayList<T> arrList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
    public static <T> void swap(T[] arr, int index1, int index2 ){
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }
}
