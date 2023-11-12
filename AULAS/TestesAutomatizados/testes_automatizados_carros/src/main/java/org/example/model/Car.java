package org.example.model;

import java.util.Objects;

public class Car {
    private String color;
    private String brand;
    private String model;
    private Boolean active;
    private Integer actualVelocity;
    private Integer maxVelocity;
    private Boolean locked;

    public Car() {
        this.active = false;
        this.actualVelocity = 0;
        this.maxVelocity = 200;
        this.locked=true;
    }
    public Car(Integer maxVelocity) {
        this.active = false;
        this.actualVelocity = 0;
        this.maxVelocity = maxVelocity;
        this.locked=true;
    }

    public Car(String color, String brand, String model) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.active = false;
        this.actualVelocity = 0;
        this.maxVelocity = 200;
        this.locked=true;

    }
    public Car(String color, String brand, String model, Integer maxVelocity) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.active = false;
        this.actualVelocity = 0;
        this.maxVelocity = maxVelocity;
        this.locked=true;

    }


    public void powerOn() {
        this.active = true;
    }

    public void powerOff() throws Exception {
        if (this.active){
            if (this.actualVelocity==0){
                this.active = false;
            }else{
                throw new Exception("Cannot turn off a car with velocity");
            }
        }
    }

    public void lock(){
        if (this.locked){
            System.out.println("Has is already locked!");
        }else{
            this.locked=true;
        }
    }
    public void unLock(){
        if (!locked){
            System.out.println("Has is already unlocked");
        }else {
            this.locked=false;
        }
    }


    public void speedUp(Integer addVelocity) throws Exception {
        if (this.active) {
            if (addVelocity<0){
                throw new Exception("The additional velocity cannot be less than zero");
            }
            if (this.actualVelocity + addVelocity <= this.maxVelocity)
                this.actualVelocity += addVelocity;
        }
    }

    public void breakCar(Integer reduceVelocity) {
        if (this.active) {
            if (reduceVelocity <= actualVelocity) {
                this.actualVelocity -= reduceVelocity;
            }else{
                this.actualVelocity = 0;
            }
        }
    }


    public String getColor() {
        return color;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public Boolean getActive() {
        return active;
    }


    public Integer getActualVelocity() {
        return actualVelocity;
    }


    public Integer getMaxVelocity() {
        return maxVelocity;
    }


    public Boolean getLocked() {
        return locked;
    }


    @Override
    public String toString() {
        return "active = " + active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

}
