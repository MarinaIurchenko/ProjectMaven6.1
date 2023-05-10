package radiostation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void radioStationMin() {
        Radio radio = new Radio();

        radio.setNextNumberStation(1);

        int expected = 1;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNegative() {
        Radio radio = new Radio();

        radio.setPrevNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationborder() {
        Radio radio = new Radio();

        radio.setPrevNumberStation(8);

        int expected = 8;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationMax() {
        Radio radio = new Radio();

        radio.setNextNumberStation(9);

        int expected = 9;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationExcess() {
        Radio radio = new Radio();

        radio.setNextNumberStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationZero() {
        Radio radio = new Radio();

        radio.setNextNumberStation(0);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseRadioVolumen(101);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioReduceVolume() {
        Radio radio = new Radio();

        radio.setReduceRadioVolume(-1);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioHundredVolume() {
        Radio radio = new Radio();

        radio.setIncreaseRadioVolumen(100);

        int expected = 100;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioFiftydVolume() {
        Radio radio = new Radio();

        radio.setIncreaseRadioVolumen(50);

        int expected = 50;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioZeroVolume() {
        Radio radio = new Radio();

        radio.setReduceRadioVolume(0);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioOneVolume() {
        Radio radio = new Radio();

        radio.setReduceRadioVolume(1);

        int expected = 1;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioBorderVolume() {
        Radio radio = new Radio();

        radio.setIncreaseRadioVolumen(99);

        int expected = 99;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }


}
