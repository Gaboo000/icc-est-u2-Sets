package main;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparador();
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
    
}