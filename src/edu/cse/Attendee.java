package edu.cse;

class Attendee {
    String myname;

    Attendee(String name) {
        myname = name;

    }

    void greet(String person) {
        System.out.println("Hi " + person + ".");
    }

    String getname() {
        return myname;
    }

}