/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej3_patronsingleton;


public class EJ3_PATRONSINGLETON {

    public static void main(String[] args) {
       // Intento 1: Obtenemos el presidente por primera vez
        Presidente p1 = Presidente.getInstancia("Joe", "Biden", 2020);
        System.out.println("Primer objeto obtenido:");
        System.out.println(p1);

        System.out.println("--------------------------------------------------");

        // Intento 2: Intentamos "crear" un nuevo presidente con otros datos
        Presidente p2 = Presidente.getInstancia("Donald", "Trump", 2024);
        System.out.println("Segundo objeto obtenido tras intentar crear otro diferente:");
        System.out.println(p2);

        System.out.println("--------------------------------------------------");

        // --- COMPROBACIONES DE QUE SOLO EXISTE UNA INSTANCIA ---

        // Comprobación 1: Comparar referencias de memoria con ==
        if (p1 == p2) {
            System.out.println("COMPROBACIÓN 1 EXITOSA: p1 y p2 apuntan exactamente al mismo espacio de memoria.");
        } else {
            System.out.println("ERROR: Hay dos instancias distintas.");
        }

        // Comprobación 2: Modificar los datos mediante una variable y ver si cambia en la otra
        p2.setNombre("Kamala");
        System.out.println("\nTras hacer p2.setNombre(\"Kamala\"):");
        System.out.println("Nombre en p1: " + p1.getNombre()); // Muestra Kamala
        System.out.println("Nombre en p2: " + p2.getNombre()); // Muestra Kamala
        
        if (p1.getNombre().equals(p1.getNombre())) {
            System.out.println("COMPROBACIÓN 2 EXITOSA: Modificar p2 ha modificado p1 porque son la misma instancia.");
        }
         System.out.println(p1);
          System.out.println(p2);
    }
}
