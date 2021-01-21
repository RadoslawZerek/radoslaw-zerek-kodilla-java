package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public final class Forum {
    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser("Hommer", 1452, 'M',
                LocalDate.of(1989,07,20), 157));
        theForumUsersList.add(new ForumUser("Cleo", 7854, 'F',
                LocalDate.of(1996,05,17), 127));
        theForumUsersList.add(new ForumUser("Alice", 4512, 'F',
                LocalDate.of(1990,10,02), 87));
        theForumUsersList.add(new ForumUser("Ron", 2475, 'M',
                LocalDate.of(1978,01,20), 378));
        theForumUsersList.add(new ForumUser("Andy", 2892, 'M',
                LocalDate.of(1998,9,27), 12));
        theForumUsersList.add(new ForumUser("Monica", 7200, 'F',
                LocalDate.of(1996,4,1), 298));
        theForumUsersList.add(new ForumUser("Felicia", 8901, 'F',
                LocalDate.of(1985,7,30), 0));
        theForumUsersList.add(new ForumUser("Gilbert", 9012, 'M',
                LocalDate.of(1988,12,26), 0));
        theForumUsersList.add(new ForumUser("Randy", 4806, 'M',
                LocalDate.of(1993,3,10), 0));
        theForumUsersList.add(new ForumUser("Olivia", 1193, 'F',
                LocalDate.of(2000,11,17), 47));
    }
    public List<ForumUser> getUserList() {

        return new ArrayList<>(theForumUsersList);
    }
}
