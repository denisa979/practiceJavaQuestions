package InterviewQuestions.numbers_interview_questions;

public class StringConcatenation {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;
        s3.intern();
        String s4 = "HelloWorld";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println("-----------------------------------------------------------------------------------------");

        String t1="Hello";
        String t2="World";
        String t3=t1+t2;
        t3.intern();
        String t4="HelloWorld";
        System.out.println(t3==t4);
        System.out.println(t3.equals(t4));

    }
}






