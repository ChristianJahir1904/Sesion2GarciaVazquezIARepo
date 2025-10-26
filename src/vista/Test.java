
package vista;
import estructurascontrolselectivas.EstructurasSelectivas;
import estructurascontroliterativas.EstructurasIterativas;
import java.util.Scanner;

/**
 *
 * @author jahir
 */
public class Test {

    //el meétodo static permite invocar
    public static void menuGeneral(){//inicia metodo menu
    int menu; //variable global tiene alcance en todos los metodos y estructuras de control
        
        do {            
            System.out.println("--Menú Estructuras de control GarciaV \n"
                + "1.- Selectivas \n "
                + "2.-Iterativas \n"
                + " 3.-Salir");
        Scanner entradaMenu= new Scanner(System.in); //objeto para capturar valores mediante teclado
        menu=entradaMenu.nextInt(); //guarda la opcion capturada en tipo entero
        switch (menu) {//inicia switch
            case 1:
                  //llamada del metodo selectivaIf mediante un objeto apuntador -a-
        EstructurasSelectivas a=new EstructurasSelectivas();
        a.selectivaIf();
        a.selectivaSwitch();//invocación al metodo  
            break;
            
            case 2:
        EstructurasIterativas b=new estructurascontroliterativas.EstructurasIterativas();
        b.iterativaFor(); //invocacion de metodo
        b.estructuraForEach();
        b.estructuraWhile();
            break;
            case 3:
                System.out.println("Finalizó el programa");
            break;
            default: System.out.println("Opción inválida, escoge del 1 al 3");
           
        }//termina switch

        } while (menu!=3);
        
        
    
    
    }//termina metodo menú
    
    public static void main(String[] args) {
         
        
    menuGeneral(); //invocacion de metodo
       
    }//termina main

    
}
