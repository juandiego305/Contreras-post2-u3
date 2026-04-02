package com.universidad.tienda.facade;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
    public void enviar(String dest, String asunto, String cuerpo) {
        System.out.println("EMAIL para " + dest + ": " + asunto); // [cite: 406-408]
    }
}