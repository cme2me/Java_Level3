package com.company;

import com.company.fruit.Apple;
import com.company.fruit.FruitBox;
import java.util.ArrayList;
import java.util.Arrays;

public class Main extends FruitBox{

    public static void main(String[] args) {
        Double[] arr = {3.14, 5.23, 5.21, 9.43};
        ArrayList<Double> arr1 = arrList(arr);
        System.out.println(arr1);
        FruitBox<Apple> box1 = new FruitBox<>();
        box1.addFruits(new Apple());
        box1.getWeight();
    }
    public static <T> ArrayList<T> arrList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
    public static <T> void swap(T[] arr, int index1, int index2 ){
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
        System.out.println(obj);
    }
}
