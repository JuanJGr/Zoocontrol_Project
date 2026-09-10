package org.example;

public class Reptil extends Animal {

    private boolean venenoso;

    public Reptil(String id, String tipo, double peso, boolean venenoso) {
        // Enviamos los datos generales a la clase Animal
        super(id, tipo, peso);

        // Guardamos la característica propia del reptil
        this.venenoso = venenoso;
    }

    // Devuelve si el reptil es venenoso o no
    public String getVenenoso() {
        return venenoso ? "Sí" : "No";
    }
}

