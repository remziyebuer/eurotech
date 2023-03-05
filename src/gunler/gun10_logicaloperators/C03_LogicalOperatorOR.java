package gunler.gun10_logicaloperators;

public class C03_LogicalOperatorOR {
    public static void main(String[] args) {
        boolean b = (3 >= 7) | (5 <= 9);


        /*
        Expression1          Expression 2          Result
        true                  true                  true
        true                  false                 true
        false                 true                  true
        false                 false                 false

         Sadece bir dogru olmasi yeterli.O yüzden passwortlar icin uygun degil
         alarm sisteminde sadece bir alarmin calmasi bütün alarmlarin harekete gecmesi
         icin bu operator uygun olur.

         */
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);


        int i1 = 15;
        int i2 = 10;
        double d1 = 20.5;
        double d2 = 15.8;

        System.out.println((i1 >= i2));
        System.out.println((d1 <= d2));

        //Tekli | Operator
        boolean res1 = (i1 >= i2) | (d1 <= d2);
        System.out.println("res1 = " + res1);

        boolean res2 = (i1 <= i2) | (d1 <= d2);
        System.out.println("res2 = " + res2);

        // Ciftli || Operator
        boolean res3 = (i1 >= i2) || (d1 <= d2);
        System.out.println("res3 = " + res3);


        boolean res4 = (i1 <= i2) || (d1 <= d2);
        System.out.println("res4 = " + res4);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //Tek Operant ile Cift Operant arasinda ki fark
        // || ;Eger operantlardan biri true dönüyor ise ikinci ve ya diger Operantlari
        //check etmeden sonucu döndürür
        // |; Tüm islemleri yapar dolayisi ile kontrol etmesi gereken cok veri varsa
        // performans kaybi demektir.Sonuc acisndan hicbir fark yok.




    }

}
