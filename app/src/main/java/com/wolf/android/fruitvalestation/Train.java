package com.wolf.android.fruitvalestation;

public class Train {

    String trainMinutes;
    String trainColor;
    String trainPlatform;

    public Train(String trainMinutes, String trainColor, String trainPlatform) {
        this.trainMinutes = trainMinutes;
        this.trainColor = trainColor;
        this.trainPlatform = trainPlatform;
    }

    public String getTrainMinutes() {
        return trainMinutes;
    }

    public String getTrainColor() {
        return trainColor;
    }

    public String getTrainPlatform() {
        return trainPlatform;
    }

}
