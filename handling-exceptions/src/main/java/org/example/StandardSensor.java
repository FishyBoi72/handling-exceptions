package org.example;

// The class StandardSensor implements the Sensor interface, meaning it must implement all methods defined in Sensor.
public class StandardSensor implements Sensor {
    
    // A private field to store the value of the sensor.
    private int value;

    // Constructor for the StandardSensor class that initializes the sensor with a specific value.
    public StandardSensor(int value) {
        this.value = value;
    }

    // Method that checks if the sensor is on.
    // For a standard sensor, this will always return true because it is always considered "on."
    @Override
    public boolean isOn() {
        return true; // A standard sensor is always on
    }

    // Method to turn the sensor on. 
    // Does nothing because the sensor is always on by definition.
    @Override
    public void setOn() {
        // Does nothing, as the sensor is always on
    }

    // Method to turn the sensor off. 
    // Also does nothing because the sensor is always on.
    @Override
    public void setOff() {
        // Does nothing, as the sensor is always on
    }

    // Method to read the sensor's value.
    // This returns the value that was set when the sensor was created.
    @Override
    public int read() {
        return this.value;
    }

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Creates a StandardSensor object with a value of 10.
        StandardSensor ten = new StandardSensor(10);
        
        // Creates another StandardSensor object with a value of -5.
        StandardSensor minusFive = new StandardSensor(-5);

        // Prints the value of the first sensor (which should be 10).
        System.out.println(ten.read());
        
        // Prints the value of the second sensor (which should be -5).
        System.out.println(minusFive.read());

        // Prints whether the first sensor is on (which should always be true).
        System.out.println(ten.isOn());
        
        // Attempts to turn the first sensor off, but nothing happens since the sensor is always on.
        ten.setOff();
        
        // Prints whether the first sensor is on again (which should still be true).
        System.out.println(ten.isOn());
    }
}
