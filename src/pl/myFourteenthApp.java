package pl;

// myFourteenthApp.java

abstract class Vehicle {
    String registrationNumber;
    String vinNumber;
    String color;
    double price;
    double fuelConsumption;
    double fuelLevel;
    double mileage;

    Vehicle(String registrationNumber, String vinNumber, String color,
            double price, double fuelConsumption, double fuelLevel, double mileage) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    void drive(double distance) {
        double fuelNeeded = (fuelConsumption / 100.0) * distance;
        if (fuelLevel >= fuelNeeded) {
            fuelLevel -= fuelNeeded;
            mileage += distance;
            System.out.println("Drove " + distance + " km.");
        } else {
            System.out.println("Not enough fuel to drive.");
        }
    }

    void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Refueled " + amount + " liters.");
    }
}

interface FuelType {
    String getFuelType();
}

class Diesel implements FuelType {
    public String getFuelType() {
        return "Diesel";
    }
}

class Gasoline implements FuelType {
    public String getFuelType() {
        return "Gasoline";
    }
}

class Electric implements FuelType {
    public String getFuelType() {
        return "Electric";
    }
}

class PassengerCar extends Vehicle {
    int numberOfDoors;

    PassengerCar(String registrationNumber, String vinNumber, String color,
                 double price, double fuelConsumption, double fuelLevel, double mileage,
                 int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    Truck(String registrationNumber, String vinNumber, String color,
          double price, double fuelConsumption, double fuelLevel, double mileage,
          double loadCapacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String registrationNumber, String vinNumber, String color,
               double price, double fuelConsumption, double fuelLevel, double mileage,
               boolean hasSidecar) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
    }
}

class ConstructionEquipment extends Vehicle {
    double hoursWorked;

    ConstructionEquipment(String registrationNumber, String vinNumber, String color,
                          double price, double fuelConsumption, double fuelLevel, double mileage,
                          double hoursWorked) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
    }
}

public class myFourteenthApp {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("WD123", "VIN123", "Red", 30000, 7, 50, 12000, 4);
        Truck truck = new Truck("TR456", "VIN456", "Blue", 50000, 15, 100, 80000, 10);
        Motorcycle moto = new Motorcycle("MC789", "VIN789", "Black", 15000, 4, 20, 5000, true);
        ConstructionEquipment excavator = new ConstructionEquipment("CE111", "VIN111", "Yellow", 100000, 20, 200, 10000, 200);

        FuelType diesel = new Diesel();
        FuelType gasoline = new Gasoline();
        FuelType electric = new Electric();

        car.drive(100);
        truck.refuel(50);
        moto.drive(30);
        excavator.drive(10);

        System.out.println("Car fuel type: " + gasoline.getFuelType());
        System.out.println("Truck fuel type: " + diesel.getFuelType());
        System.out.println("Motorcycle fuel type: " + gasoline.getFuelType());
        System.out.println("Excavator fuel type: " + diesel.getFuelType());
    }
}
