package Tut1;
import org.junit.Test;
import static org.junit.Assert.*;

public class squareAndAdd {

    @Test public void test01() {assertEquals(811181,squareAndAddCalculator(9119));}
    @Test public void test02() {assertEquals(1234,squareAndAddCalculator(772));}
    @Test public void test03() {assertEquals(253649,squareAndAddCalculator(567));}
    @Test public void test04() {assertEquals(1111,squareAndAddCalculator(1112));}
    public static int squareAndAddCalculator(int input) {
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
}