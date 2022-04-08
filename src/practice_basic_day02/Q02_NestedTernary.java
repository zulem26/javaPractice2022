package practice_basic_day02;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        char finalNotu = 'B';

        // String result ="";
        char ffinalNotu = 'A';


        String sonuc = (ffinalNotu == 'A') ? "gayet basarili" :
                (ffinalNotu == 'B') ? "basarili" :
                        (ffinalNotu == 'C') ? "ha gayret" : "digerleri";
        System.out.println(sonuc);


        String result = (finalNotu == 'A') ? "Gayet Basarili" :
                (finalNotu == 'B') ? "Basarili" :
                        (finalNotu == 'C') ? "Ha gayret" : "Digerleri..";

        System.out.println("result = " + result);


    }
}
