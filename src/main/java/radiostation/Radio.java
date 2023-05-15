package radiostation;

public class Radio {
    private int radioVolume;
    private int numberStation;


    public int getNumberStation() {

        return numberStation;
    }
    public void setNumberStation(int numberStation) {

        if (numberStation < 0) {
            return;
        }
        if (numberStation > 9) {
            return;
        }
       this.numberStation = numberStation;
    }
    public void NextNumberStation() {
        if (numberStation != 9) {
            numberStation++;
        }else {
            numberStation = 0;
        }
    }

    public void PrevNumberStation(){
        if (numberStation != 0){
            numberStation--;
        }else {
            numberStation = 0;
        }
    }
    public int getRadioVolume() {
        return radioVolume;
    }
    public void setRadioVolumen(int radioVolume) {

        if (radioVolume > 100) {
            return;
        }
        if (radioVolume < 0){
            return;
        }
        this.radioVolume = radioVolume;


    }

}
