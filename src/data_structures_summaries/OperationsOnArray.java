package data_structures_summaries;

import java.util.ArrayList;
import java.util.List;

public class OperationsOnArray {


    public static void main(String[] arg) {

        int[] someArray = {1, 2, 3, 4, 5};

        // TODO prints array lenght

        System.out.println("The someArray lenght equals" + someArray.length);

        // TODO prints array elements

        for (int i = 0; i < someArray.length; i++) {
            System.out.print(someArray[i] + " ");
        }


        // TODO Reverts Numbers In Array

        System.out.println("This is revert Numbering is:");


        for (int i = someArray.length - 1; i >= 0; i--) {
            System.out.print(someArray[i] + " ");


        }


        // TODO Sums the Numbers In Array
        int sum = 0;
        for (int i = 0; i < someArray.length; i++) {
            sum += someArray[i];

        }

        System.out.println("The sum of arrays number equals");
        System.out.println(sum);


        // TODO Counts the average of the number

        System.out.println("The Average is");
        System.out.println(sum / someArray.length);


        // TODO Counts sqr of numbers in array

        for (int i = 0; i < someArray.length; i++) {
            // System.out.print(someArray[i]*someArray[i] + " ");
            System.out.print(Math.pow(someArray[i], 2.0) + " ");
        }

// TODO Populate 2D Array with two and more arrays
        System.out.println();
        System.out.println("Populates 2D array");
        int arrA[] = {1, 2, 3};
        int arrB[] = {4, 5, 6};
        int arrD[] = {7, 8, 9};
        int arrE[] = {10, 11, 12};
        int arrC[][] = {arrA, arrB, arrD, arrE};

        for (int i = 0; i < arrC.length; i++) {
            for (int j = 0; j < arrC[i].length; j++) {
                // System.out.println(arrC[i][j]);
                // System.out.println();
                System.out.printf("arcC[%d][%d]=%d \n", i, j, arrC[i][j]);
                //      System.out.printf("arcC[%d][%d]=%d ", i, j, arrC[i][j]);

            }


        }

        // TODO Find the 6x6 2D array elements of the array diagonal
        System.out.println("Populate 6X6 Array");
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {7, 8, 9, 10, 11, 12};
        int arr3[] = {13, 14, 15, 16, 17, 18};
        int arr4[] = {19, 20, 21, 22, 23, 24,};
        int arr5[] = {25, 26, 27, 28, 29, 30};
        int arr6[] = {31, 32, 33, 34, 35, 36};


        // TODO prints array labeled elements
        int arr2D[][] = {arr1, arr2, arr3, arr4, arr5, arr6};
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.printf("arc2D[%d][%d]=%d \n", i, j, arr2D[i][j]);
            }
        }
// TODO Prints 1st diagonal <=> 1st diagonal is the only place in sqare matrix when coordinates are equal
        List<Integer> firstDiagonal = new ArrayList<>();
        List<Integer> secondDiagonal = new ArrayList<>();
        System.out.println("Prints 1s Diagonal");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (i == j) {
                    System.out.printf("arc2D[%d][%d]=%d \n", i, j, arr2D[i][j]);
                    firstDiagonal.add(arr2D[i][j]);
                }
            }
        }
// TODO Prints 2nd diagonal <=> 2nd diagonal is the onyl place in matrix whan cooridnantes sum is equal atrix lenght
        System.out.println("Prints Second Diagonal");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if ((i + j) == (arr2D.length - 1)) {
                    System.out.printf("arc2D[%d][%d]=%d \n", i, j, arr2D[i][j]);
                    secondDiagonal.add(arr2D[i][j]);
                }
            }
        }

        int firstDiagonalSum = 0;
        for (int k = 0; k < firstDiagonal.size(); k++) {
            firstDiagonalSum += firstDiagonal.get(k);
        }

        System.out.println(firstDiagonalSum);

    }


}