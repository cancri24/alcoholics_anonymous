package edu.cse;

class Organizer extends Attendee{

    Organizer(String name) {
        super(name);
    }

    void breakIce() {
        System.out.println("Hello everyone, my name is " + myname + ". I'll be the organizer of this session.");
        System.out.println("Would anyone like to start us off with introductions?" +
                " Just state your name and why you're here.\n");
    }
}