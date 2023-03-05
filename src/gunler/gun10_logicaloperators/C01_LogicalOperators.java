package gunler.gun10_logicaloperators;

public class C01_LogicalOperators {
    public static void main(String[] args) {
        System.out.println("(3>7) = " + (3 > 7));
        System.out.println("(3>=7) = " + (3 >= 7));
        System.out.println("(3!=7) = " + (3 != 7));
        System.out.println("(3<=7) = " + (3 <= 7));
        //bunlar Relation Operatorler.Bunlarin ikisine ihtiyacimiz varsa
        // onlari idare etmek icin Logical Operatörlere ihtiyacimiz var.

        System.out.println((3 <= 7) & (3 % 3 == 0));
        boolean b = (3<=7)&(3>=3);
        System.out.println("b = " + b);

    }
}
