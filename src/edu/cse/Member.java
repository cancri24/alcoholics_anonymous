package edu.cse;

class Member extends Attendee {

    Member(String name) {
        super(name);
    }

    void introduce() {
        System.out.println("My name is " + myname + ", and I'm an alcoholic.");
    }
}