package org.fasttrackit;

import java.time.Month;

public class PetFood {
    String name = "Royal";
    int price = 0;
    int quantity = 0;
    int expiringDate = 2025;
    double stockAvailability = 5;

    public void getExpiringDate() {
        java.time.LocalDate.of(2019, Month.JANUARY, 1)
                .plusMonths(24)
                .toString();

    }
}