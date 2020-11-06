package com.company.human;
import java.lang.Math;

public class HumanTest {

    public static void main(String[] args) {

        Head head_setter = new Head("bob", "black", "blue");
        Leg leg_setter = new Leg("skirt");
        Hand hand_setter = new Hand("shirt", "rolex");
        Human all_setter = new Human(head_setter, leg_setter, hand_setter);

        System.out.println("\n" + all_setter);




        Head Man_Head = new Head();
        Leg Man_Leg = new Leg();
        Hand Man_Hand = new Hand();
        Human Man = new Human();


        // Тестируем класс Head
        Man_Head.setHaircut("long");
        Man_Head.setHair_color("hair should not exist");
        Man_Head.setEye_color("blue");
        System.out.println("Haircut: " + Man_Head.getHaircut());
        System.out.println("Hair color: " + Man_Head.getHair_color());
        System.out.println("Eye color: " + Man_Head.getEye_color());
        Man_Head.setHaircut("short");
        Man_Head.setHair_color("black");


        //Тестируем класс leg
        Man_Leg.setClothing("jeans");
        System.out.println("Leg clothing: " + Man_Leg.getClothing());


        //Тестируем класс hand
        Man_Hand.setClothing("T-shirt");
        Man_Hand.setClock("Casio");
        System.out.println("Hand clothing: " + Man_Hand.getClothing());
        System.out.println("Hand clock: " + Man_Hand.getClock());


        // Linking the components
        Man.setHead(Man_Head);
        Man.setLeg(Man_Leg);
        Man.setHand(Man_Hand);


        // Summarize
        System.out.println("\nHuman:");
        System.out.println(Man);
    }
}