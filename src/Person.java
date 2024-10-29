//
//creo la classe person
//
public class Person {
    /*
     * ASSEGNAZIONE DINAMICA DEI VALORI
     * 
     * dichiaro delle variabili con SCOPE GLOBALE (non assegno alcun valore)
     * dichiaro un costruttore a cui passo dei parametri che verranno sostituiti dai valori assegnati dall'istanza della classe Person in App.java
     * richiamo la variabile per assegnargli un valore, tramite il THIS (riferisce all'istanza della classe Person)
     */

    //variabili con scope globale
    String name;
    String surname;
    int age;

    //costruttore
    //dichiaro dei parametri per l'assegnazione dei valori
    Person(String name, String surname, int age){
        //richiamo le variabili
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //dichairo un metodo in cui richiamo la proprietà 'surname' tramite il this
    void greed(){
        System.out.println("Il mio cognome è " + this.surname);
    }


    //dichiaro un metodo in cui dichiaro una variabile con SCOPE LOCALE
    void add(int a, int b){
        //variabile con scope locale
        int result = a + b;
        System.out.println("risultato di add(): " + result);

        //Per permettere al metodo total() di accedere alla variabile 'result' per leggerne il valore
        //è necessario invocare il metodo total() tramite il THIS
        //assegnargli la variabile 'result'
        this.total(result);
    }

    //dichiaro un metodo 
    //assegno un parametro, specificando il tipo di dato da leggere, per accedere al valore di 'result' dichiarata in add()
    void total(int res){
        // System.out.println(result); => ERRORE perchè la variabile result NON viene trovata, in quanto è stata dichiarata nel metodo add(), per cui sarà a SCOPE LOCALE per add()

        //dichiaro una variabile con lo stesso nome di add()
        //NON darà errore, perchè essendo a SCOPE LOCALE non viene riconosciuta esternamente
        int result = 10 + 30;

        //stampo il valore di 'result' in add()
        System.out.println("Valore di add() richiamato in total(): " + res);

        //stampo il valore di 'result' in total()
        System.out.println("Valore di total(): " + result);
    }

}

