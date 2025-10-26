
package estructurascontroliterativas;

/**
 *
 * @author jahir
 */
public class EstructurasIterativas {
    //estructura de control for imprimir abecedario
    public void iterativaFor(){
        for (char letra = 'A';  letra<='Z' ; letra++) {
            System.out.println("Letra es: "+letra);
        }
    }//termina método
    
    //Metodo-funcion estructura for each imprimir
    //arreglo es un tipo de dato que permite almacenar millones de valores
    public void estructuraForEach(){
        //declaración de un arreglo tipo entero
        int arregloNumeros []={3,2,100,500,1}; 
        //indexacion comenzar a contar desde cero en su primera posición
        for (int arregloNumero : arregloNumeros) {//inicia for-each
            
           System.out.println("Cantidad de arreglo es: "+arregloNumero);
            
        }//termina for-each
    }//termina método
    
    //metodo funcion while repite hasta que se cumpla una condicion
    public void estructuraWhile(){
        int contador=1; //variable tipo entero inicializada en 1
        while (contador<=5) {            
            System.out.println("Número es con while: "+contador);
            contador ++; //contador incrementado por cada ciclo en unidad
        }//termina while
    }//termina metodo
    
    
}//termina clase

