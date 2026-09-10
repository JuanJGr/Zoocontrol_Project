package org.example;


public class Main {

    public static void main(String[] args) {

        System.out.println("--- Registro de un nuevo animal ---");

        // Creamos una instancia de la clase Animal
        Animal animal = new Animal("A001", "No definida", 50.5);

        // Mostramos los datos iniciales
        System.out.println(animal.mostrarInformacion());

        // Actualizamos el peso mediante el método setter
        animal.setPeso(55.0);
        System.out.println("Peso actualizado: " + animal.getPeso() + " kg");

        // Probamos la validación ingresando un peso incorrecto
        animal.setPeso(-10);


        System.out.println("\n--- COMPROBACIÓN DE HERENCIA ---");

        Mamifero leon = new Mamifero("M001", "León Africano", 190.0, 3.5);
        Reptil cobra = new Reptil("R001", "Cobra Real", 6.0, true);

        System.out.println(leon.mostrarInformacion() + " | Gestación: " + leon.getTiempoGestacion() + " meses");
        System.out.println(cobra.mostrarInformacion() + " | Venenoso: " + cobra.getVenenoso());


        System.out.println("\n--- PROCESANDO INVENTARIO GLOBAL DEL ZOOLÓGICO ---");

        // Creamos un arreglo polimórfico (tipado con la clase Padre, pero contiene clases Hijas)
        ItemInventario[] listaInventario = new ItemInventario[] {
                new Alimento("AL-01", "Carne de Res", 150, "Carnívoro"),
                new Alimento("AL-02", "Pacas de Heno", 300, "Herbívoro"),
                new ItemInventario("IM-01", "Escoba de Cerda Dura", 15) // Puedes cambiarlo por tu clase ImplementoAseo
        };

        // MAGIA DEL POLIMORFISMO:
        // Recorremos la lista y llamamos EXACTAMENTE AL MISMO MÉTODO
        for (ItemInventario item : listaInventario) {
            System.out.println(item.gestionarUso());
        }



    }
}

