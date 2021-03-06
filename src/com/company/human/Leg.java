package com.company.human;

public class Leg {

    private String clothing;

    public Leg() {}

    public Leg(String clothing) {
        this.clothing = clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getClothing() {
        return this.clothing;
    }

    @Override
    public String toString() {
        return "Leg wearing " + this.clothing;
    }

}