package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FelineTest {


    @Test
    void eatMeatDefault() throws Exception {
        Feline feline = new Feline();
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, feline.eatMeat());
    }

    @Test
    void getFamilyDefault() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }

    @Test
    void getKittensDefault() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,0,1})
    void getKittensWithArgument(int value) {
        Feline feline = new Feline();
        int actual = feline.getKittens(value);
        assertEquals(value, actual);
    }
}