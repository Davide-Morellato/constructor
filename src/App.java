public class App {
    public static void main(String[] args){

        //creo due istanze che riferiscono alla classe Person
        //assegno dei valori da far elaborare al costruttore Person() in Person.java, sostituendoli ai parametri di riferimento
        Person personThree = new Person("Luca", "Rossi", 33);
        
        Person personFour = new Person("Marco", "Polo", 88);

        //stampo nel terminale la proprietà 'name' delle due istanze
        System.out.println("Proprietà di personThree: " + personThree.name);
        System.out.println("Proprietà di personFour: " + personFour.name);


        //invoco il metodo 'greed' per le due istanze
        //in cui ho avuto accesso alla proprietà 'surname'
        personThree.greed();
        personFour.greed();

        //invoco il metodo add() a cui passo dei valori
        personFour.add(5, 3);



        /////////////////////////////////////
        //
        //
        //creo l'istanza della classe
        //assegno dei valori per il costruttore
        Car carOne = new Car("Fiat", "Panda", 90);
        Car carTwo = new Car("Opel", "Astra", 120);

        //stampo le proprietà delle istanze
        System.out.println("carOne brand: " + carOne.brand);
        System.out.println("carTwo model: " + carTwo.model);

        //invoco il metodo 'power' per entrambe le istanze
        carOne.power();
        carTwo.power();
    }
}
