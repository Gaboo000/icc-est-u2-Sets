package main;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Set <String> construirHashSet(){
        Set <String> miHashSet = new HashSet<>();

        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("Melocoton");
        miHashSet.add("Melon");
        miHashSet.add("Pera");

        return miHashSet;
        
    }

    public static Set<String>construirLinkedHashSet(){
        Set<String> miLinkedHasSet = new LinkedHashSet<>();
    
        miLinkedHasSet.add("Manzana");
        miLinkedHasSet.add("Pera");
        miLinkedHasSet.add("Melocoton");
        miLinkedHasSet.add("Melon");
        miLinkedHasSet.add("Pera");   //elemento repetido, no se añadira de nuevo
    
        return miLinkedHasSet;
    
    }


    public static Set<String>construirTreeSet(){
    Set<String> miTreeSet = new TreeSet<>();

    miTreeSet.add("Manzana");
    miTreeSet.add("Pera");
    miTreeSet.add("Melocoton");
    miTreeSet.add("Melon");
    miTreeSet.add("Pera");    //elemento repetido, no se añadira de nuevo

    return miTreeSet;


    }


    public Set<String> construirTreeSetConComparacion(){
        Comparator <String> comparadorPorLongitud = new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                int resultado = Integer.compare(s1.length(), s2.length());
                if(resultado == 0){
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
            
        };

        Set<String> miTreeComparador  = new TreeSet<>(comparadorPorLongitud);
        
        miTreeComparador.add("Melon");
        miTreeComparador.add("Pera");
        miTreeComparador.add("Manzana");
        miTreeComparador.add("Fresa");
        miTreeComparador.add("Kiwi");
        miTreeComparador.add("Melocoton");
        miTreeComparador.add("Pera");

        return miTreeComparador;


    }


    
}
