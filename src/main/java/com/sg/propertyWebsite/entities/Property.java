package com.sg.propertyWebsite.entities;

import java.util.Objects;

public class Property {
    private int propertyID;
    private String propertyLocation;
    private String propertyName;
    private int capacity;
    private double rating;
    private double perNightCost;
    private int ammenitiesID;
    private String propertyType;

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getPropertyLocation() {
        return propertyLocation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPropertyLocation(String propertyLocation) {
        this.propertyLocation = propertyLocation;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        int scale = (int) Math.pow(10, 1);
        this.rating = (double) Math.round(rating * scale) / scale;
    }

    public double getPerNightCost() {
        return perNightCost;
    }

    public void setPerNightCost(double perNightCost) {
        this.perNightCost = perNightCost;
    }

    public int getAmmenitiesID() {
        return ammenitiesID;
    }

    public void setAmmenitiesID(int ammenitiesID) {
        this.ammenitiesID = ammenitiesID;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return propertyID == property.propertyID
                && Double.compare(property.capacity, capacity) == 0
                && Double.compare(property.rating, rating) == 0
                && Double.compare(property.perNightCost, perNightCost) == 0
                && ammenitiesID == property.ammenitiesID
                && Objects.equals(propertyLocation, property.propertyLocation)
                && Objects.equals(propertyName, property.propertyName)
                && Objects.equals(propertyType, property.propertyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyID, propertyLocation, propertyName, capacity, rating, perNightCost,
                ammenitiesID, propertyType);
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyID=" + propertyID +
                ", propertyLocation='" + propertyLocation + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", capacity=" + capacity +
                ", rating=" + rating +
                ", perNightCost=" + perNightCost +
                ", ammenitiesID=" + ammenitiesID +
                ", propertyType='" + propertyType + '\'' +
                '}';
    }
}
