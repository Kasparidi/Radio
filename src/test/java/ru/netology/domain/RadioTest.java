package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldCheckStationInRange() {
        Radio radio = new Radio(5, 0, 9);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldCheckStationMoreMax() {
        Radio radio = new Radio(11, 0, 9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldCheckStationLessMin() {
        Radio radio = new Radio(-1, 0, 9);
        assertEquals(0, radio.getCurrentStation());
    }




}