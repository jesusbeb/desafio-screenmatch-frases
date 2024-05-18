package com.aluracursos.screenmatchfrases.dto;

//Clase record DTO (Data Transformer Object) que permite tener una representacion de
//un objeto y nos ayuda a mostrar la informacion necesaria al usuario. Ayuda tambien
//a no mostrar informacion sensible
public record FraseDTO(
        String titulo,
        String frase,
        String personaje,
        String poster
) {
}
