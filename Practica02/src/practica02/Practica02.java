/**
 * Escribir un programa que solicite la carga de un número entre 0 y 999,
 * y nos muestre un mensaje de cuántos dígitos tiene el mismo. 
 * Finalizar el programa cuando se cargue el valor S/N.
 */
package practica02;

import javax.swing.JOptionPane;


public class Practica02 {

    public static void main(String[] args) {
        // Declaracion de variable
        int numero;
        String iniciarComprobacionDigito;
        
        // Inicializacion de las variables
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 999"));
        iniciarComprobacionDigito = "S";
        
        //Proceso de solucion
            // Validos el ingreso de la variable numero
        if(!(numero > 0 && numero <=999)){
            System.out.println("El numero ingresado esta fuera de rango");
            iniciarComprobacionDigito = "N"; // si la condicion se cumple no inicio la comprobacion de digitos
        }
            // Inicio la repeticion
        while (iniciarComprobacionDigito.equalsIgnoreCase("S")) {
                //Comprobacion 1
            if (numero >= 0 && numero <10 ) {
                System.out.println("el numero ingresado " + numero + " tiene un digito");
            } else {//Comprobacion 2
                if(numero >= 10 && numero <100){
                    System.out.println("el numero ingresado " + numero + " tiene dos digito");
                }
                else{// Comprobacion 3 
                    if(numero >= 100 && numero <1000){
                        System.out.println("el numero ingresado " + numero + " tiene tres digito");
                    }
                    
                }
            }
            // Pregunto si quiere continuar .....
            System.out.println("Desea continuar S/N");
            // almaceno la respuesta en la variable iniciar Carga
            iniciarComprobacionDigito = JOptionPane.showInputDialog("Ingrese S para continuar y N para salir");
            
                // valido la respuesta
            if(iniciarComprobacionDigito.equalsIgnoreCase("s")){
                // solicito el ingreso del numero para volver almacenar en la variable numero
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 999"));
               //valido el numero ingresado
                if(!(numero > 0 && numero <=999)){
            System.out.println("El numero ingresado esta fuera de rango");
               }
            }
            
        }
    }
    
}
