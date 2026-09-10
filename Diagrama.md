
@startuml

class Animal {
- id : String
- tipo : String
- peso : double

    + Animal(id : String, tipo : String, peso : double)
    + getId() : String
    + getTipo() : String
    + getPeso() : double
    + setPeso(peso : double) : void
    + mostrarInformacion() : String
      }

class Mamifero {
- tiempoGestacion : double

    + Mamifero(id : String, tipo : String, peso : double, tiempoGestacion : double)
    + getTiempoGestacion() : double
      }

class Reptil {
- venenoso : boolean

    + Reptil(id : String, tipo : String, peso : double, venenoso : boolean)
    + getVenenoso() : String
      }

class ItemInventario {
# codigo : String
# nombre : String
# cantidad : int

    + ItemInventario(codigo : String, nombre : String, cantidad : int)
    + getNombre() : String
    + getCantidad() : int
    + gestionarUso() : String
}

class Alimento {
- tipoDieta : String

    + Alimento(codigo : String, nombre : String, cantidad : int, tipoDieta : String)
    + gestionarUso() : String
      }

class ImplementoAseo {
- areaUso : String

    + ImplementoAseo(codigo : String, nombre : String, cantidad : int, areaUso : String)
    + gestionarUso() : String
      }

class Medicina {
- tipoTratamiento : String

    + Medicina(codigo : String, nombre : String, cantidad : int, tipoTratamiento : String)
    + gestionarUso() : String
      }

class Main {
+ main(args : String[]) : void
  }

Animal <|-- Mamifero
Animal <|-- Reptil

ItemInventario <|-- Alimento
ItemInventario <|-- ImplementoAseo
ItemInventario <|-- Medicina

Main ..> Animal : crea
Main ..> Mamifero : crea
Main ..> Reptil : crea
Main ..> ItemInventario : utiliza
Main ..> Alimento : crea
Main ..> ImplementoAseo : crea
Main ..> Medicina : crea

@enduml
