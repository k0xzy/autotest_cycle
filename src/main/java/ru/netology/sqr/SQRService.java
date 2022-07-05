package ru.netology.sqr;

public class SQRService {


    public int calcSqrtRange(int limitValuesStart, int limitValuesEnd) {
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i > limitValuesStart && i * i < limitValuesEnd) {

                sum++;
            }
        }
        return sum;
    }
}
