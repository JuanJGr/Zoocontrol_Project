package org.example;

public class ImplementoAseo extends ItemInventario {

    private String areaUso;

    public ImplementoAseo(String codigo, String nombre, int cantidad, String areaUso) {
        super(codigo, nombre, cantidad);
        this.areaUso = areaUso;
    }

    @Override
    public String gestionarUso() {
        return "IMPLEMENTO DE ASEO [" + getNombre() + "]: Utilizar en el área de '"
                + areaUso + "'. Cantidad disponible: " + getCantidad() + " unidades.";
    }
}