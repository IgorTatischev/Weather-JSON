package com.example.json_tatischev;

public class ListForecast {
    public int id;
    public String date;
    public  String city;
    public  float temprature;
    public  float wind;
    public  float pressure;
    public  float precip;
    public  int hum;
    public  int cloud;

    public String toString()
    {
        return id + "  " + date + "  " + city
                + "\nTemperature: " + temprature + " °C" + "    Wind: " + wind + " km/h"
                + "\nPressure: " + pressure + " millibars" + "    Precipitation: " + precip + " mm"
                + "\nHumidity: " + hum + " %" + "    Cloud: " + cloud + " %";
    }
}
