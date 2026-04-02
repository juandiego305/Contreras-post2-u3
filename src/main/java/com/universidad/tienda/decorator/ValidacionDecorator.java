package com.universidad.tienda.decorator;

public class ValidacionDecorator extends OrdenServicioDecorator {
    private static final double MONTO_MINIMO = 1000.0; // [cite: 348]
    private static final double MONTO_MAXIMO = 50000000.0; // [cite: 349]

    public ValidacionDecorator(OrdenServicio wrapped) { super(wrapped); }

    @Override
    public String procesarOrden(String ordenId, double monto) {
        if (ordenId == null || ordenId.isBlank()) throw new IllegalArgumentException("ID de orden inválido"); // [cite: 352-354]
        if (monto < MONTO_MINIMO || monto > MONTO_MAXIMO) throw new IllegalArgumentException("Monto fuera de rango"); // [cite: 355]
        
        System.out.println("[VALIDACION] Orden " + ordenId + " validada correctamente."); // [cite: 359]
        return wrapped.procesarOrden(ordenId, monto); // [cite: 361]
    }
}