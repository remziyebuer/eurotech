package gunler.gun10_logicaloperators;

public class C07_SifreliKasaSoru {
    public static void main(String[] args) {
        /*
        Uc sifre ile acilan bir kasa programi yazin
        Verdiginiz degerlere gore kasanin acilip acilmadigini
        Consolda yazdirin
         */

        // benim cözmeye calistigim kisim
        boolean ilkSifre = false;
        boolean ikinciSifre = true;
        boolean ucuncuSifre = true;
        boolean result = ilkSifre && ikinciSifre && ucuncuSifre;

        System.out.println("result = " + result);
//==================================================

        //Hocanin Cözümü;

        System.out.println("Lutfen Sifrenizi Girin!");

        boolean sifre1 = true;
        boolean sifre2 = true;
        boolean sifre3 = true;

        boolean kasaAcildi;
        kasaAcildi = sifre1 && sifre2 && sifre3;

        System.out.println("kasaAcildi mi = " + kasaAcildi);


    }
}
