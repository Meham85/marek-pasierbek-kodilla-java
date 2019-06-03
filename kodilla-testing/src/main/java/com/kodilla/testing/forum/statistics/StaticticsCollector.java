package com.kodilla.testing.forum.statistics;

public class StaticticsCollector {
    Statistics statistics;
    private int postCount;
    private int comentsCount;
    private int usersCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double comentsVsposts;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getComentsCount() {
        return comentsCount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getComentsVsposts() {
        return comentsVsposts;
    }

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
