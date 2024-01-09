package com.company;

public class BonusMilesService {
    int price;
    int ruble = 20;
    int miles1 = 1;
    int miles;

    public int calculate(int price) {
        return price * miles1 / ruble;
    }
}
