package org.example;

public class Animal {

    // Propiedades privadas de la clase
    private String id;
    private String tipo;
    private double peso;

    // Constructor de la clase
    public Animal(String id, String tipo, double peso) {
        this.id = id;
        this.tipo = tipo;
        this.peso = peso;
    }

    // Métodos getter para consultar los atributos
    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    // Método setter para modificar el peso con una validación
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Error: El peso debe ser mayor que cero.");
        }
    }

    // Método para mostrar la información del animal
    public String mostrarInformacion() {
        return "[" + id + "] Tipo: " + tipo + " | Peso: " + peso + " kg";

    }
}