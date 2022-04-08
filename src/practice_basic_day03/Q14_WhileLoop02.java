package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int bolen = 1;
        int sayi =1;

        while(bolen<sayi){
            System.out.println("lutfen bir sayi giriniz : ");
            sayi = scan.nextInt();
            if (bolen%2==1){
                System.out.println(bolen);
            }
            bolen++;
        }
        System.out.println(bolen);




    }
}
