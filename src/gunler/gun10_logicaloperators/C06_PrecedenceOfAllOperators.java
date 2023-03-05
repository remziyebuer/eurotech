package gunler.gun10_logicaloperators;

public class C06_PrecedenceOfAllOperators {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        int num3 = 40;
        boolean result = num1 < num2 || num3 > num1;
        System.out.println("result = " + result);
        //RELATIONAL-->LOGICAL--->ASSIGMENT

        //=================================


        String havaDurumu;
        int derece;
        havaDurumu = "Gunesli";
        derece = 25;
        boolean disariCikilirmi = havaDurumu == "Gunesli" || derece >= 20;
        System.out.println("disariCikilirmi = " + disariCikilirmi);
        derece = 19;
        System.out.println("disariCikilirmi = " + disariCikilirmi);

        //==================================

        int num = 3;
        boolean sum;
        sum = --num == 3 || ++num == 2 && --num == 2; //unery-->relation-->logical-->Assigment

                                                      //2==3||3==2&&2==2
                                                       // F || F && T
                                                        // F|| F
                                                         // F
                                                          // sum = F;
        System.out.println("sum = " + sum);
        //====================================
        boolean a = true,  b= true;
        int c= 20;
        a= (c!=30)&& (b = false );
        System.out.println("a = " + a);

    }
}
