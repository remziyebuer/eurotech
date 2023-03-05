package gunler.gun11_IfStatement;

public class C02_IfStatementExercises {
    public static void main(String[] args) {
        int z = 10;
        // if(x equals 42){} ===>yanlis syntax equal bir String tir == e denk degil

        // Soru1;Eger calisma saati 38 den büyükse maasi(salary) 1.5 ile carp.
        double salary = 50000;
        int hours = 40;

        if (hours > 38) {
            salary *= 1.5;
            System.out.println(salary);
        }

        //soru2; y degeri 0 dan büyük ise xe 1 degerini atayan if cüm.yaziniz.
        int y = 12;
        int x = 0;
        if (y > 0) {
            x = 1;
        }
        // soru3;Eger scor 90 dan büyük ise ödeme ye %3 artis ekle
        int scor = 96;
        double ödeme = 1000;

        if (scor > 90) {
            ödeme = ödeme + (ödeme * 3 / 100);
        }
        System.out.println("ödeme = " + ödeme);
// SORU4; bir sayi besin kati ise Hi Five ; ayni sayi iki ile bölünüyorsa Hi Even yazdirin
        int m = 20;
        if (m % 5 == 0) {
            System.out.println("Hi Five");

        }
        if (m % 2 == 0) {
            System.out.println("Hi Even");
        }
        //Soru5; Bir kisinin oy kullanmaya uygun olup olmadigini gösteren bir program yazin
        int userAge = 18;
        if (userAge >= 18) {
            System.out.println("Kisi oy kullanabilir");
        }
        //Soru6; üc tane  sayi degiskeni karsilastirarak en büyük degeri yazdirin
        int num1 = 11;
        int num2 = 1;
        int num3 = 33;
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is the max number");

        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + "is the max number");
        }

        if (num3 > num1 && num3 > num3) {
            System.out.println(num3 + "is the max number");
        }



        }

}
