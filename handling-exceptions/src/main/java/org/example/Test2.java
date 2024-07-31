package org.example;

public class Test2 {

        public static void main(String[] args) {
            Sensor kumpula = new TemperatureSensor();
            kumpula.setOn();
            System.out.println("Temperature in Kumpula: " + kumpula.read() + " degrees Celsius");

            Sensor kaisaniemi = new TemperatureSensor();
            Sensor helsinkiVantaaAirport = new TemperatureSensor();

            AverageSensor helsinkiRegion = new AverageSensor();
            helsinkiRegion.addSensor(kumpula);
            helsinkiRegion.addSensor(kaisaniemi);
            helsinkiRegion.addSensor(helsinkiVantaaAirport);

            helsinkiRegion.setOn();
            System.out.println("Temperature in Helsinki region: " + helsinkiRegion.read() + " degrees Celsius");
            System.out.println("Temperature in Helsinki region: " + helsinkiRegion.read() + " degrees Celsius");
            System.out.println("Temperature in Helsinki region: " + helsinkiRegion.read() + " degrees Celsius");

            System.out.println("Readings: " + helsinkiRegion.readings());
        }
    }