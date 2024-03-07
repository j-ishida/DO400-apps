package com.redhat.shipping;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShippingCalculatorTest {

    // @todo: add tests
    @Test
        public void canCalculateTheCostForARegion() {
        ShippingCalculator calculator = new ShippingCalculator();

        assertEquals(0, calculator.costForRegion("A Region"));
    }
    @Test
        public void onNARegionTheCostIs100() {
        assertEquals(100, (new ShippingCalculator()).costForRegion("NA"));
    }
}