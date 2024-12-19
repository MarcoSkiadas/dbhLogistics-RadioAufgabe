package org.example;

import org.example.Model.Radio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();

        System.out.println(radio.PutOff());
        System.out.println(radio.PutOn());
        System.out.println(radio.PutOn());
        System.out.println(radio.SetVolume(22));
        System.out.println(radio.SetVolume(0));
        System.out.println(radio.SetVolume(100));
        System.out.println(radio.SetVolume(122));
        System.out.println(radio.SetVolume(-22));
        System.out.println(radio.PutFrequency(22.5));
        System.out.println(radio.PutFrequency(99));
        System.out.println(radio.SaveFavoriteRadioStation(0,99));
        System.out.println(radio.SaveFavoriteRadioStation(1,101));
        System.out.println(radio.getFavoriteRadioStation());
        System.out.println(radio.PutOff());
        System.out.println(radio.SetVolume(22));
        System.out.println(radio.PutFrequency(22.5));
        System.out.println(radio.SaveFavoriteRadioStation(2,99));


    }
}