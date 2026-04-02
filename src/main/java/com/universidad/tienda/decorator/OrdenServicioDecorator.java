package com.universidad.tienda.decorator;

public abstract class OrdenServicioDecorator implements OrdenServicio {
    protected final OrdenServicio wrapped; // [cite: 319]

    public OrdenServicioDecorator(OrdenServicio wrapped) {
        this.wrapped = wrapped; // [cite: 321]
    }
}
