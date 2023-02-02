package com.sdatqap1;

public class Timer {

    // Initialize the instance variables
    private int hour;
    private int minute;
    private int second;

    // Create a parameterized constructor
    public Timer(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Create a method to return the hour
    public int getHour() {
        return hour;
    }

    // Create a method to return the minute
    public int getMinute() {
        return minute;
    }

    // Get second
    public int getSecond() {
        return second;
    }

    // Set hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    //Set minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Set second
    public void setSecond(int second) {
        this.second = second;
    }

    // Set time formatted for calculation using the set methods
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Create a time formatted string for user display
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Calculate the second incremented by 1
    public Timer nextSecond() {
        ++second;
        if (second >= 60) {
            second = 0;
            ++minute;
        }
        if (minute >= 60) {
            minute = 0;
            ++hour;
        }
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }

    // Calculate the second decremented by 1
    public Timer previousSecond() {
        --second;
        if (second < 0) {
            second = 59;
            --minute;
        }
        if (minute < 0) {
            minute = 59;
            --hour;
        }
        if (hour < 0) {
            hour = 23;
        }
        return this;
    }
}