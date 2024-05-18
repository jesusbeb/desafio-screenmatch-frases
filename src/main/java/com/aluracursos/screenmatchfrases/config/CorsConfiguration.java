package com.aluracursos.screenmatchfrases.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Configuracion de CORS para indicar los puertos de frontend
//Anotamos clase como @Configuration para que sea reconocida como clase de configuracion
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    //Metodo implementado de la interfaz que crea un registro de Cors
    //Agrega los origenes del frontend
    //Los metodos a los que se les da permiso
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:5500")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
}
