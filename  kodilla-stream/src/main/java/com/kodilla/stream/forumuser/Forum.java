
package com.kodilla.stream.forumuser;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUser = new ArrayList<>();

    public Forum() {
        forumUser.add(new ForumUser(1,"Marek",'M',1985,8,26,20));
        forumUser.add(new ForumUser(2,"Michał",'M',2011,2,22,625));
        forumUser.add(new ForumUser(3,"Magda",'F',1982,11,26,12));
        forumUser.add(new ForumUser(4,"Miłosław",'M',2015,11,24,122));
        forumUser.add(new ForumUser(5,"Mikołaj",'M',2009,5,14,66));
        forumUser.add(new ForumUser(6,"Kot Chruścik",'M',700,6,30,10));

    }

    public List<ForumUser> getUserList(){

        return new  ArrayList<ForumUser>(forumUser);
    }


}