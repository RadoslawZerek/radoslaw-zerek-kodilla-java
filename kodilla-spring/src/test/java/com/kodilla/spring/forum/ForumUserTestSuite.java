package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

public class ForumUserTestSuite {

    @Test
    void testGetUserName() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        ForumUser user = context.getBean(ForumUser.class);

        //When
        String userName = user.getUserName();

        //Then
        assertEquals("John Smith", userName);


    }
}
