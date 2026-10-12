/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej3_patronsingleton;

//Clase Singleton
public class Presidente {

    // 1. Atributos solicitados
    private String nombre;
    private String apellidos;
    private int anoEleccion;

    // 2. Atributo estático privado que almacenará la ÚNICA instancia de la clase
    private static Presidente instanciaUnica;

    // 3. Constructor PRIVADO: evita que se pueda hacer 'new Presidente()' desde fuera
    private Presidente(String nombre, String apellidos, int anoEleccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anoEleccion = anoEleccion;
    }

    // 4. Método público estático para obtener la única instancia (Punto de acceso global)
    public static Presidente getInstancia(String nombre, String apellidos, int anoEleccion) {
        if (instanciaUnica == null) {
            // Si no se ha creado todavía, la creamos por primera y única vez
            instanciaUnica = new Presidente(nombre, apellidos, anoEleccion);
        }
        // Si ya existe, devolvemos la que ya está creada en memoria
        return instanciaUnica;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAnoEleccion() {
        return anoEleccion;
    }

    public void setAnoEleccion(int anoEleccion) {
        this.anoEleccion = anoEleccion;
    }

    @Override
    public String toString() {
        return "Presidente: " + nombre + " " + apellidos + " (Elegido en " + anoEleccion + ")";
    }
}
