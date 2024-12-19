package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Radio {

    private boolean isOn = false;
    private int volume = 50;
    private double frequency = 100.0;
    private List<Double> favoriteRadioStation;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public List<Double> getFavoriteRadioStation() {
        return favoriteRadioStation;
    }

    public void setFavoriteRadioStation(List<Double> favoriteRadioStation) {
        this.favoriteRadioStation = favoriteRadioStation;
    }

    public Radio() {
        this.favoriteRadioStation = new ArrayList<>();

    }

    public String PutOn() {
        if (isOn){
            return "Radio is already on";
        }
        setOn(true);
            return "Radio is on";
    }
    public String PutOff() {
        if (!isOn){
            return "Radio is already off";
        }
        setOn(false);
        return "Radio is off";
    }
    public String SetVolume(int volume) {
        if (isOn) {
            if (volume <= 100) {
                if (volume >= 0) {
                    setVolume(volume);
                    return "Volume set to " + volume;
                }
                return "Minimum volume is 0";
            }
            return "Maximum Volume is 100";
        }
        return "Radio is off";
    }
    public String PutFrequency(double frequency) {
        if (isOn) {
            if (frequency >= 87.5 && frequency <= 108.0) {
                setFrequency(frequency);
                return "Frequency set to " + frequency;
            }
            return "Invalid frequency";
        }
        return "Radio is off";
    }
    public String SaveFavoriteRadioStation(int slot, double frequency) {
        if (isOn) {
            if (frequency >= 87.5 && frequency <= 108.0) {
                if (slot >= 0 && slot < favoriteRadioStation.size()) {
                    favoriteRadioStation.set(slot, frequency);
                } else if (slot == favoriteRadioStation.size()) {
                    favoriteRadioStation.add(frequency);
                } else {
                    return "Invalid Slot!";
                }
                return "Frequency " + frequency + " has been saved in slot " + slot;
            }
            return "Invalid frequency";
        }
        return "Radio is off";
        }

    }
