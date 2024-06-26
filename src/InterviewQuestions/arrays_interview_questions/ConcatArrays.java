package InterviewQuestions.arrays_interview_questions;

import java.sql.Array;
import java.util.Arrays;

public class ConcatArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatArrays(new int[]{1,4,5},new int []{8,12,5,9})));
    }

    //create new array to hold the concatenated elements
    public static int[] concatArrays(int[]arr1, int[]arr2) {
        int[] newArray = new int[arr1.length + arr2.length];

        //copy elements from arr1 to newArray
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];

        }
        //copy elements from arr2 to newArray after arr1
        for (int i = 0, j = arr1.length; i < arr2.length; i++, j++) {
            newArray[j] = arr2[i];

        }
        return newArray;
    }
}

 /*
        Concat Arrays

        Create a method that will take two int arrays and concat them into one array. Concat the arrays by combining them into one array

        Ex:
            Input:
                [1, 4, 5], [8, 12, 5, 9]
            Output:
                [1, 4, 5, 8, 12, 5, 9]
     */


