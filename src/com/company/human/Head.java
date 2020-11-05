package com.company.human;

public class Head {

    private String haircut;
    private String hair_color;
    private String eye_color;



    public Head() {}

    public Head(String haircut, String hair_color, String eye_color) {
        this.haircut = haircut;
        if (this.haircut.toLowerCase().equals("bald"))
            this.hair_color = "";
        else
            this.hair_color = hair_color;
        this.eye_color = eye_color;
    }



    public void setHaircut(String haircut) {
        this.haircut = haircut;
        if (this.haircut.toLowerCase().equals("bald"))
            this.hair_color = "";
    }

    public String getHaircut() {
        return this.haircut;
    }



    public void setHair_color(String hair_color) {
        if (!this.haircut.toLowerCase().equals("bald"))
            this.hair_color = hair_color;
    }

    public String getHair_color() {
        return this.hair_color;
    }



    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getEye_color() {
        return this.eye_color;
    }



    @Override
    public String toString() {
        return "head with " + this.hair_color + " " + this.haircut + " haircut and " + this.eye_color + " eyes";
    }

}