package estructuradedatos;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> listaNombres=new ArrayList<>();
        
        listaNombres.add("Christian");
        listaNombres.add("Bryan");
        listaNombres.add("Adrian");
        listaNombres.add("Nestor");
        listaNombres.add("Felix");
        listaNombres.add("Gabriel");
        listaNombres.add("Jose");
        listaNombres.add("Tere");
        
        for (String listaNombre : listaNombres) {
            System.out.println("Nombre: "+listaNombre+"\nSiiuuu");
        }
    }
}