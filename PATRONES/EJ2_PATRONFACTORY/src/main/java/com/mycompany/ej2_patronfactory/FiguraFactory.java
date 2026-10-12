/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej2_patronfactory;

public class FiguraFactory {

    // Método Factoría que crea y devuelve la figura solicitada
    public static Figura crearFigura(String tipoFigura, String color) {
        if (tipoFigura == null) {
            return null;
        }

        switch (tipoFigura.toLowerCase()) {
            case "triangulo":
                return new Triangulo(color);
            case "rectangulo":
                return new Rectangulo(color);
            case "circulo":
                return new Circulo(color);
            case "cuadrado":
                return new Cuadrado(color);
            default:
                throw new IllegalArgumentException("Tipo de figura no válido: " + tipoFigura);
        }
    }
}
