package practice_basic_day03;

public class Q07_ForLoop02 {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {
    //    System.out.println("*************for ile*************");
    //    for (int i = 0; i <=255; i++){
    //        char karakter = (char) i;
    //        System.out.println(i + "-> " + karakter);
    //
    //    }

        for (int i = 0; i <256 ; i++) {
            char karakter = (char) i;
            System.out.println(i + " - " + karakter);
        }

    int k=0;
        System.out.println("------while ile-----");
    while (k<256){
        char c = (char) k;
        System.out.println(k + " - " + c);
        k++;
    }


        char c = 'a';
        while (c <= 'z') {
            System.out.println(c);
            c++;
        }


       /* System.out.println("*************while ile*************");

        int j = 0;
        while(j<=255){
            char c = (char) j;
            System.out.println(j+" - " +c);
            j++;
        }

        int i = 0;
        while(i<=255){
            char c = (char) i;
            System.out.println(i + " - " +c);
            i++;
        }

        */
    }

}
