package it.project.testerClass;
import it.project.classes.Smartphone;
import it.project.classes.SmartphonePrice;

public class Tester {

    public static void main(String...args){
        SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 351);
        SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 267);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 651);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 467);

        Smartphone smartphone1 = new Smartphone("Apple", "Iphone 14", 3600, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Samsung", "Galaxy s27", 4600, producerPrice2, retailPrice2);

        System.out.println("\n++++++++ Created Smartphone Details ++++++++");
        System.out.println(smartphone1);
        System.out.println(smartphone2);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++\n");


        if(smartphone1.equals(smartphone2)){
            System.out.println("Smartphone1 is equals to smartphone2");
        }else{
            System.out.println("Smartphone1 is different to smartphone2");
        }

        try{
            Smartphone smartphone3 = smartphone2.clone();
            System.out.println("\n++++++++ Cloned Smartphone Details ++++++++");
            System.out.println(smartphone3);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++\n");

            if(smartphone3.equals(smartphone2)){
                System.out.println("Smartphone3 is equals to smartphone2");
            }else{
                System.out.println("Smartphone3 is different to smartphone2");
            }

        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println("error");
        }


    }
}
