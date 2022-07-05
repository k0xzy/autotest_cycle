package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expect = 3;
        int actual = service.calcSqrt(200, 300);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalcExact2() {
        SQRService service = new SQRService();

        int expect = 5;
        int actual = service.calcSqrt(200, 400);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalcExact3() {
        SQRService service = new SQRService();

        int expect = 4;
        int actual = service.calcSqrt(100, 200);
        Assertions.assertEquals(expect, actual);
    }

}
