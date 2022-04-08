package practice_basic_day04;

import java.util.Scanner;

public class  Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        int[] arr = {9, 7, -6, 4, 2, 15, 3,18,30,26,39};
        int toplam = 0;


        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%3==0){

                toplam++;
            }
        }
        System.out.println("bolunebilen toplam " + toplam + " sayi vardir");

    }
}
