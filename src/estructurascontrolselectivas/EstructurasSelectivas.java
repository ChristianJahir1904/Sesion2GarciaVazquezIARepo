
package estructurascontrolselectivas;


public class EstructurasSelectivas {//inicia clase
    //funcion para conocer la estructura de control selectiva if
    public void selectivaIf() {
        //declaracion de variable inicializada double decimal
        double calificacion=7.5;
        if (calificacion>=6.0) {// se complio condiicon
            System.out.println("Aprobado tienes calificación: "+calificacion);
            
        } else {//para condición falsa
            System.out.println("Reprobado tirnrd califiación-: "+calificacion);
        }//termina else
    }//termina la función selectiva
public void selectivaSwitch (){
    int dia=1;
    switch (dia) {
        case 1: System.out.println("seleccionaste 1:Día Lunes"); break;
        case 2: System.out.println("seleccionaste 2:Día Martes"); break;
        case 3: System.out.println("seleccionaste 3:Día Miércoles"); break;
        case 4: System.out.println("seleccionaste 4:Día Jueves"); break;
        case 5: System.out.println("seleccionaste 5 :Día viernes"); break;
        
        default: System.out.println("Por favor pon un número del 1 al 5"); break;
            
    }
    
    
}//termina función switch

}//termina clase
