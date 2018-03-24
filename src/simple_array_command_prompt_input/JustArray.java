package simple_array_command_prompt_input;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JustArray {

    int setArraySize() {
        int n = 0;
        System.out.println("Declare Array Size");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        return n;
    }


    int[] declareSomeArray(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Your Numbers");
        int[] someArray = new int[n];
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = sc.nextInt();
        }

        return someArray;
    }

    void printSomeArray(int[] someArray) {
        System.out.println("This is your Array");
        for (int i = 0; i < someArray.length; i++) {
            System.out.println(someArray[i]);
        }
        int sum = sumArrayElements(someArray);
        System.out.println("The sum of its Elements is " + sum);
    }

    int sumArrayElements(int[] someArray) {
        int sum = 0;
        for (int i = 0; i < someArray.length; i++) {
            sum += someArray[i];
        }

        return sum;

    }

    String findNumber(int[] arr, int k) {
        String answer;

        boolean arrayContainsNumber = Arrays.asList(arr).contains(k);

        if (arrayContainsNumber) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return answer;
    }


}
