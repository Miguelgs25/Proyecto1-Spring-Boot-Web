package com.miguelgs.springboot.app.springbootweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//En propertysources se pueden agregar multiples archivos de configuracion
@Configuration
@PropertySources({
    @PropertySource("classpath:textos.properties")
})
public class TextosPropertiesConfig {

    
}