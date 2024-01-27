package Tut1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class taxPriceCalculate {
    @Test public void taxPrice01() { assertEquals(11.42, taxPriceCalculator(12),0.01); }
    @Test public void taxPrice02() { assertEquals(218.18, taxPriceCalculator(240),0.01); }
    @Test public void taxPrice03() { assertEquals(1000, taxPriceCalculator(1110),0.01); }
    @Test public void taxPrice04() { assertEquals(409.09, taxPriceCalculator(450),0.01); }
    @Test public void taxPrice05() { assertEquals(3500, taxPriceCalculator(3750),0.01); }
    public static double taxPriceCalculator (double fullPrice) {
        double pretaxPrice;
        double calculate;
        if (fullPrice < 100 && fullPrice > 0) {
            calculate = fullPrice / (1 + 0.05);
        } else {
            calculate = fullPrice / (1 + 0.1);
        }
        pretaxPrice = Math.floor(calculate * 100.0) / 100.0;
        return  pretaxPrice;
    }
}
