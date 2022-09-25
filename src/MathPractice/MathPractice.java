package MathPractice;

import static java.lang.Math.*;

public class MathPractice {
    public static void main(String[] args) {
        double a = 56.34, b = 6.58334, c = -34.4265;

        System.out.println("PI’s value = " + Math.PI);
        System.out.println("E’s value = " + Math.E);
        System.out.println("Random Number = " + Math.random());
        System.out.println("Absolute Value = " + Math.abs(c));
        System.out.println("Square Root = " + Math.sqrt(a));
        System.out.println("Maximum Value = " + Math.max(a,b));
        System.out.println("a^b = " + (long)Math.pow(a,b));
        System.out.println("Round a = " + Math.round(a));
        System.out.println("√(a^2+b^2) = " + (double)Math.sqrt((Math.pow(a,2)+Math.pow(b,2))));
//        System.out.println("√(a^2+b^2) = " + (double)Math.sqrt(((a*a)+((b*b)))));
        System.out.println("Floor of b = " + (int)Math.floor(b) + ", Floor of c = " + (int)Math.floor(c));
        System.out.println("Ceil of b = " + (int)Math.ceil(b) + ", Ceil of c = " + (int)Math.ceil(c));
        System.out.println("Round of b = " + (int)Math.round(b) + ", Round of c = " + (int)Math.round(c));
        System.out.println("Radian value of a = " + Math.toRadians(a));
        System.out.println("sin = " +  Math.sin(Math.toRadians(a)));

    }
}
