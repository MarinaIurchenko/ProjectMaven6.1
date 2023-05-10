package radiostation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void radioStationMin() {
        Radio radio = new Radio(0);

        Assertions.assertEquals(0, radio.getMinNumberStation());
        Assertions.assertEquals(0, radio.getCurrentNumberStation());

    }

    @Test
    public void radioStationExcess() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    public void radioStationMax() {
        Radio radio = new Radio(9);

        Assertions.assertEquals(9, radio.getExcessNumberStation());

    }

    @Test
    public void radioStationMinus() {
        Radio radio = new Radio(-1);

        Assertions.assertEquals(0, radio.getAutoRadioVolume());
    }

    @Test
    public void radioStationPlus() {
        Radio radio = new Radio(11);

        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void radioVolumeMin() {
        Radio radio = new Radio(0);

        Assertions.assertEquals(0, radio.getMinRadioVolume());
    }

    @Test
    public void radioVolumeMax() {
        Radio radio = new Radio(100);

        Assertions.assertEquals(100, radio.getMaxRadioVolume());
    }

    @Test
    public void radioVolumMinus() {
        Radio radio = new Radio(-3);

        Assertions.assertEquals(0, radio.getAutoRadioVolume());
    }

    @Test
    public void radioVolumPlus() {
        Radio radio = new Radio(102);

        Assertions.assertEquals(0, radio.getAutoRadioVolume());
    }

    @Test
    public void radioVolum() {
        Radio radio = new Radio();

    }


}
