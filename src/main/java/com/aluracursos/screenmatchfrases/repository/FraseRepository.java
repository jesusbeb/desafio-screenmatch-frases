package com.aluracursos.screenmatchfrases.repository;

import com.aluracursos.screenmatchfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//Para poder trabajar con las operaciones basicas del CRUD en la BD, usamos un repositorio.
//Creamos una Interface con el nombre de la identidad que se quiere mapear (Frase), seguida del subfijo
//Repository. Y extiende de JpaRepository el cual pide un tipo generico. Se le pasa la
//entidad a mapear (Frase) y el tipo del id (Long)
public interface FraseRepository extends JpaRepository<Frase, Long> {

    //Seleccionamos la frase f de la tabla Frase y f la ordenamos segun la funcion RANDOM
    //y devuelve una frase aleatoria
    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    public Frase obtenerFraseAleatoria();
}
