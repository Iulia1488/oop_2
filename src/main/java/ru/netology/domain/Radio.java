package ru.netology.domain;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int currentStation = minStation;


    public Radio(int size) {
        maxStation = minStation + size - 1;

    }
    public Radio() {
        this.currentStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            newCurrentStation = minStation;
        }
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void volumeUp() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }
    public void volumeDown() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }

    public void nextStation() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }
    public void prevStation() {
        int target = currentStation - 1;
        setCurrentStation(target);
    }

}




