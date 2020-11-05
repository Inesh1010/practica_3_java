package com.company.human;
import java.lang.Math;

public class HumanTest {

    public static void main(String[] args) {

        Head head_setter = new Head("fro", "brown", "hazel");
        Leg leg_setter = new Leg("jeans");
        Hand hand_setter = new Hand("shirt", "brush");
        Human all_setter = new Human(head_setter, leg_setter, hand_setter);

        System.out.println("\nall_setter'S SUMMARY:\n" + all_setter);


        // Building a new human from scratch
        // Making empty objects for every human component

        Head Man_Head = new Head();
        Leg Man_Leg = new Leg();
        Hand Man_Hand = new Hand();
        Human Man = new Human();


        // Constructing a head
        Man_Head.setHaircut("bald");
        Man_Head.setHair_color("hair should not exist");
        Man_Head.setEye_color("blue");

        System.out.println("\nOLD ANGRY GUY'S HEAD'S SUMMARY:");
        System.out.println("HAIRCUT: " + Man_Head.getHaircut());
        System.out.println("HAIR COLOR: " + Man_Head.getHair_color());
        System.out.println("EYE COLOR: " + Man_Head.getEye_color());

        Man_Head.setHaircut("short"); // changing haircut for test if it will display hair color
        Man_Head.setHair_color("black");


        // Constructing a leg
        Man_Leg.setClothing("jeans");

        System.out.println("\nOLD ANGRY GUY'S LEG'S SUMMARY:");
        System.out.println("LEG CLOTHING: " + Man_Leg.getClothing());


        // Constructing a hand
        Man_Hand.setClothing("sweater");
        Man_Hand.setClock("microphone");

        System.out.println("\nOLD ANGRY GUY'S HAND'S SUMMARY:");
        System.out.println("HAND CLOTHING: " + Man_Hand.getClothing());
        System.out.println("HAND clock: " + Man_Hand.getClock());


        // Linking the components
        Man.setHead(Man_Head);
        Man.setLeg(Man_Leg);
        Man.setHand(Man_Hand);


        // Summarize
        System.out.println("\nGEORGE CARLIN'S SUMMARY:");
        System.out.println(Man);
    }
}