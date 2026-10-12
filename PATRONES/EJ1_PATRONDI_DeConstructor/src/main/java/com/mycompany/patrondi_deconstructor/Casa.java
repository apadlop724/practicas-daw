/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrondi_deconstructor;

import java.util.List;

public class Casa {
    private double area;
    private Tejado tejado;
    private List<Pared> paredes;

    // INYECCIÓN DE DEPENDENCIAS POR CONSTRUCTOR:
    // Los objetos (tejado y paredes) se reciben desde el exterior, no se hacen "new" aquí dentro.
    public Casa(double area, Tejado tejado, List<Pared> paredes) {
        if (paredes.size() != 4) {
            throw new IllegalArgumentException("Una casa debe tener exactamente 4 paredes.");
        }
        this.area = area;
        this.tejado = tejado;
        this.paredes = paredes;
    }

    public void mostrarDetalles() {
        System.out.println("--- DETALLES DE LA CASA ---");
        System.out.println("Área: " + area + " m²");
        System.out.print("Tipo de Tejado: ");
        tejado.darSoporte();
        System.out.println("Paredes: " + paredes.size() + " paredes instaladas de altura " + paredes.get(0).getAltura() + "m.");
        System.out.println();
    }
}