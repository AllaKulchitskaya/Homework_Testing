package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    private User userWithParams;
    private User userWithoutParams;

    @BeforeEach
    public void SetUp() {
        userWithParams = new User("vasiliychizov", "chizov1234@yandex.ru");
        userWithoutParams = new User();
    }

    @Test
    public void createUserWithParameters() {
        Assertions.assertNotNull(userWithParams.getLogin());
        Assertions.assertNotNull(userWithParams.getEmail());
    }

    @Test
    public void createUserWithoutParameters() {
        Assertions.assertNull(userWithoutParams.getLogin());
        Assertions.assertNull(userWithoutParams.getEmail());

    }

    @Test
    public void checkIfEmailIsCorrect() {
        Assertions.assertTrue(userWithParams.getEmail().contains("@") && userWithParams.getEmail().contains("."));
    }

    @Test
    public void checkIfLoginAndEmailAreEqual() {
        Assertions.assertNotEquals(userWithParams.getLogin(), userWithParams.getEmail());
    }
}
