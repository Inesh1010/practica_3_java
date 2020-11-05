package com.company.human;

public class Human {

    private Head head;
    private Leg leg;
    private Hand hand;


    public Human() {}

    public Human(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Head getHead() {
        return this.head;
    }



    public void setLeg(Leg leg) {
        this.leg = leg;
    }
    public Leg getLeg() {
        return this.leg;
    }



    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Hand getHand() {
        return this.hand;
    }


    @Override
    public String toString() {
        return "This is a human has " + this.head + ", a " + this.hand + ", and a " + this.leg;
    }

}