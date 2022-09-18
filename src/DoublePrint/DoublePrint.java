package DoublePrint;
import static java.lang.Math.*;
public class DoublePrint {
    public static void main(String[] args) {
        Double abc = 10.57645;

        System.out.println("Exponent Format: "+exp(abc));
        System.out.println("2 digit after decimal point: "+ String.format("%.2f", abc));
        System.out.format("2 digit after decimal point another way: %.2f", abc);
        System.out.println(String.format("%07.1f",abc));
        System.out.printf("Left Justified Format: %10f\n",abc);
        System.out.printf("Right Justified Format: %f\n",abc);
    }
}
