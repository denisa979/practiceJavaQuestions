package InterviewQuestions.numbers_interview_questions;

public class DivideWithOutDividingOperator {

    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator


    int result = divide(6, 3);//2
    int result1 = divide(8, 2);//4

        System.out.println("Result of division " + result);
        System.out.println("Result of division " + result1);

}



    public static int divide(int n1, int n2) {


        if (n2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");//This checks if the divisor is zero. If it is, it throws an ArithmeticException because division by zero is undefined.

        }
        int temp = 0;
        while (n1 >= n2) {//6,2=>4=>2=>0 this loop continue substract the n2 from n1 until the n1 become less than n2 ==false
            n1 -= n2;
            temp++;


        }
        return temp;
    }
}


