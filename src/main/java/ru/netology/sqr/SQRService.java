package ru.netology.sqr;

public class SQRService {
    public int numberSqr(int min, int max) {
        int n = 0;
        for (int i = 10; i <= 99; i++) {
            if (min <= i * i & i * i <= max) {
                n = n + 1;
            }
        }
        return n;
    }

}
