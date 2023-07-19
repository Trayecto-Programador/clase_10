/**
 * Ingresar 5 numeros enteros, se quiere calcular  el total de los numero y
 * cuantos son pares y impares
 */
package acumulador_contador;

import javax.swing.JOptionPane;

public class Acumulador_contador {

    public static void main(String[] args) {
        int numeros, pares, impares, total, tope, numerosIngresados;
        
        
        tope = 5;
        pares = 0;
        impares = 0;
        total = 0;
        numerosIngresados = 0;
        
        while (numerosIngresados < tope) {
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
            if(numeros % 2 == 0){
                pares = pares + 2;
            }else{
                impares += 3;
            }
            total = total + numeros;
            numerosIngresados++;
        }
        System.out.println("cantidad de pares " + pares);
        System.out.println("cantidad de impares " + impares);
        System.out.println("Suma total: " + total);
    }
    
}
