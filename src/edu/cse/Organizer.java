package edu.cse;

class Organizer extends Attendee {
    Organizer(String name) {
        super(name);
    }

    void beginSession() {
        System.out.println("Hello everyone, my name is " + myname + ".");
        System.out.println("Would anyone like to start us off with introductions?\n");
    }

    void react() {

    }
}