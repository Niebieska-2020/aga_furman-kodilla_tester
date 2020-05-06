package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double averageNumberOfPostsWhenUserAgeIsUp40 = UsersRepository.getUsersList()
            .stream()
            .filter(a -> a.getAge() >= 40 && a.getNumberOfPosts() !=0)
            .mapToInt(User::getNumberOfPosts)
            .average()
            .getAsDouble();
        System.out.println("Average number of posts users which age is more than 40: " + averageNumberOfPostsWhenUserAgeIsUp40);

        double averageNumberOfPostsWhenUserAgeIsBelow40 = UsersRepository.getUsersList()
            .stream()
            .filter(a -> a.getAge() < 40 && a.getNumberOfPosts() !=0)
            .mapToInt(User::getNumberOfPosts)
            .average()
            .getAsDouble();
        System.out.println("Average number of posts users which age is less than 40: " + averageNumberOfPostsWhenUserAgeIsBelow40);
    }
}
