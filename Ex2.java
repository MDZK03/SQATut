package Tut1;

public class Ex2 {
    public static double taxPriceCalculator (double fullPrice) {
        double pretaxPrice = 0;
        if (fullPrice < 100 && fullPrice > 0) {
            double calculate = fullPrice / (1 + 0.05);
            pretaxPrice = Math.floor(calculate * 100.0) / 100.0;
        } else {
            double calculate = fullPrice / (1 + 0.1);
            pretaxPrice = Math.floor(calculate * 100.0) / 100.0;
        }
        return  pretaxPrice;
    }

    public static void main(String[] args) {
        testPrice(12,11.42);
        testPrice(110, 99.99);
        testPrice(240,218.18);
    }
    public static void testPrice(double input, double expected) {
        System.out.println("Sale price: " + input + " (Expected pre-tax price: " + expected + "). Actual pre-tax price: " + taxPriceCalculator(input));
        if (expected == taxPriceCalculator(input)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
