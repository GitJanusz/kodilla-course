package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> Period.between(user.getBirthDate(), LocalDate.now()).getYears() >= 20)
                .filter(user -> user.getPostsCountPublished() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}