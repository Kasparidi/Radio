package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int minStation;
    private int maxStation = 9;   //количество станций
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }
//2
    public Radio(int currentStation, int minStation, int maxStation) {
        if (currentStation < maxStation) {
        }
        if (currentStation > minStation) {
        }
        this.currentStation = currentStation;

        if (currentStation > maxStation) {
            this.currentStation = maxStation;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
        }
        this.minStation = minStation;
        this.maxStation = maxStation;
    }





}


