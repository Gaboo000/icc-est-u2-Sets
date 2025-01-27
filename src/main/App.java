package main;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;

public class App {
    public static void main(String[] args) {
        /*runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparador();*/
        runEjercicio();
    }

    public static void runHashSet() {
        Sets sets = new Sets(); 
        Set<String> ejemploHashSet = sets.construirHashSet(); 

        System.out.println("------HashSet------");
        System.out.println("Elementos del HashSet (no se garantiza orden):");

        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet() {
        Sets sets = new Sets(); 
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();

        System.out.println("------LinkedHashSet------");
        System.out.println("Elementos del LinkedHashSet (mantiene el orden de inserción):");

        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSet() {
        
        Sets sets = new Sets(); 
        
        Set<String> ejemploTreeSet = sets.construirTreeSet();

        System.out.println("------TreeSet------");
        System.out.println("Elementos del TreeSet (ordenados naturalmente):");

        for (String elemento : ejemploTreeSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSetConComparador() {
        Sets sets = new Sets(); // Crear una instancia de la clase Sets
        Set<String> ejemploTreeSetConComparador = sets.construirTreeSetConComparacion(); // Llamar al método
    
        System.out.println("------TreeSet con Comparador------");
        System.out.println("Elementos del TreeSet (ordenados por longitud y luego alfabéticamente):");
    
        for (String elemento : ejemploTreeSetConComparador) {
            System.out.println(elemento);
        }
    }
    private static void runEjercicio(){

        Contacto c1 = new Contacto("Pedro", "Lopez", "123456789");
        Contacto c2 = new Contacto("Pedro", "Lopez", "123456789");

        System.out.println(c1);
        System.out.println(c2);

        boolean comparacionReferencia = c1 == c2;
        System.out.println(comparacionReferencia);
        System.out.println(c1.equals(c2));



        System.out.println("Comparacion HashCode: ");

        boolean comparacionHashCode = c1.hashCode() == c2.hashCode();
        System.out.println(comparacionHashCode);
        System.out.println("c1: "+c1.hashCode()+" == c2: "+c2.hashCode()+comparacionHashCode);


        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());


        agenda.add(new Contacto("Pedro", "Lopez", "2222222222"));
        agenda.add(new Contacto("Luis", "Perez", "1111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));

        //el ultimo Pero Lopez tiene un telefono diferente 
        //pero equals() lo considerara duplicado, por lo que NOO se agrega;


        //imprimir cada nombre de la agenda 
        for(Contacto cont : agenda){
            System.out.println(cont);

        }

    }
    
}