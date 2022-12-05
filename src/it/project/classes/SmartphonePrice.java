package it.project.classes;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{
    private String priceType;
    private double priceInEuros;

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        return clonedSmartphonePrice;
    }

    @Override
    public String toString() {
        return  priceType + " price: " + priceInEuros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    public SmartphonePrice(){}

    public SmartphonePrice(String priceType, int priceInEuros){
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }
}
