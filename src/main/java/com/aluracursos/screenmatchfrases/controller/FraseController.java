package com.aluracursos.screenmatchfrases.controller;

import com.aluracursos.screenmatchfrases.dto.FraseDTO;
import com.aluracursos.screenmatchfrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller del MVC. Sirve de intermediario entre la View (frontend) y el Model (clases modelo,
//clases de servicio, clases de repositorio, etc). El controller no debe transformar los
//datos o llamar al repositorio, como buena practica

//RestController para indicar a Spring que estamos trabajando con el modelo Rest
//Autowired inyecta la dependencia FraseService para instanciarla y usar sus metodos
//GetMapping. Get trae informacion. Para mapear u obtener datos de una ruta
//"/series/frases" es la ruta (localhost:8080/series/frases) del endpoint que el
//frontend necesita. Creamos el metodo obtenerFraseAleatoria
@RestController
public class FraseController {
    @Autowired
    FraseService servicio;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }

}
