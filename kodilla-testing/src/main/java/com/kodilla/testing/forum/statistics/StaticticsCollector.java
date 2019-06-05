package com.kodilla.testing.forum.statistics;

public class StatisticsCollector {
    /*Statistics statistics; */

    public StatisticCollector(Statistics statistic){
        this.statistics = statistics;
    }

    /* Statistics statistics; */
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

    /* public StaticticsCollector(Statistics statistics){
        this.statistics = statistics; */

    public void  calculateAdvStatistics(Statistics statistics){
        Statistics statistics = new Statistics<Statistics>; /* nie tworze obiektu bo dostarczy go interface z mockiem */
        int postCount = statistics.postsCount() /* metoda z interfacu ktora zwroci ilosc postow */;
        int comentsCount = statistics.commentsCount();
        int usersCount = statistics.usersNames().size();
        double avgPostsPerUser = postCount / usersCount;
        double avgCommentsPerUser = comentsCount / usersCount;
        double comentsVsposts = comentsCount / postCount;

    }
}

