package com.parth.accidentalert;

public class model {

    String lan,lon,speed,accident;

    public model() {
    }

    public model(String lan,String lon,String speed,String accident){
        this.accident=accident;
        this.lan=lan;
        this.lon=lon;
        this.speed=speed;
    }


    public String getLan() {
        return lan;
    }

    public String getLon() {
        return lon;
    }

    public String getSpeed() {
        return speed;
    }

    public String getAccident() {
        return accident;
    }
}
