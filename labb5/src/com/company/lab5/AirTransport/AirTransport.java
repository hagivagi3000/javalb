package com.company.lab5.AirTransport;


import com.company.lab5.Transport;

public abstract class AirTransport extends Transport {
    private int maxFlightAltitude;
    private int maxFlightDistance;

    
    public String getDescription() {
        return "This is Air Transport class";
    }

    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    public void setMaxFlightAltitude(int maxFlightAltitude) {
        this.maxFlightAltitude = maxFlightAltitude;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public void setMaxFlightDistance(int maxFlightDistance) {
        this.maxFlightDistance = maxFlightDistance;
    }

    public AirTransport(int weight, int peopleCapacity, int speed, int maxFlightAltitude, int maxFlightDistance, String color) {
        super(weight, peopleCapacity, speed, color);
        this.maxFlightAltitude = maxFlightAltitude;
        this.maxFlightDistance = maxFlightDistance;
    }
}