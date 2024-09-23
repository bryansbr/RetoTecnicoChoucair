# Reto Técnico - Choucair Testing

Este proyecto es la solución al Reto Técnico para el cargo de **Analista de pruebas generalista con automatización**. Las pruebas automatizadas se realizaron utilizando el lenguaje de programación Java bajo el patrón de diseño Screenplay + Cucumber.

## Tecnologías utilizadas

- **Java 11 (JDK)**.
- **Gradle**.
- **Selenium**.
- **Serenity BDD**.
- **Gherkin**.
- **Cucumber**.

## Estructura del proyecto

### src/main/java/co.com.screenplay.project
- **enums**: Enumeraciones utilizadas en el proyecto.
- **hooks**: Clases (ganchos) que gestionan las configuraciones iniciales de las pruebas.
- **models**: Modelos que representan las entidades del dominio del proyecto.
- **interactions**: Clases que definen interacciones específicas con la interfaz de usuario.
- **questions**: Clases que contienen preguntas sobre el estado de la interfaz de usuario.
- **tasks**: Clases que definen las tareas que un actor puede realizar.
- **ui**: Elementos de la interfaz de usuario y localizadores (Page objects).
- **utils**: Clases utilitarias que proporcionan funciones comunes a todo el proyecto.

### src/test/java/co.com.screenplay.project
- **runners**: Clases que ejecutan las pruebas.
- **stepdefinitions**: Implementación de los pasos descritos en los archivos `.feature`.

### src/test/resources
- **features**: Archivos `.feature` que describen los escenarios de prueba utilizando Gherkin.
- **files**: Archivos adicionales que se utilizan en las pruebas.
