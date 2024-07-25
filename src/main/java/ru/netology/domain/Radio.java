package ru.netology.domain;

public class Radio {
    private int currentRadioStation;

    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
    }

    public void setToMinRadioStation() {
        currentRadioStation = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            setCurrentRadioStation(currentRadioStation + 1);
        } else {
            setToMinRadioStation();
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            setCurrentRadioStation(currentRadioStation - 1);
        } else {
            setToMaxRadioStation();
        }
    }

    public void augmentVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);
        } else {
            setToMaxVolume();
        }
    }

    public void decrementVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        } else {
            setToMinVolume();
        }
    }
}