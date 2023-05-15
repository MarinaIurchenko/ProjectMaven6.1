package radiostation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void radioStationMin() {
        Radio radio = new Radio();

        radio.setNumberStation(1);

        radio.NextNumberStation();

        int expected = 2;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNegative() {
        Radio radio = new Radio();

        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationborder() {
        Radio radio = new Radio();

        radio.setNumberStation(8);

        radio.PrevNumberStation();

        int expected = 7;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationMax() {
        Radio radio = new Radio();

        radio.setNumberStation(9);

        radio.NextNumberStation();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationExcess() {
        Radio radio = new Radio();

        radio.setNumberStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationZero() {
        Radio radio = new Radio();

        radio.setNumberStation(0);

        radio.PrevNumberStation();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioIncreaseVolume() {
        Radio radio = new Radio();

        radio.setRadioVolumen(101);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioReduceVolume() {
        Radio radio = new Radio();

        radio.setRadioVolumen(-1);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioHundredVolume() {
        Radio radio = new Radio();

        radio.setRadioVolumen(100);

        int expected = 100;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioFiftydVolume() {
        Radio radio = new Radio();

        radio.setRadioVolumen(50);

        int expected = 50;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioZeroVolume() {
        Radio radio = new Radio();

        radio.setRadioVolumen(0);

        int expected = 0;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioOneVolume() {
        Radio radio = new Radio();

        radio.setRadioVolumen(1);

        int expected = 1;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioBorderVolume() {
        Radio radio = new Radio();

        radio.setRadioVolumen(99);

        int expected = 99;
        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }


}
