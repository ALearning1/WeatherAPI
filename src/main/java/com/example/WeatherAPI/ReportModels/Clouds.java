
package com.example.WeatherAPI.ReportModels;

public class Clouds {

    private Integer all;

    public Clouds() {
    }


    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }
}
