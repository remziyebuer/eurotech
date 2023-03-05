package gunler.gun13;

public class ElseIf {
    public static void main(String[] args) {
        int numara = 10;
        if (numara > 0) {
            System.out.println("numara 0 dan büyüktür");
        } else if (numara == 10) {
            System.out.println("numra 0  a esittir");
        } else {
            System.out.println("numara 0 dan kücüktür.");
        }
        System.out.println("merhaba java");

        numara=50;
        if (numara>100) {
            System.out.println("numara 100 den büyüktür.");
        } else if(numara >70){
            System.out.println("numara 70 den büyüktür");
        } else if (numara>40){
            System.out.println("numara 40 den büyüktür");
        }else if(numara>20){
            System.out.println("numara 20 den büyüktür");
        }else {
            System.out.println("numara 0 den büyüktür");
        }
        System.out.println("if bitti");
    }
}