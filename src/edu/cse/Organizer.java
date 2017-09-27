package edu.cse;

class Organizer extends Attendee {
    String name;

    void beginSession() {
        System.out.println("Hello everyone, my name is " + name + ".");
        System.out.println("Would anyone like to start us off with introductions?\n");
    }

    void react() {

    }
}