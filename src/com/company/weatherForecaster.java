package com.company;

public class weatherForecaster {
    public static void main(String[] args) {
        WindDirection colombo = new WindDirection(6.9271, 79.8612);

        for (int i = 0; i < 100; i++) {
            System.out.println("P" +
                    "Precipitation = water that is falling out of the sky, this could be rain, drizzle, snow, sleet, hail or something rarer!");
            colombo.setTemp(getRandomNumber());
            if (colombo.getTemp()>30.0) {
                colombo.setWeather("Sunny");
                colombo.setWindDirection("Wind=North East");
                colombo.setPrecipitation("Precipitation=20%");
            } else if (colombo.getTemp()<27.0) {
                colombo.setWeather("Rainy");
                colombo.setWindDirection("Wind=South West");
                colombo.setPrecipitation("Precipitation=80%");
            }
            else {
                colombo.setWeather("Partly cloudy");
                colombo.setWindDirection("Wind=North West");
                colombo.setPrecipitation("Precipitation=50%");
            }
            System.out.println(colombo.getTemp());
            System.out.println(colombo.getWeather());
            System.out.println(colombo.getWindDirection());
            System.out.println(colombo.getPrecipitation());
            System.out.println("");
        }
    }

    public static double getRandomNumber() {
        double min =  25.0;
        double max = 38.0;
        return (Double) ((Math.random() * (max - min)) + min);
    }
}

