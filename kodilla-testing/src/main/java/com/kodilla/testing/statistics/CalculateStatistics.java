package com.kodilla.testing.statistics;

public class CalculateStatistics {
    private double userCount, postCount, commentCount;
    private double averagePostsPerUser, averageCommentsPerUser, averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        if (userCount != 0 && postCount != 0 && commentCount != 0) {
            averagePostsPerUser = (double) Math.round((postCount / userCount) * 100) / 100;
            averageCommentsPerUser = (double) Math.round((commentCount / userCount) * 100) / 100;
            averageCommentsPerPost = (double) Math.round((commentCount / postCount) * 100) / 100;
        } else {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
            averageCommentsPerPost = 0;
        }
    }
    public void showStatistics() {
        System.out.println(
                "Total Users: " + userCount + "Total Posts: " + postCount
                        + "Total Comments: " + commentCount
                        +"Average Posts Per User: " + averagePostsPerUser
                        +"Average Comments Per User: " + averageCommentsPerUser
                        + "Average Comments Per Post: "+averageCommentsPerPost);
    }
    public double getUserCount() {
        return userCount;
    }
    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }
    public double getPostCount() {
        return postCount;
    }
    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }
    public double getCommentCount() {
        return commentCount;
    }
    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }
    public void setAveragePostsPerUser(double averagePostsPerUser) {
        this.averagePostsPerUser = averagePostsPerUser;
    }
    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }
    public void setAverageCommentsPerUser(double averageCommentsPerUser) {
        this.averageCommentsPerUser = averageCommentsPerUser;
    }
    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
    public void setAverageCommentsPerPost(double averageCommentsPerPost) {
        this.averageCommentsPerPost = averageCommentsPerPost;
    }
}