package org.example;

public class Alimento extends ItemInventario {

    private String tipoDieta;

    public Alimento(String codigo, String nombre, int cantidad, String tipoDieta) {
        super(codigo, nombre, cantidad);
        this.tipoDieta = tipoDieta;
    }

    @Override
    public String gestionarUso() {
        return "ALIMENTO [" + getNombre() + "]: Entregar en el área correspondiente a animales con dieta '"
                + tipoDieta + "'. Cantidad disponible: " + getCantidad() + " kg/unidades.";
    }
}

