package fibonacciNumber;

import static jdk.nashorn.internal.objects.Global.println;

public class Demo {

    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        fibonacciNumber.setInputNumber(4);
        System.out.println(fibonacciNumber.findFibonacciNumber(fibonacciNumber.getInputNumber()));
    }
}
