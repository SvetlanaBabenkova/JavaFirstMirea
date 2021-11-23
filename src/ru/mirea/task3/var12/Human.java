package ru.mirea.task3.var12;

public class Human {
    String name;
    int leg,hand, head;

    public Human(String name, int head, int leg, int hand) {
        this.name = name;
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getHead() {return head;}
    public void setHead(int head) {this.head = head;}

    public int getLeg() {return leg;}
    public void setLeg(int leg) {this.leg = leg;}

    public int getHand() {return hand;}
    public void setHand(int hand) {this.hand = hand;}


    public String toString() {
        return "Name: " + name  + ", with " + head + " head(s), " + leg + " leg(s) and " + hand +" hand(s)";
    }
}
