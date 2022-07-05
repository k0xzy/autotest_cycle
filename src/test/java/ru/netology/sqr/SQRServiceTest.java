package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void normalBorder() {
        SQRService service = new SQRService();

        int expect = 3;
        int actual = service.calcSqrtRange(200, 300);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void endBorder() {
        SQRService service = new SQRService();

        int expect = 1;
        int actual = service.calcSqrtRange(9800, 9900);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void startBorder() {
        SQRService service = new SQRService();

        int expect = 4;
        int actual = service.calcSqrtRange(100, 200);
        Assertions.assertEquals(expect, actual);
    }

}
