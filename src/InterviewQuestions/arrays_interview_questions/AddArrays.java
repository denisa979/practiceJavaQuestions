package InterviewQuestions.arrays_interview_questions;

public class AddArrays {

    //main method to test the addUpToSum method
    public static void main(String[] args) {
        addUpTooSum(new int []{8, 7, 2, 5, 3, 1}, 10);
    }

    public static void addUpTooSum(int[] arr, int sumNumbers){
        //loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            //loop through each element after the current element
            for (int j = 0; j < arr.length; j++) {
                //check if the current element and next element equals the target sum
                if(arr[i]+arr[j]==sumNumbers){
                    //print the pair of numbers that add up to the sum
                    System.out.println(arr[i]+" & "+arr[j]);
                }
            }
        }
    }
}

/*
Add Up to Sum

        Given an int array and an int representing the sum number, create a program that can find the pair of numbers from the array that add up to the sum number

        Add the numbers from the array to determine the possible pairs that add up to the sum

        Ex:
            array = [8, 7, 2, 5, 3, 1]
            sum = 10

            output:
                8 & 2
                7 & 3
 */
