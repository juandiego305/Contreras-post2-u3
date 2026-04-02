package com.universidad.tienda.facade;
import org.springframework.stereotype.Component;

@Component
public class PushService {
    public void enviar(String token, String titulo, String cuerpo) {
        System.out.println("PUSH para " + token + " | " + titulo); // [cite: 423-427]
    }
}