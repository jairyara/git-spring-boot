package itc.edu.co.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

/**
 * Clase simple que representa un mensaje
 */
@Component
public class Mensaje {
    @Value("¡Hola Mundo!")
    private String texto;
    
    public Mensaje() {
        
    }
    
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    @Override
    public String toString() {
        return texto;
    }
} 