package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(123, "Johny11", 'M', 1998, 12, 13, 0));
        forumUserList.add(new ForumUser(234, "Flower14", 'F', 1999, 11, 14, 1));
        forumUserList.add(new ForumUser(345, "Shark007", 'M', 2000, 10, 3, 2));
        forumUserList.add(new ForumUser(456, "Angel0", 'F', 2002, 9, 4, 3));
        forumUserList.add(new ForumUser(567, "Cookie123", 'F', 1999, 10, 5, 4));
        forumUserList.add(new ForumUser(678, "Speed1023", 'M', 1998, 11, 6, 1));
        forumUserList.add(new ForumUser(789, "23Heart", 'F', 2001, 3, 6, 3));
        forumUserList.add(new ForumUser(890, "Diamond", 'F', 1998, 4, 14, 0));
        forumUserList.add(new ForumUser(901, "BlackMan", 'M', 2002, 6, 22, 2));
        forumUserList.add(new ForumUser(210, "GoldenGirl", 'F', 1996, 5, 28, 0));
        forumUserList.add(new ForumUser(321, "BooooB1", 'M', 1994, 8, 18, 2));
        forumUserList.add(new ForumUser(432, "Chocolate15", 'F', 2004, 11, 24, 4));
        forumUserList.add(new ForumUser(543, "Clara55", 'F', 1999, 1, 21, 0));
        forumUserList.add(new ForumUser(654, "00BigGay", 'M', 1992, 2, 5, 6));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
