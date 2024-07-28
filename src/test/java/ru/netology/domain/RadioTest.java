package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testParametrizedConstructor() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(29, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testUnParametrizedConstructor() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(5);
        radio.volumeUp();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreMax() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(5);
        radio.volumeDown();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLessMin() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(50);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationLessMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(-1);
        int expected = 29;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfterMaxNoSizeSettings() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 29;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}