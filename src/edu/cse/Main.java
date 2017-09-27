package edu.cse;

public class Main {
    public static void main(String args[]) {
        System.out.println();
        Organizer john = new Organizer("John"); //creates Organizer named John
        String[] memberlist = {"Jack", "Melissa", "Hope", "Brian", "Randolph"}; //names of all members
        Member[] alcoholics = new Member[memberlist.length]; //array of Members
        for(int i = 0; i < alcoholics.length; i++) alcoholics[i] = new Member(memberlist[i]);

        john.beginSession();
        for(int i = 0; i < alcoholics.length; i++) {
            alcoholics[i].introduce();//each Member introduces themselves
            john.greet(alcoholics[i].getname());
            for(int j = 0; j < alcoholics.length; j++) {
                if(j == i) j++;
                if(j < alcoholics.length) alcoholics[j].greet(alcoholics[i].getname()); //each other Member says hi.
            }
            System.out.println();
        }
    }
}