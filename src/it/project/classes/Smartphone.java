package it.project.classes;

import java.util.Objects;

public class Smartphone implements Cloneable{
    private String brandName;
    private String modelName;
    private int batteryMAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName:'" + brandName + '\'' +
                ", modelName:'" + modelName + '\'' +
                ", batteryMAh:" + batteryMAh  +
                ", " + producerPrice +
                ", " + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batteryMAh == that.batteryMAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryMAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone;
        clonedSmartphone = (Smartphone)super.clone();

        clonedSmartphone.producerPrice = new SmartphonePrice();
        clonedSmartphone.producerPrice = this.producerPrice.clone();

        clonedSmartphone.retailPrice = new SmartphonePrice();
        clonedSmartphone.retailPrice = this.retailPrice.clone();

        return clonedSmartphone;
    }

    public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP) {
        this.brandName = brand;
        this.modelName = model;
        this.batteryMAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }


}
