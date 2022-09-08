package Program_od_H_K;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> carsToRepair = new ArrayList<>();
    private List<Car> boughtCars = new ArrayList<>();
    private List<Car> repairedCars = new ArrayList<>();
    private int moneyStatus = 100000;
    public CarService () {

    }
    private int checkWheels(Car car) {
        if (car.getWheels()){
            return 0;
        }
        else {
            return 2000;
        }
    }
    private int checkDoors(Car car) {
        if (car.getDoors()) {
            return 0;
        }
        else{
            return 5500;
        }
    }
    private int checkBumpers(Car car) {
        if (car.isBumpers()) {
            return 0;
        }
        else {
            return 3000;
        }
    }
    private int checkCarTurbines(Car car) {
        if (car.isCarTurbine()) {
            return 0;
        } else {
            return 18000;
        }
    }
    private int checkTypeOfCarEngine(Car car) {
        if (car.getTypeOfCarEngine().equals("Hybrid car")) {
            if (car.getEngines()==2){
                return 0;
            } else if (car.getEngines()==1) {
                return 75000;

            }
            else {
                return 100000;
            }
        } else if (car.getTypeOfCarEngine().equals("Electric car")) {
            if (car.getEngines()==1) {
                return 0;
            }
            else {
                return 75000;
            }
            
        } else if (car.getTypeOfCarEngine().equals("Fuel engine")) {
            if (car.getEngines()==1) {
                return 0;
            }
            else {
                return 15000;
            }
        }return 0;
    }
    private int checkSump (Car car) {
        if (car.isSump()) {
            return 0;
        }
        else {
            return 330;
        }
    }
    private int checkSeats (Car car) {
        return (7 - car.getSeats()) * 1500;
    }
    private  int checkSeatbelts (Car car) {
        if (car.isSeatbelts()) {
            return 0;
        }
        else {
            return 700;
        }
    }
    private int checkExhaust (Car car) {
        if (car.isExhaust()) {
            return 0;
        }
        else  {
            return 20000;
        }
    }
    private int checkTurnSignals (Car car) {
        if (car.isTurnSignals()) {
            return 0;
        }
        else {
            return 1900;
        }
    }
}
