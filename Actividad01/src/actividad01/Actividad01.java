/**
 * . Ingresar 10 libros con los siguientes datos: Título, Autor, Categoría y
 * Precio de venta. Al finalizar mostrar el promedio de venta de los libros que
 * pertenecen a la categoría de Historia.
 */
package actividad01;

import javax.swing.JOptionPane;

public class Actividad01 {

    public static void main(String[] args) {
        int totalLibros, cantidadLibros, precioVenta, cantidadHistoria;
        double promedio, totalHistoria;
        String titulo, autor, categoria;

        totalLibros = 3;
        cantidadLibros = 0;
        totalHistoria = 0;
        cantidadHistoria = 0;

        while (cantidadLibros < totalLibros) {
            titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro");
            autor = JOptionPane.showInputDialog("Ingrese el autor del libro");
            categoria = JOptionPane.showInputDialog("Ingrese la categoria del libro");
            precioVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de venta"));
            
            if(categoria.equalsIgnoreCase("historia")){
                totalHistoria = totalHistoria + precioVenta ;
                cantidadHistoria++;
                
            }
            cantidadLibros++;
        }
        promedio = totalHistoria / cantidadHistoria;
        System.out.println("Cantidad de Libros Historia: " + cantidadHistoria);
        System.out.println("Importe total de libros de Historia " + totalHistoria);
        System.out.println("El Promedio de ventas. " + promedio);
    }

}
