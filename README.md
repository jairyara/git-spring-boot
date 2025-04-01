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

## Instrucciones de Git

### Configuración inicial

1. Inicializar el repositorio:
   ```bash
   git init
   ```

2. Renombrar la rama principal a 'master':
   ```bash
   git branch -M master
   ```

3. Crear el archivo README.md y realizar el primer commit:
   ```bash
   git add README.md
   git commit -m "chore: Create a readme and stablish branch named master"
   ```

### Creación de rama de desarrollo

1. Crear y cambiar a la rama 'spring':
   ```bash
   git branch spring
   git switch spring
   ```

   > Nota: Se utiliza `git switch` en lugar de `git checkout` para seguir el principio de responsabilidad única, ya que `switch` está específicamente diseñado para cambiar entre ramas.

### Pull Request

1. Realizar los cambios necesarios en la rama 'spring'
2. Hacer commit de los cambios
3. Subir la rama al repositorio remoto:
   ```bash
   git push origin spring
   ```
4. Crear un Pull Request solicitando la revisión de los cambios

## Referencias

- [Git Checkout](https://git-scm.com/docs/git-checkout) 
- [Git Switch ](https://git-scm.com/docs/git-switch)
- [Git Restore](https://git-scm.com/docs/git-restore)
- [Git Switch vs Checkout](https://linuxhandbook.com/git-switch-checkout/)
