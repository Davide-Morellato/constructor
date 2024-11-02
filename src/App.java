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

        /////////////////////////////////
        //
        //PER L'OVERLOADED CONSTRUCTOR
        Car carThree = new Car("Subaru");

        Car carFour = new Car("Volvo", "XC40");

        Car carFive = new Car("Reanult", "Clio", 90);

        System.out.println("primo costruttore: " + carThree.brand); //ENTRA NEL PRIMO COSTRUTTORE => SE carThree.model = 0 (ossia che non esiste un valore per quella proprietà)

        System.out.println("secondo costruttore: " + carFour.brand + " " + carFour.model); //ENTRA NEL SECONDO COSOTRUTTORE

        System.out.println("terzo costruttore: " + carFive.brand + " " + carFive.model + " " + carFive.horsePower); //ENTRA NEL TERZO COSTRUTTORE


        carThree.power(); //Invocando questo metodo con l'istanza carThree, non ottengo alcun risoltato perché fa riferimento alla proprietà horsePower, che per questo oggetto NON esiste (il costruttore non presenta questo parametro)

        carFive.power(); //avendo quest'istanza il parametro di riferimento horsePower nel costruttore, è possibile visualizzarne il valore nel terminale
    }
}
