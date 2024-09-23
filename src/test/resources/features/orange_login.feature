# author: Bryan Steven Biojó Romero
# language: es

@orangeLogin
Característica: Inicio de sesión

  Yo como Analista de Pruebas Generalista
  Quiero iniciar sesión en el sitio web OrangeHRM
  Para verificar que la aplicación web funcione correctamente

  Antecedentes:
    Dado que "Bryan" abre el sitio web OrangeHRM

  @orangeLoginSuccess
  Escenario: Inicio de sesión exitoso.
    Cuando ingresa las credenciales correctas
    Entonces debería visualizar el título de la página

  @orangeLoginError
  Escenario: Error en inicio de sesión.
    Cuando ingresa credenciales inválidas
    Entonces debería visualizar un mensaje de error