package practice_basic_day03;

import java.util.Scanner;


public class Calisma1 {


    public static void main(String[] args) {
        //Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
        //        girilen sayı dahil
        Scanner scanner = new Scanner(System.in);

int sayi =1;
        int bolen = 1;
while (bolen<=sayi){
    System.out.println("lutfen bir sayi giriniz : ");
    sayi = scanner.nextInt();
    if (sayi%2==0){
        System.out.println(sayi);
    }
    bolen++;
}


    }
}