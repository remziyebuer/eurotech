package gunler.gun13;

import java.sql.SQLOutput;

public class Not {
    public static void main(String[] args) {
        int not = 92;
        if (not <= 100 && not >= 85) {
            System.out.println("super");
        } else if (not < 85 && not >= 70) {
            System.out.println("fena degil");
        } else if (not < 70 && not >= 50) {
            System.out.println(" daha fazla gayret etmelisin");
        } else if (not < 50 && not >= 30) {
            System.out.println("cok calisman gerek");
        } else if (not >= 0 && not < 30) {
            System.out.println("destek almali ve cok calismalisin");
        }
        // böyle bir yazimda siralama önemli degil  ama bu tip birseyi tek boolean ile yaparsak ki
        // bu sekilde yazmak mantikli ama dikkat etmeliyiz baslama noktasi en alt nokta degil üst nokta
        // olmali yoksa hata yapriz.yanlis sonuc aliriz.
        //örnek;
        not = 90;
        if (not >= 85) {
            System.out.println("super");
        } else if (not >= 70) {
            System.out.println("iyi");
        } else if (not >= 50) {
            System.out.println("fena degil");
        } else if (not >= 30) {
            System.out.println(" cok calismalisin");
        } else if (not >= 30) {
            System.out.println("destek almali ve cok calismalisin");
        }
            //----------------------------------------
            not = 60;
            char derece = 'A';
            if (not >= 85) {
                derece = 'A';
                System.out.println();
            } else if (not >= 70) {
                derece = 'B';
                System.out.println("iyi");
            } else if (not >= 50) {
                derece = 'C';
                System.out.println("fena degil");
            } else if (not >= 30) {
                derece = 'D';
                System.out.println(" cok calismalisin");
            } else if (not >= 30) {
                derece = 'E';
                System.out.println("destek almali ve cok calismalisin");
            }
        }
    }
