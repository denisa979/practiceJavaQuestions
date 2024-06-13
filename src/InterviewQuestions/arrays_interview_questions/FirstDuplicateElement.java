package InterviewQuestions.arrays_interview_questions;

public class FirstDuplicateElement {

    public static void main(String[] args) {
        System.out.println(firstDuplicateElement(new int[]{3, 5, 1, 5, -1, 5, 3}));

    }

    public static int firstDuplicateElement(int[]arr) {
        //iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            //compare the current element with the rest of the elements in the array
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return arr[i];
                }
                }
            }
            return 0;

        }
}





 /*
        First Duplicate Element

        Create a method that will find and return the first duplicate element
            parameter: int[]
            return: int
                if no duplicate elements are found return 0

        A duplicate element is when the number can be found multiple times in the array

        Ex:
            input:
                findDup(3, 5, 1, 5, -1, 5, 3)
            output:
                3

                -> 3 is the first duplicate found
     */
