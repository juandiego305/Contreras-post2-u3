package com.universidad.tienda.decorator;
import org.springframework.stereotype.Component;

@Component("ordenBase") // [cite: 306]
public class OrdenServicioBase implements OrdenServicio {
    @Override
    public String procesarOrden(String ordenId, double monto) {
        System.out.println("BASE: Procesando orden " + ordenId + " por $" + monto); // [cite: 309]
        return "PROCESADA:" + ordenId; // [cite: 312]
    }
}