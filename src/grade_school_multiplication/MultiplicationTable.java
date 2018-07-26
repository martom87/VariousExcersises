package grade_school_multiplication;

public class MultiplicationTable {

int [] table1 = {1,2,3,4,5,6,7,8,9,10,11,12};
int [] table2 = {1,2,3,4,5,6,7,8,9,10,11,12};

void printResults (){
    for (int i = 1; i<=table1.length; i++){
        for (int j = 1; j<=table2.length; j++){
            System.out.print(i*j + " ");
        }
        System.out.println();
    }
}



}
