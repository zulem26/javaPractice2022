package practice_basic_day02;

public class Q13_StringManipulation07 {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {





        String str = "abcdxyzm";
        boolean xyzIceriyorMu=false;
        if (str.contains("xyz")) {
            xyzIceriyorMu=true;
            System.out.println(xyzIceriyorMu);
        } else {
            xyzIceriyorMu=false;
            System.out.println(xyzIceriyorMu);
        }

        // bu sorunun cozumunu basit sekilde paylastim... method creation ile cozmenizi istiyorum,
        // sonra paylasacagim..


        String str1 = "adfaxyz";
        boolean varMi=false;



        dizimiVarMi(str1,varMi);

    }

    public static void dizimiVarMi(String str1, boolean varMi) {
        if (str1.contains("xyz")){
            varMi = true;
            System.out.println(varMi);
        } else{
            varMi = false;
            System.out.println(varMi);
        }

    }
}
