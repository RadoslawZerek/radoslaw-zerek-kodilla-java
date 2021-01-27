package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Test
    void probablyIWillThrowExceptionTest() {

        //Given
        SecondChallenge challenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(2, -1)),
                () -> assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1, 2)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(1.5, 1.5)));
    }
}
