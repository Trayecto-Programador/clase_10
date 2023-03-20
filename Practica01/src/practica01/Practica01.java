/**
 * Se ingresan por teclado tres números,
 * si al menos uno de los valores ingresados es menor a 10,
 * imprimir en pantalla la leyenda "Alguno de los números es menor a diez".
 */
package practica01;

import javax.swing.JOptionPane;

public class Practica01 {

    public static void main(String[] args) {

        int contadorIngreso, numero, totalIngreso, valorMaximo;

        totalIngreso = 3;
        contadorIngreso = 0;
        valorMaximo = 10;

        while (contadorIngreso < totalIngreso) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nuevo numero"));

            if (numero < valorMaximo) {
                System.out.println("El numero ingresado " + numero + " es menor a " + valorMaximo);
            } else {
                System.out.println(numero);
            }

            contadorIngreso++;
        }
    }

}
