package org.example;

import java.util.ArrayList;
import java.util.List;

// Public class that implements the Sensor interface
public class AverageSensor implements Sensor {

    // List to hold the individual sensors that make up the AverageSensor
    private List<Sensor> sensors;
    
    // List to store the readings taken by the AverageSensor
    private List<Integer> readings;

    // Constructor to initialize the lists for sensors and readings
    public AverageSensor() {
        this.sensors = new ArrayList<>(); // Initialize the list of sensors
        this.readings = new ArrayList<>(); // Initialize the list of readings
    }

    // Method to add a sensor to the AverageSensor
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd); // Adds the given sensor to the list of sensors
    }

    // Override method from the Sensor interface to check if all sensors are on
    @Override
    public boolean isOn() {
        // Iterate through each sensor in the list
        for (Sensor sensor : this.sensors) {
            // If any sensor is off, return false
            if (!sensor.isOn()) {
                return false;
            }
        }
        // If all sensors are on, return true
        return true;
    }

    // Override method from the Sensor interface to turn all sensors on
    @Override
    public void setOn() {
        // Iterate through each sensor in the list
        for (Sensor sensor : this.sensors) {
            // Turn the sensor on
            sensor.setOn();
        }
    }

    // Override method from the Sensor interface to turn all sensors off
    @Override
    public void setOff() {
        // Iterate through each sensor in the list
        for (Sensor sensor : this.sensors) {
            // Turn the sensor off
            sensor.setOff();
        }
    }

    // Override method from the Sensor interface to read the average value
    @Override
    public int read() {
        // If the AverageSensor is off or no sensors are added, throw an exception
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("Average sensor is off or no sensors added.");
        }
        int sum = 0; // Initialize sum to calculate the average
        // Iterate through each sensor in the list
        for (Sensor sensor : this.sensors) {
            // Add the reading of each sensor to the sum
            sum += sensor.read();
        }
        // Calculate the average by dividing the sum by the number of sensors
        int average = sum / this.sensors.size();
        // Add the calculated average to the list of readings
        this.readings.add(average);
        // Return the average reading
        return average;
    }

    // Method to return the list of readings taken by the AverageSensor
    public List<Integer> readings() {
        // Return a new list that is a copy of the readings list
        return new ArrayList<>(this.readings);
    }
}
