package com.universidad.tienda;

import com.universidad.tienda.decorator.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; // [cite: 467-471]

class DecoratorTest {

    private OrdenServicio buildCompleto() {
        OrdenServicio base = new OrdenServicioBase(); // [cite: 474]
        return new AuditoriaDecorator(
                new ValidacionDecorator(
                        new LoggingDecorator(base))); // [cite: 475-477]
    }

    @Test
    void testOrdenValida() {
        OrdenServicio svc = buildCompleto();
        String result = svc.procesarOrden("ORD-001", 50000.0); // [cite: 480-482]
        assertTrue(result.startsWith("PROCESADA:")); // [cite: 483]
    }

    @Test
    void testOrdenMontoInvalido() {
        OrdenServicio svc = buildCompleto();
        // El monto 0.0 debe disparar la excepcion del ValidacionDecorator
        assertThrows(IllegalArgumentException.class, 
            () -> svc.procesarOrden("ORD-002", 0.0)); // [cite: 486-489]
    }

    @Test
    void testOrdenIdVacio() {
        OrdenServicio svc = buildCompleto();
        assertThrows(IllegalArgumentException.class, 
            () -> svc.procesarOrden("", 10000.0)); // [cite: 492-495]
    }
}