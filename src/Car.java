//
//creo una classe
//
public class Car {
    
    //dichiaro le variabili con scopo globale
    String brand;
    String model;
    int horsePower;


    //dichiaro il costruttore
    //a cui passo i parametri
    Car(String brand, String model, int horsePower){
        //richiamo le variabili
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    //dichiaro un metodo in cui richiamo la variabile horsePower
    void power(){
        System.out.println("I Cavalli sono: " + horsePower);
    }
}
