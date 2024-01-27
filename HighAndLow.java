package Tut1;

import org.junit.Test;
import static org.junit.Assert.*;




/**
 * you are given a string of space separated numbers, and have to return the highest and
 * lowest number.
 * Examples:
 * highAndLow("1 2 3 4 5") // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes:
 * - There will always be at least one number in the input string.
 * - Output string must be two numbers separated by a single space, and highest number is first
 */
public class HighAndLow {
    public static String highAndLow(String str)
    {

        // convert string of numbers to int []
        String[] parts = str.split(" ");
        int[] arr = new int[parts.length];
        for(int n = 0; n < parts.length; n++) {
            arr[n] = Integer.parseInt(parts[n]);
        }

        //find min and max
        int max= arr[0];
        int min = arr[0];
        for (int i=1; i< arr.length;i ++){
            if (min> arr[i]){
                min=arr[i];
            }
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max + " " + min;
    }
    @Test
    public void test01() {
        String input1 = "1 2 3 4 5";
        String expectedOut1 = "5 1";
        String actual1 = highAndLow(input1);
        assertEquals(expectedOut1, actual1);
        System.out.println("Input: " + input1 + " Expected output: " + expectedOut1 + " Actual output : " + actual1);
        if (actual1.equals(expectedOut1)) System.out.println("True");
    }


    @Test
    public void test02(){
        String input2 = "1 2 -3 4 5";
        String expectedOut2= "5 -3";
        String actual2 = highAndLow(input2);
        assertEquals(expectedOut2,actual2);
        System.out.println("Input: " + input2 + "Expected output: " + expectedOut2 + " Actual output : " + actual2);
        if (actual2.equals(expectedOut2)) System.out.println("True");
    }
    @Test
    public void test03(){
        String input3 = "1 9 3 4 -5";
        String expectedOut3= "9 5";
        String actual3 = highAndLow(input3);
        assertEquals(expectedOut3,actual3);
        System.out.println("Input: " + input3 + " Expected output: " + expectedOut3 + " Actual output : " + actual3);
        if (actual3.equals(expectedOut3)) System.out.println("True");
    }
    @Test
    public void test04(){
            String input4 = "-1 -9 -3 -4 -5";
            String expectedOut4= "1 -9";
            String actual4 = highAndLow(input4);
            assertEquals(expectedOut4,actual4);
            System.out.println("Input: " + input4 + " Expected output: " + expectedOut4 + "Actual output : " + actual4);
            if (actual4.equals(expectedOut4)) System.out.println("True");
        }
    }

