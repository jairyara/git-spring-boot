package itc.edu.co.demo.model;

/**
 * Clase simple que representa un mensaje
 */
public class Mensaje {
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