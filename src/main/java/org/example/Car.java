package org.example;

public class Car {
    // the mileage of the car in miles per gallon:
    private int mileage;
    // the amount of gas currently in the car, in gallons
    private double gas;


    /**
     * Given a number of miles we want to drive, return the number of miles actually driven
     * Update the gas in the car accordingly
     * Gas should not go below 0
     * Once the gas reaches 0, the car should not keep moving
     * @param miles
     * return - the amount of miles actually driven
     */
    public int drive(int miles) {
        if(mileage*gas >= miles){
            this.gas = gas - ((double)miles/(double)mileage);
            return miles;
        }
        else {
            int traveled =(int) (this.mileage*this.gas);
            this.gas = 0;
            return  traveled;
        }
    }

    /**
     * Fill the car with gas
     * The gas field should be updated properly afterwards
     * @param gallons the amount of gallons to fill
     */
    public void fill(int gallons) {
        this.gas += gallons;
    }


    public Car(int mileage, int gas) {
        this.mileage = mileage;
        this.gas = (double) gas;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    @Override
    public String toString() {
        return "Exercise3{" +
                "mileage=" + mileage +
                ", gas=" + gas +
                '}';
    }
}
