package radiostation;

public class Radio {
    private int minRadioVolume = 0;
    private int maxRadioVolume = 100;
    private int autoRadioVolume = minRadioVolume;


    private int minNumberStation = 0;
    private int excessNumberStation = 10;
    private int maxNumberStation = excessNumberStation - 1;
    private int currentNumberStation = minNumberStation;

    public int getMaxRadioVolume() {
        return maxRadioVolume;
    }

    public int getMinRadioVolume() {
        return minRadioVolume;
    }

    public int getAutoRadioVolume() {
        return autoRadioVolume;
    }

    public int getExcessNumberStation() {
        return excessNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public Radio(int excessNumberStation) {
        if (excessNumberStation < minNumberStation) {
            return;
        } else {
            this.excessNumberStation = excessNumberStation;
        }
        this.maxNumberStation = excessNumberStation;
    }

    public Radio() {

    }

}
