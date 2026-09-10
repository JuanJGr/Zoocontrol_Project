package org.example;

public class ItemInventario {

    protected String codigo;
    protected String nombre;
    protected int cantidad;

    public ItemInventario(String codigo, String nombre, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Método que puede ser redefinido por las clases hijas
    public String gestionarUso() {
        return "Uso genérico no definido.";
    }
}

