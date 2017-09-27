package edu.cse;

class Member extends Attendee{
    String name;
    void introduce() {
        System.out.println("My name is " + name + ", and I'm an alcoholic.");
    }
}