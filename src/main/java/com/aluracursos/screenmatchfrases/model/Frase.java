package com.aluracursos.screenmatchfrases.model;

import jakarta.persistence.*;

//Clase para almacenar los datos de una frase
//Anotaciones de Hibernate
//Entity para mapear como entidad de JPA y crear la tabla en la BD
//Table da el nombre de la tabla en la BD
//Id (ó jakarta.persistence.Id) para indicar que el atributo sera el identificador de la tabla
//GeneratedValue se indica la estrategia de generacion del id.
//IDENTITY indica que sera incremental y JPA se encargara de eso
@Entity
@Table(name="frases")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String frase;
    private String personaje;
    private String poster;


    //Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
