package practice_basic_day04;

public class Q02_Arrays {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

       /* int arr[]= {1,2,3,4,5,6,7};
        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i];

        }
        double ortalama = toplam/arr.length;
        System.out.println("ortalama = " + ortalama);
        System.out.print("ortalamadan buyuk olan elemanlar : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama){
                System.out.print(arr[i] + "-");
            }
        }


        */

        int toplam1 = 0;
        int arr1[]= {1,2,3,4,5,6,7};
        for (int i = 0; i <arr1.length ; i++) {
            toplam1 += arr1[i];
        }

        double ortalama1 = toplam1/arr1.length;
        System.out.println("ortalama1 : " + ortalama1);
        System.out.print("ortalamanin ustundeki sayilar : ");
        for (int i = 0; i <arr1.length ; i++) {
            if (arr1[i]>ortalama1){
                System.out.print(arr1[i] + "-");
            }

        }


    }
}
