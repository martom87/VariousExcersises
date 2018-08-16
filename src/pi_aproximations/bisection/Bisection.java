package pi_aproximations.bisection;

public class Bisection {
    static final double EPSILON = (double) 0.01;


    // counts the function value
    static double func(double x) {
        return Math.sin(x);
    }
    // checs the sign of function
    // Prints root of func(x) with error of EPSILON
    static void bisection(double a, double b) {
        if (func(a) * func(b) >= 0) {
            System.out.println("You have not assumed"
                    + " right a and b");
            return;
        }

        double c = a;
        // reapats until the range <a,b> is tight as indicated by epsilon
        while ((b - a) >= EPSILON) {
            // Find middle point
            c = (a + b) / 2;

            // Check if middle point is root
            if (func(c) == 0.0)
                break;

                // Decide the side to repeat the steps
            else if (func(c) * func(a) < 0)
                b = c;
            else
                a = c;
        }
        //prints value of c upto 7 decimal places
        System.out.printf("The value of root is : %.7f"
                , c);
    }

    public static void main(String[] args) {
        System.out.println(Math.PI);

        double a = -0.01;
        double b = 3.20;

        bisection(a,b);
    }
}
