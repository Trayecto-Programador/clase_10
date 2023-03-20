/**
 * Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la
 * altura promedio de las personas.
 */
package actividad02;

import javax.swing.JOptionPane;

public class Actividad02 {

    public static void main(String[] args) {
        int cantidadAlturas, contadorAltura, altura;
        double promedio, totalAltura;

        cantidadAlturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Altura que desea cargar"));

        totalAltura = 0;
        contadorAltura = 0;

        while (contadorAltura < cantidadAlturas) {
            altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura expresada en centimetros"));
            totalAltura = totalAltura + altura;
            contadorAltura++;
        }
        promedio = totalAltura / contadorAltura;
        System.out.println("Promedio de Altura: " + promedio);
    }

}
