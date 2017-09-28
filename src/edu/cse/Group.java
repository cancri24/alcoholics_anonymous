package edu.cse;

class Group {
    private Organizer john;
    private String[] memberlist = {"Jack", "Melissa", "Hope", "Brian", "Randolph",
                                   "Deloise", "Tifany", "Marie", "Layla", "Louise"}; //names of all members
    private Member[] alcoholics;

    Group() {
        john = new Organizer("John"); //creates Organizer named John
        alcoholics = new Member[(int)(Math.random()*10+1)]; //array of Members
        for (int i = 0; i < memberlist.length; i++) {
            int r = (int) (Math.random() * (i+1));
            String swap = memberlist[r];
            memberlist[r] = memberlist[i];
            memberlist[i] = swap;
        }
        for(int i = 0; i < alcoholics.length; i++) alcoholics[i] = new Member(memberlist[i]);

    }

    void startSession() {
        john.breakIce();
        for (int i = 0; i < alcoholics.length; i++) {
            alcoholics[i].introduce(); //each Member introduces themselves
            john.greet(alcoholics[i].getname());
            for (int j = 0; j < alcoholics.length; j++) {
                if (j == i) j++;
                if (j < alcoholics.length) alcoholics[j].greet(alcoholics[i].getname()); //each other Member says hi.
            }
            System.out.println();
        }
    }
}
