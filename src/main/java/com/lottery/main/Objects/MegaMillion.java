package com.lottery.main.Objects;

import java.util.stream.Stream;

public class MegaMillion {

    private String draw_date;
    private int mega_ball;
    private int multiplier;

    public String getDraw_date() {
        return draw_date;
    }

    public void setDraw_date(String draw_date) {
        this.draw_date = draw_date;
    }

    public int getMega_ball() {
        return mega_ball;
    }

    public void setMega_ball(int mega_ball) {
        this.mega_ball = mega_ball;
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

    private String winning_numbers;


}
