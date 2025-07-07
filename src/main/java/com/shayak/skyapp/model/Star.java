package com.shayak.skyapp.model;

public class Star {
    public String name;
    public double ra, dec, magnitude;

    public Star(String name, double ra, double dec, double magnitude) {
        this.name = name;
        this.ra = ra;
        this.dec = dec;
        this.magnitude = magnitude;
    }
}
