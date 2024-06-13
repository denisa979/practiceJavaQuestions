package InterviewQuestions.arrays_interview_questions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        frequencyOfEachElement(new String[]{"Apple","Banana","Apple","Cherry"});

        frequencyOfElements(new String[]{"Apple","Banana","Apple","Cherry"});
    }

    public static void frequencyOfEachElement(String[]arr){
        Map<String, Integer> map = new HashMap<>();

        //loop through each element in the array
        for (String each : arr){
            //increment the count of each element in the map
            if(!map.containsKey(each)) {
                map.put(each,0);
            }
            map.put(each, map.get(each)+1);
        }
        //print the result
        map.forEach((k,v)-> System.out.println(k+"="+v));
    }
    public static void frequencyOfElements(String[]array){
        String result ="";
        //loop through each element in the array
        for (String first : array){
            int count =0;
            //count the frequency of the current element in the array
            for (String each : array){
                if(first.equals(each)){
                    count++;
                }
            }
            //add the element and its frequency to the result string if not already added
            if(!result.contains(first)){
                result += first + "=" +count + "\n";
            }
        }
        System.out.println(result);
    }
}

 /*
        Frequency Of Each Element

        Given an array find the frequency of each element. The frequency is the number of times each element appears in the array

        Ex:
            input:
                frequencyElement("Apple","Banana","Apple","Cherry")
            output:
                Apple = 2
                Banana = 1
                Cherry = 1
     */
