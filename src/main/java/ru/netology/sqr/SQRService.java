package ru.netology.sqr;

public class SQRService {
    int sum = 0;
    public int calcSqrt(int x, int y) {
        for ( int i = 10; i <= 99; i++ ) {
            if ( i * i > x && i * i < y) {
                sum++;
            }
        }
        return sum;
    }
}
