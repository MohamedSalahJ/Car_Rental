package org.project.carrental.entity;

import java.util.Objects;

public class Car {

    private long id;

    private String carModel;

    private String carReleaseYear;

    private String carColor;

    private String carCompany;

    public Car() {
    }

    public Car(long id, String carModel, String carReleaseYear, String carColor, String carCompany) {
        this.id = id;
        this.carModel = carModel;
        this.carReleaseYear = carReleaseYear;
        this.carColor = carColor;
        this.carCompany = carCompany;
    }

    public Car(String carModel, String carReleaseYear, String carColor, String carCompany) {
        this.carModel = carModel;
        this.carReleaseYear = carReleaseYear;
        this.carColor = carColor;
        this.carCompany = carCompany;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarReleaseYear() {
        return carReleaseYear;
    }

    public void setCarReleaseYear(String carReleaseYear) {
        this.carReleaseYear = carReleaseYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    //toString()
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carModel='" + carModel + '\'' +
                ", carReleaseYear='" + carReleaseYear + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carCompany='" + carCompany + '\'' +
                '}';
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(carModel, car.carModel) &&
                Objects.equals(carReleaseYear, car.carReleaseYear)
                && Objects.equals(carColor, car.carColor) && Objects.equals(carCompany, car.carCompany);
    }

    //HashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, carModel, carReleaseYear,
                carColor, carCompany);
    }
}
