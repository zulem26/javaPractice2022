package practice_basic_day04;

public class Calisma {
    public static void main(String[] args) {

        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;

        toplamaMethod(arr, istenenToplam);



    }

    private static void toplamaMethod(int[] arr, int istenenToplam) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1 ; j < arr[j]; j++) {
                if (arr[i]+arr[j]==istenenToplam){
                    System.out.println(arr[i] + " ve " + arr[j] + "toplami : " + istenenToplam);
                }
            }
        }

    }
}
