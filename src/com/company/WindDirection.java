package com.company;

public class WindDirection {
    protected Double latitude;
    protected Double longitude;
    private String weather;
    private Double temp;
    private String windDirection;
    private String precipitation;

    public WindDirection(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getPrecipitation() { return precipitation;}

    public void setPrecipitation(String precipitation) { this.precipitation = precipitation; }
}

