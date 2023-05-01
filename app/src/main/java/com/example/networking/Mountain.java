package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    private String Location;
    private String Name;
    @SerializedName("size")
    private int Height;
    private AuxData auxdata;

    public Mountain() {

        this.Location = Location;
        this.Name = Name;
        this.Height = Height;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "Location='" + Location + '\'' +
                ", Name='" + Name + '\'' +
                ", Height=" + Height +
                ", auxdata=" + auxdata +
                '}';
    }
}
