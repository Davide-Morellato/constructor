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
    Car(String brand){
        //richiamo le variabili
        this.brand = brand;
    }

    //dichiaro un metodo in cui richiamo la variabile horsePower
    void power(){
        System.out.println("I Cavalli sono: " + horsePower);
    }


    //////////////////////////////////////////////////
    //
    //OVERLOADED CONSTRUCTOR
    //come per i metodi, anche per i costruttori è possibile creare un nuovo costruttore con lo stesso nome del precedente, ma diversa signature (parametri)
    //
    //dichiaro altri costruttori cambiando solo i parametri
    Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    Car(String brand, String model, int horsePower){
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
}
