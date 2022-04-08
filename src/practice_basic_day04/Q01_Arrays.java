package practice_basic_day04;

import java.util.Arrays;

public class Q01_Arrays {
    public static void main(String[] args) {
		/*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int arr[] = {2,6,4,5,8,9};

        for (int j = 0; j <arr.length ; j++) {
            arr[j] *= arr[j];
        }
        System.out.println("elemanlarin karesi " + Arrays.toString(arr));



        int arr1 [] = {2,6,4,5,8,9};
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] *= arr1[i];
        }
        System.out.println("elemanlarin karesi : " + Arrays.toString(arr1));   // [4, 36, 16, 25, 64, 81]




    }
}
