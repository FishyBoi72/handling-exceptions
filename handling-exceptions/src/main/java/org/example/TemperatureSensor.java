package org.example;

import java.util.Random;

// Defines the TemperatureSensor class, which implements the Sensor interface
public class TemperatureSensor implements Sensor {
    
    private boolean isOn;  // Declares a private boolean field to track whether the sensor is on or off
    private Random random;  // Declares a private Random object to generate random numbers

    // Constructor for TemperatureSensor, initializes the sensor as off and creates a new Random object
    public TemperatureSensor() {
        this.isOn = false;  // Initializes the isOn field to false, meaning the sensor is initially off
        this.random = new Random();  // Initializes the random field with a new Random object
    }

    // Overrides the isOn method from the Sensor interface, returns the current state of the sensor
    @Override
    public boolean isOn() {
        return this.isOn;  // Returns the value of the isOn field, indicating if the sensor is on or off
    }

    // Overrides the setOn method from the Sensor interface, turns the sensor on
    @Override
    public void setOn() {
        this.isOn = true;  // Sets the isOn field to true, turning the sensor on
    }

    // Overrides the setOff method from the Sensor interface, turns the sensor off
    @Override
    public void setOff() {
        this.isOn = false;  // Sets the isOn field to false, turning the sensor off
    }

    // Overrides the read method from the Sensor interface, returns a random temperature reading if the sensor is on
    @Override
    public int read() {
        if (!this.isOn) {  // Checks if the sensor is off
            throw new IllegalStateException("Temperature sensor is off.");  // Throws an exception if the sensor is off
        }
        return this.random.nextInt(61) - 30;  // Generates a random integer between -30 and 30 and returns it
    }
}
