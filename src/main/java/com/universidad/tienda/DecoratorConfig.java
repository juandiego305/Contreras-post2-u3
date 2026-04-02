package com.universidad.tienda;

import com.universidad.tienda.decorator.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // [cite: 388]
public class DecoratorConfig {

    // Definimos el Bean que construye la cadena completa:
    // Auditoria -> Validacion -> Logging -> Base
    @Bean("ordenCompleto") // [cite: 393]
    public OrdenServicio ordenServicioCompleto(@Qualifier("ordenBase") OrdenServicio base) {
        return new AuditoriaDecorator( // [cite: 396]
                new ValidacionDecorator( // [cite: 397]
                        new LoggingDecorator(base))); // [cite: 398]
    }
}