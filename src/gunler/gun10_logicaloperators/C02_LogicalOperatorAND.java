package gunler.gun10_logicaloperators;

public class C02_LogicalOperatorAND {
    public static void main(String[] args) {

        boolean b = (3 <= 7) & (5 >= 9);
        /*
        Expression 1             Expression 2            Result
        true                      true                    true
        true                      false                   false
        false                     true                    false
        false                     false                   false

         */

        System.out.println(true & true); //true
        System.out.println(true & false); //false
        System.out.println(false & true); //false
        System.out.println(false & false); //false
        // mutlak dogruluk lazim bütün kosullarin dogru olmasi lazim.
        // bir tanesi yanlis olur ise kosul saglanmaz.
        // Passwort ve Username iliskisi gibi düsünülebilir.

        int i1 = 15;
        int i2 = 10;
        double d1 = 20.5;
        double d2 = 15.7;

       //Tekli & Operator
        boolean res1 = (i1 >= i2) & (d1 >= d2);
        System.out.println("res1 = " + res1);

        boolean res2 = (i1 >= i2) & (d1 <= d2);
        System.out.println("res2 = " + res2);

       // Ciftli && Operator
        boolean res3 = (i1 >= i2) && (d1 >= d2);
        System.out.println("res3 = " + res3);

        boolean res4 = (i1 >= i2) && (d1 <= d2);
        System.out.println("res4 = " + res4);

        //Tek Operant ile Cift Operant arasinda ki fark
        // && ;Eger operantlardan biri false dönüyor ise ikinci ve ya diger Operantlari
        //check etmeden sonucu döndürür
        // &; Tüm islemleri yapar dolayisi ile
        // kontrol etmesi gereken cok veri varsa performans kaybi demektir.


    }
}
