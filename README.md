# CursoBasicoTestingEnJava

Tipos de Test:
*Unitario
*Integración
*Funcionales
*Inicio a Fin
*Estrés

Palabras Clave:
MAVEN
Mockito: https://site.mockito.org/
        @Before
        setup(){} Método donde se ponen partes comúnes
        @After -> debemos usar la instrucción para que JUnit ejecute la función cada vez que termina de hacer un test.
      
Pasos de los Test:
1.Preparación de los objetos
2.Llamada método a probar
3.Comprobación de resultado esperado

TDD:

El Test Driven Development (TDD) o desarrollo guiado por test, creado por Kent Beck, consiste en escribir primero los test antes que las clases permitiéndote ver si el diseño de una clase es la adecuada.

El ciclo del TDD
Red: escribe un test que falle.
Green: escribe el código necesario para que pase el test.
Refactor: mejora el código.
Reglas
Sólo escribirás código de test hasta que falle.
Sólo escribirás código de producción para pasar el test.
No escribirás más código de producción del necesario.

Organización de una aplicación->
Por lo general una aplicación se divide en:

Interfaz: Se encarga de la comunicación con el exterior o un usuario.
Negocio: Es la lógica de nuestra aplicación.
Datos: Se encarga de guardar los datos de nuestra aplicación.
Cada capa se puede comunicar con otra, pero no conoce los detalles de implementación.

