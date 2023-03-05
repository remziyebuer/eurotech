package gunler.gun11_IfStatement;

public class C03_IfElse {

    public static void main(String[] args) {

        /*
        Write a program, declare int variable user age. Then program will show us if
        the user is eligible to vote or not.. (Rule: vote age >=18) USER AGE = 15  Not eligible to vote
        USER AGE = 18  Eligible to vote
         */
        // Bir kisinin oy kullanmaya uygun olup olmadigini gosteren bir program yazin

        int age = 17;

        if (age >= 18){
            System.out.println("User is eligible to vote");
        }else {
            System.out.println("User is not eligible to vote");
        }

        // write a program that calculates the area of a circle

        int radius = 12;
        double area = 0;
        double pi = 3.14;

        if (radius > 0){
            area = radius * radius * pi;
            System.out.println("area = " + area);
        } else {
            System.out.println("This is not a circle");
        }

        // Write a Java program prints whether it is positive or negative number

        int number = -11;

        if (number >= 0){
            System.out.println(number + " is a positive number");
        }else{
            System.out.println(number + " is a negative number");
        }

//Write a program to checks whether a number is even or odd
        // Bir sayinin tek mi cift mi oldugunu kontrol eden bir program yazin

        int num = 21;

        if (num%2 == 0){
            System.out.println(num + " cift bir sayidir");
        }else {
            System.out.println(num + " tek bir sayidir");
        }

        // Write an if statement that increases pay by 3% if score is greater than 90, otherwise increases pay by 1%
        // Eger score 90 dan fazla ise odemeyi 3%, degilse 1% arttiran bir program yazin

        int score = 89;
        double pay = 1000;

        if(score > 90){
            pay += (pay * 3 / 100);
        }else {
            pay += (pay / 100);
        }
        System.out.println("pay = " + pay);
        int ch = '`';
        System.out.println(ch);
    }
}

