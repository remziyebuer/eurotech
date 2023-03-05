package gunler.gun10_logicaloperators;

public class C05_PrecedenceOfLogicalOperators {
    public static void main(String[] args) {
        /*
        Precedence Of Logical Operators
        Operatörlerin birbirine karsi önceligi
        en öncelikli olan not operatörü ( tabi ki parantez varsa önce parantez sonra not)
        ikinci olarak isleme girecek olan And operatörü  en son or cünkü and or
        a göre daha sert.
        Highest
        !
        &&
        ||
        Lowest
         */
        int i1 = 10;
        int i2 = 15;
        int i3 = 20;
        boolean check = i1 != i2 || !(i1 == i3) && i2 == i3;
        System.out.println("check = " + check);

        // T || T && F , EN BASTA AND DEGERLENDIRILIR T&&F --->F
        // T || F -----> T OLUR.


        boolean check2 = (i1>=i2)&& (i3==i2)||(i1!=i3); // F && F || T
                                                         //  F || T
                                                          //   T
        System.out.println("check2 = " + check2);


    }

}
