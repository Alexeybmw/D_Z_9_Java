package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void changeOverLastRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.pressNextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeUnderInitialRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.pressPrevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);
        radio.pressNextStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);
        radio.pressPrevStation();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverInitialRadioStation() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        radio.setCurrentRadioStation(10);
        radio.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UnderInitialRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);
        radio.getMinRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.getMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownUnderMin() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        radio.setCurrentVolume(-1);
        radio.getMinVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void plusVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.pressPlusVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.pressMinusVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxRadioStationTest() {
        Radio radio = new Radio(10);

        int expected = 9;
        int actual = radio.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}







