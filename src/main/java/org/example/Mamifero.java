package org.example;

public class Mamifero extends Animal {

    private double tiempoGestacion;

    public Mamifero(String id, String tipo, double peso, double tiempoGestacion) {
        // Inicializamos los atributos heredados de Animal
        super(id, tipo, peso);

        // Guardamos el dato propio del mamífero
        this.tiempoGestacion = tiempoGestacion;
    }

    // Permite consultar el tiempo de gestación
    public double getTiempoGestacion() {
        return tiempoGestacion;
    }
}

