/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej2_patronfactory;

public class EJ2_PATRONFACTORY {

    public static void main(String[] args) {
       // Creamos una figura de cada tipo usando la Factoría
        Figura f1 = FiguraFactory.crearFigura("triangulo", "Rojo");
        Figura f2 = FiguraFactory.crearFigura("rectangulo", "Azul");
        Figura f3 = FiguraFactory.crearFigura("circulo", "Verde");
        Figura f4 = FiguraFactory.crearFigura("cuadrado", "Amarillo");

        // Probamos el método dibujarFigura() en cada una
        f1.dibujarFigura();
        f2.dibujarFigura();
        f3.dibujarFigura();
        f4.dibujarFigura();
    }
}
