package com.booleanuk.core;

public class RemoteControlledCar {

    public String color;
    public String typeRemote;
    public Battery battery;
    public int distanceTravelled;

    public RemoteControlledCar(String color, String typeRemote, String batteryType) {
        this.color = color;
        this.typeRemote = typeRemote;
        this.battery = new Battery(batteryType);
        this.distanceTravelled = 0;
    }

    public String forward(int distance) {
        if (distance >= 0) {
            this.distanceTravelled += distance;
            this.battery.decreasePower(distance/10);
            return "Distance travelled: " + distance;
        }
        return "Not allowed";
    }

    public String backward(int distance) {
        if (distance <= 0) {
            this.distanceTravelled += distance;
            this.battery.decreasePower(Math.abs(distance)/10);
            return "Distance travelled: " + distance;
        }
        return "Not allowed";
    }

    public String stop() {
        return "Car has stopped";
    }

    public String turnRight() {
        return "Car has turned right";
    }

    public String turnLeft() {
        return "Car has turned left";
    }

    public RemoteControlledCar replaceBattery() {
        return this;
    }



}
