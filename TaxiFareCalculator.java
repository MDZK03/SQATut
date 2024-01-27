package Tut1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaxiFareCalculator {
    @Test public void testFare01() { assertEquals(10000, calculateFare(0.5)); }
    @Test public void testFare02() { assertEquals(10000 + 15000, calculateFare(1)); }
    @Test public void testFare03() { assertEquals(10000 + 15000 + 12000, calculateFare(2)); }
    @Test public void testFare04() { assertEquals(10000 + 15000 + 12000*9, calculateFare(10)); }
    @Test public void testFare05() { assertEquals(10000 + 15000 + 12000*9 + 11000*5, calculateFare(15)); }
    @Test public void testFare06() { assertEquals(260000, calculateFare(20)); }
    @Test public void testFare07() { assertEquals(290000, calculateFare(25)); }

    public int calculateFare(double distance) {
        int roundedDistance = (int) Math.floor(distance);
        if (roundedDistance == 0) {
            return 10000;
        }

        int fare = 25000; // Fare for the first kilometer
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
