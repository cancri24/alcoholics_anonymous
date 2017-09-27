package edu.cse;

public class Main {
    public static void main(String args[]) {
        System.out.println();
        Organizer john = new Organizer();
        john.name = "John";
        Member[] alcoholics = new Member[5];
        for(int i = 0; i < alcoholics.length; i++) alcoholics[i] = new Member();
        alcoholics[0].name = "Jack";
        alcoholics[1].name = "Melissa";
        alcoholics[2].name = "Hope";
        alcoholics[3].name = "Brian";
        alcoholics[4].name = "Randolph";

        john.beginSession();
        for(int i = 0; i < alcoholics.length; i++) alcoholics[i].introduce();
    }
}
