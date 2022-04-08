package practice_basic_day03;

import java.util.Scanner;

public class Q10_ForLoop05 {
   /*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Bir tamsayi giriniz : ");
       int num = scan.nextInt();

       int toplam1 = 0;
       for (int i = 1; i <num ; i++) {
           toplam1 += (i*i);
       }
       System.out.println("Sayilarin kareleri toplami: " + toplam1);





       Scanner scanner = new Scanner(System.in);

       System.out.print("Bir tamsayi giriniz: ");

       int sayi = scanner.nextInt();
       int toplam = 0;

       for (int i = 1; i < sayi; i++) { // esit deseydi  i<=sayi

           // toplam = (i * i) + toplam;
           toplam += (i * i) ;

       }
       System.out.println("Sayilarin kareleri toplami: " + toplam);

   }


}

