package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldReturnSoundsVolumeMore() {
        Radio radio = new Radio();
        int soundVolume = 11;
        int expected = 0;
        radio.setSoundVolume(soundVolume);
        assertEquals(expected, radio.getSoundVolume());
    }

    @Test
    void shouldReturnSoundsVolumeLess() {
        Radio radio = new Radio();
        int soundVolume = -1;
        int expected = 0;
        radio.setSoundVolume(soundVolume);
        assertEquals(expected, radio.getSoundVolume());
    }
}