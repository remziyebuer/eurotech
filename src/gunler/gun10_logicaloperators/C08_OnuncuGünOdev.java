package gunler.gun10_logicaloperators;

public class C08_OnuncuGünOdev {
    public static void main(String[] args) {
        /*
        Odev1 : Bir evin 2 kapisi ve 2 penceresi icin alarm sistemi programi yazın
Ve verdiginiz degerlere gore alarm sisteminin calisip calismadigini test edin */

        boolean alarm1Pencere = true; // true=hirsiz giryor alarm caliyor
        boolean alarm2Pencere = false;
        boolean alarm1Kapi = false;
        boolean alarm2Kapi = false;

         boolean alarmSistemiCalisiyormu = alarm1Pencere || alarm2Pencere || alarm1Kapi || alarm2Kapi;
          System.out.println("alarmSistemiCalisiyormu =  " + alarmSistemiCalisiyormu);
        /*

Odev2: Verilen 3 tane acidan bir ucgen olusturulup olusturlamayacagini check eden bir program yazınız
Kural 1: Ucgenin ic acilarinin toplami 180 e esit olmalidir
Kural 2: Herhangi bir acı 1 den kucuk veya 180 e esit olamaz

         */
        double a = 1;
        double b = 69;
        double c = 110;
        double icAcilarToplami = a + b + c;


        boolean buAcilarUcgenOlustururmu = !(a< 1 || a == 180) && !(b< 1 || b == 180) &&
                !(c< 1 || c == 180)    && a + b + c == 180;

        System.out.println("buAcilarUcgenOlustururmu = " + buAcilarUcgenOlustururmu);

    }
}

