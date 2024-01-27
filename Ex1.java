package Tut1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Ex1 {
    public static void main(String[] args) {
        testCases(9119, 811181);
        testCases(123,149);
        testCases(567, 253649);
    }
    public static int squareAndAdd(int input) {
        String intStr = String.valueOf(input);
        StringBuilder resultStr = new StringBuilder();
        int result = 0;
        for(int i = 0; i < intStr.length(); i++) {
            int digit = Character.getNumericValue(intStr.charAt(i));

            resultStr.append(digit * digit);

            result = Integer.parseInt(resultStr.toString());
        }
        return result;
    }

    @Test
    public void test() {
        if(assertEquals(811181,squareAndAdd(9119))) {
            System.out.println("TRUE");
        };
    }
}
