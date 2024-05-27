### Taller - Evaluación de Opciones para Crear un Proyecto CRUD en Java

1. **¿Qué ventajas ofrece el uso de un framework como Spring para el desarrollo de aplicaciones CRUD?**
   
   - [*] *Dependencias:* Spring proporciona un mecanismo de inyección de dependencias que facilita el manejo de dependencias entre los diferentes componentes de la aplicación, lo cual promueve un bajo acoplamiento y mayor modularidad.
   - [*] *Capa de acceso a datos:* Spring ofrece una capa de abstracción sobre las operaciones de acceso a datos (como Spring Data JPA), lo cual simplifica la interacción con la base de datos y reduce código repetitivo.
   - [*] *Creación y gestión de objetos:* Spring maneja la creación y gestión de objetos, lo cual facilita el desarrollo y mantenimiento de la aplicación al simplificar el código necesario para realizar operaciones CRUD.
   - [*] *Transacciones:* Spring proporciona un sólido soporte para el manejo de transacciones, lo que facilita la implementación de operaciones atómicas y consistentes en la base de datos para asegurar la integridad de los datos.
   - [*] *Seguridad:* Spring facilita la implementación de funcionalidades transversales como el registro, la seguridad y la gestión de transacciones mediante Programación Orientada a Aspectos (AOP)
   - [*] *Comunidad:* Spring cuenta con una comunidad grande y un ecosistema de proyectos y bibliotecas adicionales que facilitan el desarrollo de aplicaciones complejas al proporcionar documentación abundante y completa.
   
2. **¿Cuáles son los pros y contras de usar java.sql y PreparedStatement directamente para operaciones CRUD?**
   
   *Pros:*
   - [p] Hay control total sobre todas las operaciones de la base de datos. Además, cada aspecto de la aplicación se puede personalizar.
   - [p] La interacción entre la API y JDBC es más sencilla y directa, y no requiere de un marco de trabajo adicional.
   - [p] No es necesario aprender ni depende de frameworks externos adicionales.
   - [p] En algunos casos, el rendimiento es mejor porque se evita la sobrecarga de un framework.

   *Cons:*
   - [c] El código se vuelve más repetitivo y es necesario reescribir el mismo código para realizar operaciones comunes.
   - [c] El manejo de errores y excepciones es más complejo ya que no hay un marco de trabajo que proporciona una gestión centralizada.
   - [c] Mantener o escalar el código se puede volver más difícil con el tiempo.
   - [c] Hay un mayor riesgo de errores de seguridad.
   
3. **¿Cómo maneja Spring las conexiones a la base de datos en comparación con el uso directo de java.sql?**
   
   Spring proporciona un enfoque más conveniente y robusto para manejar las conexiones a la base de datos en comparación con el uso directo de java.sql debido principalmente a:
   
   - [*] *DataSource:* en vez de proporcionar detalles de conexión directamente, Spring utiliza el concepto de `DataSource` para encapsular la configuración de conexión a la base de datos; esto permite cambiar fácilmente entre las diferentes fuentes de datos sin tener que modificar el código fuente.
   - [*] *Manejo de transacciones:* Spring ofrece un soporte para transacciones declarativas usando la anotación `@Transactional`, evitando código repetitivo y facilitando el manejo de transacciones.
   - [*] *Liberación automática de recursos:* Spring garantiza la liberación adecuada de recursos como conexiones, statements y resultsets (aún cuando hay excepciones) para evitar la fuga de recursos.
   
4. **¿Qué beneficios proporciona Spring Data JPA al trabajar con entidades de base de datos como 'categorias' y 'productos'?**
   
   - [p] No se tiene que escribir SQL explícito para realizar operaciones CRUD debido a repositorios.
   - [p] El mapeo de entidades de Java a tablas de base de datos se facilita mediante anotaciones y configuración de metadatos.
   - [p] La capa de abstracción "repositorios" encapsula las operaciones CRUD comunes, lo cual reduce la cantidad de código repetitivo necesario.
   - [p] Capacidades para la auditoría y validación de datos, lo cual conserva la integridad y coherencia de los datos.
   - [p] Soporte integrado para la paginación y ordenación de resultados, facilitando la implementación de interfaces de usuario con datos paginados.
   
5. **¿Cómo se maneja la validación de datos en Spring frente a java.sql?**
   
   - [*] Spring proporciona un mecanismo de validación basado en anotaciones (como `@NotNull` o `@Valid`) que se pueden aplicar directamente a los campos de las entidades o parámetros de los métodos.
   - [*] Spring permite crear validadores personalizados que implementan la interfaz `Validator`.
   - [*] Spring se integra con *Hibernate Validator*, una implementación de referencia de *Bean Validation (JSR-380)*, lo cual proporciona un manejo unificado de validación.
   - [*] En java.sql , la validación de datos se implementa manualmente en el código, lo cual puede llevar a código repetitivo y más propenso a errores. Esta validación se hace en la capa de presentación lo cual a su vez dificulta el mantenimiento y la reutilización del código.
   
6. **¿Qué opción recomendarías para un proyecto a largo plazo y por qué?**
   
   Para un proyecto a largo plazo escalable, recomendaría usar **Spring Boot** porque permite facilitar el mantenimiento y la evolución del proyecto, inyectar dependencias de forma intuitiva, manejar transacciones, garantizar la integridad de los datos, integrar herramientas de seguridad y validación, tiene una comunidad activa con recursos abundantes, y muchos más beneficios. En general, Spring es mejor para proyectos grandes a largo plazo mientras que java.sql es mejor para proyectos pequeños a corto plazo.
   
7. **¿Qué beneficios adicionales ofrece Spring Boot al desarrollar aplicaciones CRUD en comparación con usar solo Spring?**
   
   Spring Boot (un proyecto basado en Spring Framework) proporciona una forma más rápida y conveniente de crear de crear aplicaciones Spring. Entre los beneficios principales están:
   
   - [*] *Configuración automática:* Spring Boot aplica convenciones sobre configuración, lo cual reduce la cantidad de configuración manual necesaria; esto facilita el inicio rápido de un proyecto para centrarse en vez en la lógica de negocio.
   - [*] *Arranque integrado:* Spring Boot incluye un contenedor web integrado (como Tomcat) que simplifica el despliegue y la ejecución de la aplicación sin necesidad de un servidor web externo.
   - [*] *Dependencias de inicio:* Spring Boot proporciona dependencias de inicio que agrupan conjuntos de dependencias comunes, lo cual facilita la incorporación de funcionalidades específicas sin necesidad de configurar las dependencias necesarias manualmente.
   - [*] *Soporte para bases de datos:* Spring Boot facilita el uso de bases de datos durante el desarrollo, lo que simplifica las pruebas y el arranque inicial del proyecto sin necesidad de configurar una base de datos externa.
   - [*] *Herramientas de desarrollo:* Spring Boot proporciona herramientas de desarrollo convenientes, como el reinicio automático de la aplicación cuando se detectan cambios en el código fuente, lo que mejora la productividad durante el desarrollo.
