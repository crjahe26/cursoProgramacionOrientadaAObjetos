# Clase 2: ¿Qué resuelve la Programación Orientada a Objetos?

La programación Orientada a Objetos nace de los problemas creados por la programación estructurada y nos ayuda a resolver ciertos problemas como:

- Código muy largo: A medida que un programa va creciendo la cantidad de lineas va en aumento, la POO nos ayuda a solucionar esto.
- En la programación estructurada si algo falla, todo se rompe, ya que el código se ejecuta secuencialmente al momento de que una línea falla todo lo demás deja de funcionar.
- La programación estructurada genera código difícil de mantener.

# Clase 3: Paradigma Orientado a Objetos

Es un enfoque de programación que se basa en la idea de "objetos" interactivos. Cada objeto es una entidad independiente que contiene tanto datos como comportamiento. Estos objetos se comunican entre sí a través de mensajes, lo que les permite colaborar para realizar tareas.

## 4 Elementos:
- Clases
- Objetos
- Propiedades (o atributos)
- Métodos (o funciones)

## 4 Pilares:
- Encapsulamiento
- Abstracción
- Herencia
- Polimorfismo

# Clase 4: Lenguajes Orientados a Objetos

* Java:
    - Orientado a Objetos naturalmente.
    - Es muy utilizado en Android.
    - Y es usado del lado del servidor o Server Side.
* PHP
   - Lenguaje interpretado
   - Pensado para la Web
* Python
    - Diseñado para ser fácil de usar.
    - Múltiples usos: Web, Server Side, Análisis de Datos, Machine Learning, etc.
* Javascript
    - Lenguaje interpretado.
    - Orientado a Objetos pero basado en prototipos.
    - Pensado para la Web.
* C#
* Ruby
* Kotlin

# Clase 6: Diagramas de Modelado

**OMT:** Object Modeling Techniques. Es una metodología para el análisis orientado a objetos.

**UML:** Unified Modeling Language o Lenguaje de Modelado Unificado. Tomó las bases y técnicas de OMT unificándolas. Tenemos más opciones de diagramas como lo son Clases, Casos de Uso, Objetos, Actividades, Iteración, Estados, Implementación.

[Libro UML y Patrones](https://drive.google.com/file/d/1zLWH_tcEq_SuBHDA39094l4MX59DJKbz/view?pli=1)

# Clase 7: Qué es UML

[Nociones basicas de UML](https://platzi.com/clases/1474-oop/17219-uml/)

# Clase 8: Objetos

Los **Objetos** son aquellos que tienen propiedades y comportamientos, también serán sustantivos (Un sustantivo es una categoría gramatical que se utiliza para nombrar a una persona, lugar, cosa, animal o idea. Los sustantivos son palabras que se utilizan para referirse a entidades concretas o abstractas.).

- Las propiedades tambien son llamadas **atributos**, y serán todo lo que compone al objeto, suelen ser sustantivos tambien.
- Los comportamientos tambien son llamados **métodos** o funciones, y seran lo que puede hacer el objeto y suele ser verbos.

# Clase 9: Abstracción y clases

- **Abstracción**: Es la capacidad de representar las características esenciales de un objeto del mundo real en un modelo simplificado dentro del programa.

- **Clases**: Una clase es una plantilla o modelo que define las propiedades y comportamientos de un objeto.

# Clase 10: Modularidad

La modularidad hace referencia a subdividir nuestro código en pequeñas porciones o funcionalidades (modulos) que nos permita obtener un código mucho más limpio, facil de entender y sostenible.

La modularidad de nuestro código nos va a permitir:
- Reutilizar.
- Evitar colapsos.
- Hacer nuestro código más mantenible.
- Legibilidad.
- Resolución rápida de problemas.

Una buena práctica es separando las clases en archivos diferentes.

# Clase 15: ¿Qué es la herencia?

**Don’t repeat yourself** es una filosofía que promueve la reducción de duplicación en programación, esto nos va a inculcar que no tengamos líneas de código duplicadas. <br>
Toda pieza de información nunca debería ser duplicada debido a que incrementa la dificultad en los cambios y evolución. <br>
La herencia nos permite crear nuevas clases a partir de otras, se basa en modelos y conceptos de la vida real. También tenemos una jerarquía de padre e hijo.<br>
**Cuando detecto características y comportamientos iguales, entonces significa que debo realizar una abstracción.**






## 4 Elementos:
- Clases: Una clase es una plantilla o modelo que define las propiedades y comportamientos de un objeto.
- Objetos: Un objeto es una instancia de una clase, es decir, un ejemplar concreto que puede interactuar con otros objetos.
- Propiedades (o atributos): Las propiedades son las características o datos asociados a un objeto. Representan el estado de un objeto y describen su estado interno.
- Métodos (o funciones): Los métodos son las acciones o comportamientos que puede realizar un objeto. Representan las operaciones que se pueden realizar en un objeto o las acciones que el objeto puede llevar a cabo. Los métodos se definen dentro de una clase y se utilizan para modificar el estado de un objeto, acceder a sus propiedades o realizar operaciones relacionadas con el objeto. 

## 4 Pilares:
- Encapsulamiento: Es el mecanismo que permite ocultar los detalles internos de un objeto y exponer solo la interfaz necesaria para interactuar con él. La encapsulación ayuda a lograr la modularidad y el mantenimiento del código.
- Abstracción: Se refiere a la capacidad de representar las características esenciales de un objeto del mundo real en un modelo simplificado dentro del programa.
- Herencia: La herencia permite crear nuevas clases basadas en otras clases existentes. Una clase derivada hereda las propiedades y comportamientos de su clase padre, y puede añadir o modificar estos elementos según sea necesario.
- Polimorfismo: Es la capacidad de objetos de distintas clases de responder al mismo mensaje de formas diferentes. El polimorfismo permite tratar diferentes objetos de manera uniforme, lo que aumenta la flexibilidad y reutilización del código.