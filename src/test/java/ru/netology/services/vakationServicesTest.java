package ru.netology.services;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions;

public class vakationServicesTest {
    @Test
    void testim() {
        calculationMethod service = new calculationMethod();

        int result = service.calculate(75_000, 50_000, 150_000);
        System.out.println(result + " мес. отпуска в этом году!");

    }
}