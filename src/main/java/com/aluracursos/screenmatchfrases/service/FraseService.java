package com.aluracursos.screenmatchfrases.service;

import com.aluracursos.screenmatchfrases.dto.FraseDTO;
import com.aluracursos.screenmatchfrases.model.Frase;
import com.aluracursos.screenmatchfrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Service para indicar que es una clase de servicio y trabajar con las reglas de
//negocio como buena practica. El pack service hace la transformacion de datos,
//operaciones, llamar al repository, contener los metodos, etc.
//Autowired para hacer inyeccion de dependencia de FraseRepository
@Service
public class FraseService {
@Autowired
private FraseRepository repository;

    //Creamos metodo que devuelve objeto de tipo FraseDTO
    //Creamos objeto de tipo Frase para almacenar lo que retorna el metodo del
    //repository. Despues retornamos un nuevo objeto de FraseDTO y le pasamos los
    // atributos obteniendolos del objeto frase
    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(),
                frase.getPoster());
    }
}
