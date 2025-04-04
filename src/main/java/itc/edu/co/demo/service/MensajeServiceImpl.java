package itc.edu.co.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import itc.edu.co.demo.model.Mensaje;

/**
 * Implementación del servicio de mensajes
 */
@Service
public class MensajeServiceImpl implements MensajeService {
    
    private final Mensaje mensaje;
    
    @Autowired
    public MensajeServiceImpl(Mensaje mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public String getMensaje() {
        return mensaje.getTexto();
    }
} 