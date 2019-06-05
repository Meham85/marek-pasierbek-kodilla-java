package com.kodilla.testing.forum.statistics;
import java.math.BigDecimal;
public class StatCollector {
    private int usersCount;
    private int comentsCount;
    private int postCount;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double comentsVsposts;

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

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        comentsCount = statistics.commentsCount();
        postCount = statistics.postsCount();

        if (usersCount >0) {
            avgPostsPerUser = (double)postCount / usersCount;
        }
        else {

            avgPostsPerUser = 0;
        }
        if (usersCount > 0){
            avgCommentsPerUser = (double)comentsCount / usersCount;
        }
        else {
            avgCommentsPerUser = 0;
        }

        if( postCount >0 && usersCount >0 ) {
            comentsVsposts = (double)comentsCount / postCount;
        }
        else { comentsVsposts = 0;}

    }
    public void showStatistics() {
        System.out.println("Users = " + usersCount + " Posts = " + postCount + " Coments =" + comentsCount + " Avg Post/User= " + avgPostsPerUser + " Avg Comenst/User= " + avgCommentsPerUser + " Avg coments/post= " + comentsVsposts);
    }
}
