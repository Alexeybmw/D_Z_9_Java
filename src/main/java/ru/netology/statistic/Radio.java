package ru.netology.statistic;


public class Radio {
    public int maxRadioStation = 9;
    public int minRadioStation = 0;
    public int currentRadioStation;
    public int maxVolume = 100;
    public int minVolume = 0;
    public int currentVolume;


    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void pressNextStation() {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void pressPlusVolume() {

        setCurrentVolume(currentVolume + 1);
    }

    public void pressMinusVolume() {

        setCurrentVolume(currentVolume - 1);
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}