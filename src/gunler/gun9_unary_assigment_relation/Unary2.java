package gunler.gun9_unary_assigment_relation;

public class Unary2 {

    public static void main(String[] args) {

        int numara = 20;
        numara++; // numara degiskenin degerini 1 artiriyor
        System.out.println("numara = " + numara); //21
        ++numara;// bu da bir artiriyor// 22
        System.out.println("numara = " + numara); //22
        int b = numara; //
        System.out.println("b = " + b);
        b = ++numara;
        System.out.println("b = " + b); //23
        b = numara++; //23
        System.out.println("b = " + b);//23
        System.out.println("numara = " + numara);//24

        numara = 25;
        numara--;
        System.out.println("numara = " + numara);//24
        --numara;
        System.out.println("numara = " + numara); //23
        b = numara; // b ye 23 degerini atamis oldum
        b = --numara; //
        System.out.println("b = " + b);//22
        System.out.println("numara = " + numara); // 22
        b = numara--; //numara-- isleminden önce 22, b=22 atama
        // sonrasi numaranin  degerini 1 eksiltiyor. numara= 21 oluyor
        System.out.println("numara = " + numara); //21
        numara--;
        System.out.println("numara = " + numara); //20
        b= numara--;
        System.out.println("b = " + b);//20
        System.out.println("numara = " + numara); //19
        b=numara++;
        System.out.println("b = " + b);// b=19(numara)olur ; sonra numara 1 artar ve 20 olur
        b=++numara;// numara // num 20 olustu bir artar 21 olur sonra b ye atanir. b=21
        System.out.println("b = " + b);


    }
}
