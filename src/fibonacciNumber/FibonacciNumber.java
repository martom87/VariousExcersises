package fibonacciNumber;

public class FibonacciNumber {

    int inputNumber;

    public int getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    int findFibonacciNumber(int inputNumber)

    {
        int fibbonaciNumber;
        if (inputNumber == 0) {
            fibbonaciNumber = 1;
        } else if (inputNumber == 1 || inputNumber == 2) {
            fibbonaciNumber = 1;
        } else {
            fibbonaciNumber = findFibonacciNumber(inputNumber - 2) + findFibonacciNumber(inputNumber - 1);
        }


        return fibbonaciNumber;

    }

}
