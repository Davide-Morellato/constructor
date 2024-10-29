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
    }
}
