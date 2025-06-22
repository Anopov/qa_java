package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline feline;

    @Test
    void getKittensDefault() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int result = lion.getKittens();
        assertEquals(0, result);
    }

    @Test
    void doesHaveManeTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean result = lion.doesHaveMane();
        assertTrue(result);
    }

    @Test
    void doesDontHaveManeFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean result = lion.doesHaveMane();
        assertFalse(result);
    }

    @Test
    void doesHaveManeException() {
        assertThrows(Exception.class, () -> new Lion("Иное", feline));
    }

    @Test
    void getFoodDefault() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> actual = lion.getFood();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, actual);

    }
}