package ru.netology.domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


    class RadioTest {
        Radio radio = new Radio();

        //Номер текущей радиостанции

        @Test
        public void shouldSetRadioStation() {
            radio.setCurrentRadioStation(5);

            int expected = 5;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNotSetRadioStationFirst() {
            radio.setCurrentRadioStation(10);

            int expected = 0;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNotSetRadioStationSecond() {
            radio.setCurrentRadioStation(-1);

            int expected = 0;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSetToMaxRadioStation() {
            radio.setToMaxRadioStation();

            int expected = 9;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSetToMinRadioStation() {
            radio.setToMinRadioStation();

            int expected = 0;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldPlayNextRadioStationFirst() {
            radio.setCurrentRadioStation(9);
            radio.nextRadioStation();

            int expected = 0;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldPlayNextRadioStationSecond() {
            radio.setCurrentRadioStation(0);
            radio.nextRadioStation();

            int expected = 1;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldPlayPrevRadioStationFirst() {
            radio.setCurrentRadioStation(0);
            radio.prevRadioStation();

            int expected = 9;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldPlayPrevRadioStationSecond() {
            radio.setCurrentRadioStation(9);
            radio.prevRadioStation();

            int expected = 8;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        //Громкость звука

        @Test
        public void shouldSetVolume() {
            radio.setCurrentVolume(55);

            int expected = 55;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNotSetVolumeFirst() {
            radio.setCurrentVolume(107);

            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNotSetVolumeSecond() {
            radio.setCurrentVolume(-10);

            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSetToMaxVolume() {
            radio.setToMaxVolume();

            int expected = 100;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSetToMinVolume() {
            radio.setToMinVolume();

            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldAugmentVolumeFirst() {
            radio.setCurrentVolume(100);
            radio.augmentVolume();

            int expected = 100;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldAugmentVolumeSecond() {
            radio.setCurrentVolume(0);
            radio.augmentVolume();

            int expected = 1;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldDecrementVolumeFirst() {
            radio.setCurrentVolume(0);
            radio.decrementVolume();

            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldDecrementVolumeSecond() {
            radio.setCurrentVolume(100);
            radio.decrementVolume();

            int expected = 99;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }
    }