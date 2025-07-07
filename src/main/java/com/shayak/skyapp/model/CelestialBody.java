package com.shayak.skyapp.model;

public class CelestialBody {
    public String name;
    public double ra, dec;

    public CelestialBody(String name, double ra, double dec) {
        this.name = name;
        this.ra = ra;
        this.dec = dec;
    }
}
