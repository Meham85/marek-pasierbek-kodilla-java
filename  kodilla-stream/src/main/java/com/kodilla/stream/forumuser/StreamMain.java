package com.kodilla.stream.forumuser;
import java.util.Map;
import java.util.stream.Collectors;
import com.kodilla.stream.forumuser.ForumUser;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> NewForum = forum.getUserList().stream()
                .filter(fuser-> fuser.getSex() == 'M')
                .filter(fuser -> fuser.getDateOfBirth().getYear() <= 1999)
                .filter(fuser -> fuser.getPostsCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, fuser -> fuser));

        System.out.println("# elements: " + NewForum.size());
        NewForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);






    }
}