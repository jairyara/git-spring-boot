package itc.edu.co.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import itc.edu.co.demo.service.MensajeService;

/**
 * Clase principal para ejecutar la aplicación
 */
public class Main {
    public static void main(String[] args) {
        // Cargar el contexto de Spring desde XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Obtener el servicio de mensajes desde el contexto
        MensajeService mensajeService = context.getBean(MensajeService.class);
        
        // Mostrar el mensaje
        System.out.println("Mensaje del servicio: " + mensajeService.getMensaje());
        
        // Cerrar el contexto
        ((ClassPathXmlApplicationContext) context).close();
    }
} 