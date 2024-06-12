package InterviewQuestions.collections_interview_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("java","api", "selenium","sql")); // first way using for each loop

       for(String each: set){
           System.out.println(each);

        }

        Iterator<String> it = set.iterator(); // second way using iterator method
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }


}
/*
    Create a program to iterate through a Set and print the values. The main focus here is to check your understanding of collection type and how Set is different from others.

    Ex:
         input:
             set: ["java", "selenium", "sql", "api"]

        output:
            java
            selenium
            sql
            api
 */