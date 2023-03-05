package gunler.gun12;

//import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
        int a1 = 12;
        int b1 = 20;
        System.out.println("sonuc=" + (a1 < b1));

        int numara = 52;
        boolean pozitifSayi = numara >= 0;
        System.out.println("Numara pozitf sayi mi;" + numara);


        // Gün Haftasonu sicaklik 20 derece üstünde ise piknige gidecez.
//        Scanner input = new Scanner(System.in);
//        System.out.println("lütfen günü giriniz");
//        String gun = input.next();
//        System.out.println("lütfen havanin kac derece oldugunu giriniz");
//        int havaDerece = input.nextInt();
//        if (havaDerece > 20 && gun == "Cumartesi" || gun=="Pazar"){
//            System.out.println("Piknige gidiyoruz");
//        } else{
//            System.out.println("Zaten ev de cok is vardi:)");
//        }

        boolean gunHaftaSonumu = true;
        boolean sicaklik20Ustumu = true;
        boolean piknigeGidiyormuyuz = gunHaftaSonumu && sicaklik20Ustumu;
        System.out.println("piknigeGidiyormuyuz = " + piknigeGidiyormuyuz);
        gunHaftaSonumu = false;
        sicaklik20Ustumu = true;
        piknigeGidiyormuyuz = gunHaftaSonumu && sicaklik20Ustumu;
        System.out.println("piknigeGidiyormuyuz = " + piknigeGidiyormuyuz);
        int a = 10;
        int b = 12;
        System.out.println(a < b && ++a > 5);
        System.out.println("a = " + a);

        boolean gunCumartesimi = true;
        boolean gunPazarmi = false;
        boolean gunHaftaIcimi = !gunCumartesimi && !gunPazarmi;
        System.out.println(gunHaftaIcimi);
        //Bir numara yazin 20 ve 40 araliginda olsun ya da 60 ve 80 araliginda ise
        // sonucu true döndüren bir deger ile konsola yazdiriniz.
        numara = 65;
        boolean aralik = (numara < 40 && numara > 20) || (numara > 60 && numara < 80);
        System.out.println(aralik);
        // bir sayinin iki haneli olup olmadigini nasil anlari
        numara=13;
        boolean ikiHanelimi = numara>9 && numara<100;
        System.out.println("ikiHanelimi = " + ikiHanelimi);

        // soru: ogrencinin notu 90dan büyükse Cok basarilisin böyle devam et yazdirin degilse baska
        // bir ifade kullansin.
       // 1.yol;
        int not = 70;
        if(not>90){
            System.out.println("Cok basarilisin böyle devam et");
        } else {
            System.out.println(" Daha cok gayret etmeslisin.");
        }
//2.yol;sonuc bir boolean icine konarakta if kapali parantezine yazdirilabilir.

        int not2 = 70;
        boolean notSonuc =not>90;

        if(notSonuc){
            System.out.println("Cok basarilisin böyle devam et");
        } else {
            System.out.println(" Daha cok gayret etmeslisin.");
        }
    }
}
