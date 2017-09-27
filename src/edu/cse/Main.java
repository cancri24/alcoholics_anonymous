package edu.cse;

public class Main {
    public static void main(String args[]) {
        System.out.println();
        Organizer john = new Organizer("John");
        String[] namelist = {"Jack", "Melissa", "Hope", "Brian", "Randolph"};
        Member[] alcoholics = new Member[namelist.length];
        for(int i = 0; i < alcoholics.length; i++) alcoholics[i] = new Member(namelist[i]);

        john.beginSession();
        for(int i = 0; i < alcoholics.length; i++) {
            alcoholics[i].introduce();
            john.greet(alcoholics[i].getname());
            for(int j = 0; j < alcoholics.length; j++) {
                if(j == i) j++;
                if(j < alcoholics.length) alcoholics[j].greet(alcoholics[i].getname());
            }
        }
    }
}
