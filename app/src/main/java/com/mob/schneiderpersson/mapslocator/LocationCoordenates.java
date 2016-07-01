package com.mob.schneiderpersson.mapslocator;

public class LocationCoordenates {
    public String lat, lon;

    public LocationCoordenates(){}

    public LocationCoordenates(String lat, String lon)
    {
        lat = lat;
        lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}
