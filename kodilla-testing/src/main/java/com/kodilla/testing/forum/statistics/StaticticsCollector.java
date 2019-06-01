package com.kodilla.testing.forum.statistics;

public class StaticticsCollector {
    Statistics statistics;
    public StaticticsCollector(Statistics statistics){
        this.statistics = statistics;
    }
    public void  calculateAdvStatistics(Statistics statistics){

        int postCount = statistics.postsCount();
        int comentsCount = statistics.commentsCount();
        int usersCount = statistics.usersNames().size();
        double avgPostsPerUser = postCount / usersCount;
        double avgCommentsPerUser = comentsCount / usersCount;
        double comentsVsposts = comentsCount / postCount;

    }
}
