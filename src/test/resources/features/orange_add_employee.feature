# author: Bryan Steven Biojó Romero
# language: es

@addEmployeeOrange
Característica: Creación de empleado

  Yo como Analista de Pruebas Generalista
  Quiero agregar un empleado en el sitio web OrangeHRM
  Para verificar que este ha sido contratado

  Antecedentes:
    Dado que "Bryan" abre el sitio web OrangeHRM
    Cuando ingresa las credenciales correctas

  Escenario:  Agregar un empleado.
    Y agrega toda la información del empleado
    Entonces debería visualizarse que el estado del empleado es contratado
