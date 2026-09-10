package org.example;

public class Medicina extends ItemInventario {

    private String tipoTratamiento;

    public Medicina(String codigo, String nombre, int cantidad, String tipoTratamiento) {
        super(codigo, nombre, cantidad);
        this.tipoTratamiento = tipoTratamiento;
    }

    @Override
    public String gestionarUso() {
        return "MEDICINA [" + getNombre() + "]: Administrar como tratamiento de tipo '"
                + tipoTratamiento + "'. Cantidad disponible: " + getCantidad() + " unidades.";
    }
}