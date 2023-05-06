package radiostation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest
{
    @Test
    public void radioStationMin(){
        Radio cond = new Radio();

        cond.setNextNumberStation(1);

        int expected = 1;
        int actual = cond.getNumberStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void radioStationNegative(){
        Radio cond = new Radio();

        cond.setPrevNumberStation(-1);

        int expected = 0;
        int actual = cond.getNumberStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void radioStationborder(){
        Radio cond = new Radio();

        cond.setPrevNumberStation(8);

        int expected = 8;
        int actual = cond.getNumberStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void numberStationMax(){
        Radio cond = new Radio();

        cond.setNextNumberStation(9);

        int expected = 9;
        int actual = cond.getNumberStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void numberStationExcess(){
        Radio cond = new Radio();

        cond.setNextNumberStation(10);

        int expected = 0;
        int actual = cond.getNumberStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void radioStationZero(){
        Radio cond = new Radio();

        cond.setNextNumberStation(0);

        int expected = 0;
        int actual = cond.getNumberStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void radioIncreaseVolume(){
        Radio cond = new Radio();

        cond.setIncreaseRadioVolumen(101);

        int expected = 0;
        int actual = cond.getRadioVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void RadioReduceVolume(){
        Radio cond = new Radio();

        cond.setReduceRadioVolume(-1);

        int expected = 0;
        int actual = cond.getRadioVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void radioHundredVolume(){
        Radio cond = new Radio();

        cond.setIncreaseRadioVolumen(100);

        int expected = 100;
        int actual = cond.getRadioVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void radioFiftydVolume(){
        Radio cond = new Radio();

        cond.setIncreaseRadioVolumen(50);

        int expected = 50;
        int actual = cond.getRadioVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void radioZeroVolume(){
        Radio cond = new Radio();

        cond.setIncreaseRadioVolumen(0);

        int expected = 0;
        int actual = cond.getRadioVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void radioOneVolume(){
        Radio cond = new Radio();

        cond.setIncreaseRadioVolumen(1);

        int expected = 1;
        int actual = cond.getRadioVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void radioBorderVolume(){
        Radio cond = new Radio();

        cond.setIncreaseRadioVolumen(99);

        int expected = 99;
        int actual = cond.getRadioVolume();

        Assertions.assertEquals(expected,actual);
    }


}
