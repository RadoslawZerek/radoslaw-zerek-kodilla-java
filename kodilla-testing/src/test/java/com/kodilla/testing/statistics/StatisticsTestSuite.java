package com.kodilla.testing.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    private Statistics statistics;

    @BeforeEach
    public void beforeEveryTest() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void afterEveryTest() {
        System.out.println("Test case: end");
    }

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Test suite: begin");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Test suite: end");
    }

    private List<String> generateNUsernames(int quantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= quantity; n++) {
            String userName = "TestUsername " + n;
            resultList.add(userName);
        }
        return resultList;
    }

    private void mockDatabase(int users, int posts, int comments) {
        when(statistics.usersNames()).thenReturn(generateNUsernames(users));
        when(statistics.postsCount()).thenReturn(posts);
        when(statistics.commentsCount()).thenReturn(comments);
    }

    @Nested
    @DisplayName("Tests for posts quantity")
    class TestsForPosts {
        @Test
        void testIfPosts0() {
            CalculateStatistics calculate = new CalculateStatistics();
            mockDatabase(50, 0, 20);
            calculate.calculateAdvStatistics(statistics);

            double result1 = calculate.getAverageCommentsPerPost();
            double result2 = calculate.getAveragePostsPerUser();
            double result3 = calculate.getAverageCommentsPerUser();

            assertEquals(0, result1);
            assertEquals(0, result2);
            assertEquals(0, result3);
        }
        @Test
        void testIfPosts1000() {
            CalculateStatistics calculate = new CalculateStatistics();
            mockDatabase(40, 1000, 2000);
            calculate.calculateAdvStatistics(statistics);

            double result1 = calculate.getAverageCommentsPerPost();
            double result2 = calculate.getAveragePostsPerUser();

            assertEquals(2, result1);
            assertEquals(25, result2);
        }
    }

    @Nested
    @DisplayName("Tests for comments quantity")
    class TestsForComments {
        @Test
        void testIfComments0() {
            CalculateStatistics calculate = new CalculateStatistics();
            mockDatabase(40, 1000, 0);
            calculate.calculateAdvStatistics(statistics);

            double result1 = calculate.getAverageCommentsPerPost();
            double result2 = calculate.getAveragePostsPerUser();
            double result3 = calculate.getAverageCommentsPerUser();

            assertEquals(0, result1 + result2 + result3);
        }
        @Test
        void testIfCommentsLessThanPosts() {
            CalculateStatistics calculate = new CalculateStatistics();
            mockDatabase(40, 1000, 500);
            calculate.calculateAdvStatistics(statistics);

            double result1 = calculate.getAverageCommentsPerPost();
            double result2 = calculate.getAverageCommentsPerUser();

            assertEquals(0.5, result1);
            assertEquals(12.5, result2);
        }
        @Test
        void testIfCommentsMoreThanPosts() {
            CalculateStatistics calculate = new CalculateStatistics();
            mockDatabase(10, 1000, 2000);
            calculate.calculateAdvStatistics(statistics);

            double result1 = calculate.getAverageCommentsPerPost();
            double result2 = calculate.getAverageCommentsPerUser();

            assertEquals(2, result1);
            assertEquals(200, result2);
        }
    }

    @Nested
    @DisplayName("Tests for users quantity")
    class TestsForUsers {
        @Test
        void testIfUsers0() {
            CalculateStatistics calculate = new CalculateStatistics();
            mockDatabase(0, 1000, 2000);
            calculate.calculateAdvStatistics(statistics);

            double result1 = calculate.getAveragePostsPerUser();
            double result2 = calculate.getAverageCommentsPerUser();

            assertEquals(0, result1);
            assertEquals(0, result2);
        }
        @Test
        void testIfUsers100() {
            CalculateStatistics calculate = new CalculateStatistics();
            mockDatabase(100, 120, 754);
            calculate.calculateAdvStatistics(statistics);

            double result1 = calculate.getAveragePostsPerUser();
            double result2 = calculate.getAverageCommentsPerUser();

            assertEquals(1.2, result1);
            assertEquals(7.54, result2);
        }
    }
}