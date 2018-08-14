package com.lottery.main.Objects;

import java.util.stream.Stream;

public class Powerball {
    private String draw_date;
    private int multiplier;
    private String winning_numbers;

    public String getDraw_date() {
        return draw_date;
    }

    public void setDraw_date(String draw_date) {
        this.draw_date = draw_date;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public int[] getWinning_numbers() {

        String[] numbers = this.winning_numbers.split(" ");
        return Stream.of(numbers).mapToInt(Integer::parseInt).toArray();

    }

    public void setWinning_numbers(String winning_numbers) {
        this.winning_numbers = winning_numbers;
    }
}
