package radiostation;

public class Radio {
    private int radioVolume;
    private int numberStation;


    public int getNumberStation() {
        return numberStation;
    }

    public void setNextNumberStation(int newNextStation) {

        if (newNextStation <= 9) {
            numberStation = newNextStation;
        }
        if (newNextStation > 9) {
            return;
        }
        numberStation = newNextStation;
    }

    public void setPrevNumberStation(int newPrevStation) {
        if (newPrevStation >= 0) {
            numberStation = newPrevStation;
        }
        if (newPrevStation < 0) {
            return;
        }
        numberStation = newPrevStation;
    }


    public int getRadioVolume() {
        return radioVolume;
    }

    public void setIncreaseRadioVolumen(int radioIncreaseVolume) {
        if (radioIncreaseVolume < 100) {
            radioVolume = radioIncreaseVolume + 1;
        }
        if (radioIncreaseVolume == 100) {
            radioVolume = 100;
        }
        if (radioIncreaseVolume > 100) {
            return;
        }
            radioVolume = radioIncreaseVolume;
        }

        public void setReduceRadioVolume ( int radioReduceVolume){
            if (radioReduceVolume > 0) {
                radioVolume = radioReduceVolume;
            }
            if (radioReduceVolume < 0) {
                return;
        }
        radioVolume = radioReduceVolume;
    }

}
