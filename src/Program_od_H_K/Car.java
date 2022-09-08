package Program_od_H_K;

public class Car {
    private boolean wheels;
    private int numberOfWheels;
    private boolean doors;
    private int numberOfDoors;
    private boolean bumpers;
    private boolean carTurbine;
    private int carTurbines;
    private boolean engine;
    private int engines;
    private String typeOfCarEngine;
    private boolean sump;
    private int seats;
    private boolean seatbelts;
    private boolean exhaust;
    private double kilometresDriven;
    private boolean turnSignals;
    private int numberOfTurnSignals;
    private boolean dashboard;
    private boolean dippedBeam;
    private boolean highBeam;
    private boolean dumpers;
    private boolean suspension;

    Car(boolean wheels, int numberOfWheels, boolean doors, int numberOfDoors, boolean bumpers, boolean carTurbine, int engines, String typeOfCarEngine,  int carTurbines, boolean engine, boolean sump, int seats, boolean seatbelts, boolean exhaust, double kilometresDriven, boolean turnSignals, int numberOfTurnSignals, boolean dashboard, boolean dippedBeam, boolean highBeam, boolean dumpers, boolean suspension) {
        this.wheels = wheels;
        this.numberOfWheels = numberOfWheels;
        this.doors = doors;
        this.numberOfDoors = numberOfDoors;
        this.bumpers = bumpers;
        this.carTurbine = carTurbine;
        this.carTurbines = carTurbines;
        this.engine = engine;
        this.engines = engines;
        this.typeOfCarEngine = typeOfCarEngine;
        this.sump = sump;
        this.seats = seats;
        this.seatbelts = seatbelts;
        this.exhaust = exhaust;
        this.kilometresDriven = kilometresDriven;
        this.turnSignals = turnSignals;
        this.dippedBeam = dippedBeam;
        this.highBeam = highBeam;
        this.dumpers = dumpers;
        this.suspension = suspension;
        this.numberOfTurnSignals = numberOfTurnSignals;
        this.dashboard = dashboard;
    }

    public boolean getWheels() {
        return wheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean getDoors() {
        return doors;
    }

    public boolean isWheels() {
        return wheels;
    }

    public void setWheels(boolean wheels) {
        this.wheels = wheels;
    }

    public boolean isDoors() {
        return doors;
    }

    public void setDoors(boolean doors) {
        this.doors = doors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isBumpers() {
        return bumpers;
    }

    public void setBumpers(boolean bumpers) {
        this.bumpers = bumpers;
    }

    public boolean isCarTurbine() {
        return carTurbine;
    }

    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public void setCarTurbine(boolean carTurbine) {
        this.carTurbine = carTurbine;
    }

    public int getCarTurbines() {
        return carTurbines;
    }

    public void setCarTurbines(int carTurbines) {
        this.carTurbines = carTurbines;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public String getTypeOfCarEngine() {
        return typeOfCarEngine;
    }
    public void setTypeOfCarEngine(String typeOfCarEngine) {
        this.typeOfCarEngine = typeOfCarEngine;
    }

    public boolean isSump() {
        return sump;
    }

    public void setSump(boolean sump) {
        this.sump = sump;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isSeatbelts() {
        return seatbelts;
    }

    public void setSeatbelts(boolean seatbelts) {
        this.seatbelts = seatbelts;
    }

    public boolean isExhaust() {
        return exhaust;
    }

    public void setExhaust(boolean exhaust) {
        this.exhaust = exhaust;
    }

    public double getKilometresDriven() {
        return kilometresDriven;
    }

    public void setKilometresDriven(double kilometresDriven) {
        this.kilometresDriven = kilometresDriven;
    }

    public boolean isTurnSignals() {
        return turnSignals;
    }

    public void setTurnSignals(boolean turnSignals) {
        this.turnSignals = turnSignals;
    }

    public boolean isDippedBeam() {
        return dippedBeam;
    }

    public void setDippedBeam(boolean dippedBeam) {
        this.dippedBeam = dippedBeam;
    }

    public boolean isHighBeam() {
        return highBeam;
    }

    public void setHighBeam(boolean highBeam) {
        this.highBeam = highBeam;
    }

    public boolean isDumpers() {
        return dumpers;
    }

    public void setDumpers(boolean dumpers) {
        this.dumpers = dumpers;
    }

    public boolean isSuspension() {
        return suspension;
    }

    public void setSuspension(boolean suspension) {
        this.suspension = suspension;
    }
}
