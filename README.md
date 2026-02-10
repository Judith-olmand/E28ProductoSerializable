- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
- PERSISTENCIA Y SERIALIZACIÓN

Inventario de Productos Serializable

Programa en Java que permite la gestión de un catálogo de productos, utilizando serialización para almacenar la información de forma persistente en archivos binarios.

🚀 Funcionalidades
- Gestión de Stock: Permite visualizar, añadir y listar productos con atributos de nombre, precio y cantidad.
- Interfaz Interactiva: Solicita datos al usuario a través de la consola para expandir el inventario en tiempo real.
- Persistencia Binaria: Guarda listas completas de objetos Producto en un archivo definido por el usuario, manteniendo la integridad de los datos numéricos y de texto.
- Carga de Datos: Recupera el inventario guardado para mostrarlo nuevamente al usuario, facilitando la continuidad del trabajo.

🛠️ Estructura técnica
- El programa aplica principios de persistencia de objetos y diseño modular:
- Clase Producto: Implementa Serializable para habilitar el flujo de datos binarios y sobrescribe equals/hashCode para una gestión precisa de los objetos.
- Serialización de Colecciones: Utiliza ObjectOutputStream para escribir la List completa de una sola vez, optimizando el proceso de guardado.
- Deserialización Dinámica: Emplea ObjectInputStream para reconstruir la lista de productos desde el archivo físico.
- Arquitectura Modular: Divide las responsabilidades en clases dedicadas (CrearFichero y LeerFichero) para separar la lógica de I/O del flujo principal.
