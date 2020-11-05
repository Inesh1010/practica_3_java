package com.company.human;

public class Hand {

    private String clothing;
    private String clock;



    public Hand() {}

    public Hand(String clothing, String clock) {
        this.clothing = clothing;
        this.clock = clock;
    }



    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getClothing() {
        return this.clothing;
    }



    public void setClock(String clock) {
        this.clock = clock;
    }

    public String getClock() {
        return this.clock;
    }



    @Override
    public String toString() {
        return "Hand wearing " + this.clothing + " and holding " + this.clock;
    }

}