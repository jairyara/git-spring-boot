# Spring Boot Hello World

Este es un proyecto simple de Spring Boot que muestra un mensaje "¡Hola Mundo!" cuando accedes a la ruta principal.

## Requisitos

- Java 17 o superior
- Maven 3.6.3 o superior

## Cómo ejecutar

1. Clona el repositorio
2. Navega al directorio del proyecto
3. Ejecuta el proyecto con Maven:
   ```bash
   mvn spring-boot:run
   ```
4. Abre tu navegador y visita: http://localhost:8080

## Estructura del proyecto

- `src/main/java/itc/edu/co/demo/DemoApplication.java` - Clase principal de la aplicación
- `src/main/java/itc/edu/co/demo/controller/HelloController.java` - Controlador REST que maneja las peticiones
- `pom.xml` - Archivo de configuración de Maven con las dependencias del proyecto
