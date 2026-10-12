/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patrondi_deconstructor;

import java.util.ArrayList;
import java.util.List;

public class PATRONDI_DeConstructor {

    public static void main(String[] args) {
        // --- CREACIÓN DE LA PRIMERA CASA ---
        // 1. Creamos las dependencias fuera
        Tejado tejadoEspecial = new TejadoTejas(); // Usamos TejadoTejas
        List<Pared> paredesCasa1 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            paredesCasa1.add(new Pared(3.0)); // Paredes de 3 metros de altura
        }

        // 2. Inyectamos las dependencias al crear la Casa 1
        Casa casa1 = new Casa(120.5, tejadoEspecial, paredesCasa1);
        casa1.mostrarDetalles();


        // --- CREACIÓN DE LA SEGUNDA CASA ---
        // 1. Creamos otras dependencias
        Tejado tejadoEstandar = new Tejado(); // Usamos Tejado básico
        List<Pared> paredesCasa2 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            paredesCasa2.add(new Pared(2.8)); // Paredes de 2.8 metros de altura
        }

        // 2. Inyectamos las dependencias al crear la Casa 2
        Casa casa2 = new Casa(85.0, tejadoEstandar, paredesCasa2);
        casa2.mostrarDetalles();
    }
}
