package ganisoruif;

public class Gani_Soru_If {
    public static void main(String[] args) {
        int havaDerece = 900000;

      if(havaDerece <= -75){
          System.out.println("-----------------");
        }else if(havaDerece<=-50 ){
            System.out.println("Drrrrrrrrrrrrrrrrrr");}
        else if (havaDerece >= 50) {
            System.out.println("Eyvah kiyamet mi oluyor yaniyoruz, pisecezzz!!!");
        } else if (havaDerece > 35) {
            System.out.println("Tedbiren disari cikma günes carpabilir.");
        } else if (havaDerece > 15 && havaDerece <= 35) {
            System.out.println("Yuppiiii piknik yapacagiz");

        } else if (havaDerece == 15) {
            System.out.println("Hmm karar veremedim ne yapsam acaba");
        } else {
            System.out.println("En iyisi evde film izlemek");
        }

    }

}