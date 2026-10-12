/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej2_patronfactory;

// Subclase Cuadrado
public class Cuadrado extends Figura {
    public Cuadrado(String color) {
        super(color);
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Dibujando un Cuadrado de color " + getColor());
    }
}