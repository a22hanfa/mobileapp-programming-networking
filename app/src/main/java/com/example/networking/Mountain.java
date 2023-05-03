package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    @SerializedName("name")
    private String Name;

    @SerializedName("location")
    private String Location;

    @SerializedName("size")
    private int Height;


    public Mountain(String Name, String Location, int Height) {

        this.Location = Location;
        this.Name = Name;
        this.Height = Height;
    }

    public Mountain() {
        this.Name = "MISSING";
        this.Location = "MISSING";
        this.Height = -1;
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
        return "Mountain Details:\n" +
                "Name: " + Name + '\n' +
                "Location: " + Location + '\n' +
                "Height: " + Height + " meters\n";
    }

}
