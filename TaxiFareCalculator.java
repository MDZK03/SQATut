package Tut1;

public class TaxiFareCalculator {

    public static void main(String[] args) {
        TaxiFareCalculator calculator = new TaxiFareCalculator();

        // Test cases
        testFare(calculator, 0, 10000);
        testFare(calculator, 1, 15000);
        testFare(calculator, 10, 123000);
        testFare(calculator, 15, 178000);
        testFare(calculator, 20, 233000);
        testFare(calculator, 25, 286000);
    }

    private static void testFare(TaxiFareCalculator calculator, double distance, int expectedFare) {
        int calculatedFare = calculator.calculateFare(distance);
        System.out.println("Fare for " + distance + " km (expected " + expectedFare + "): " + calculatedFare);
    }

    public int calculateFare(double distance) {
        int roundedDistance = (int) Math.ceil(distance);
        if (roundedDistance == 0) {
            return 10000;
        }

        int fare = 15000; // Fare for the first kilometer
        if (roundedDistance > 1) {
            fare += Math.min(9, roundedDistance - 1) * 12000;
            if (roundedDistance > 10) {
                int remainingKm = roundedDistance - 10;
                int fareStep = 11000;

                while (remainingKm > 0) {
                    fare += Math.min(10, remainingKm) * fareStep;
                    remainingKm -= 10;
                    if (fareStep > 7000) {
                        fareStep -= 500;
                    }
                }
            }
        }

        return (int) Math.ceil(fare / 1000.0) * 1000; // Rounding up to the nearest thousands
    }
}
