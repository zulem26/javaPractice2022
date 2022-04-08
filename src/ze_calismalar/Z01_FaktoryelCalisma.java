package ze_calismalar;

import java.util.Scanner;

public class Z01_FaktoryelCalisma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1 den 5 e kadar sayi giriniz : ");
        int sayi = scan.nextInt();
        int faktoryel = 1;
        String faktoryelAcikYazim ="";

        for (int i = sayi; i >=1 ; i--) {
            faktoryel *=i;
            if (i==sayi){
                faktoryelAcikYazim = faktoryelAcikYazim+i;
            }else{
                faktoryelAcikYazim=faktoryelAcikYazim + "*" + i;
            }
        }
        System.out.println(sayi + "!= " + faktoryelAcikYazim + " =" +faktoryel);


    }
}
