**Proyecto-Poo-E192**
**project pizzeria**

Tecnología de Desarrollos de Sistemas Informáticos
📅 I Semestre 2026 👨‍🏫 Profesor: Mag. Carlos Adolfo Beltrán Castro
👨‍💻 Estudiantes: Orlando David Espinosa Vargas c.c.1232890399, Nicolas Ordoñez Ausecha c.c. 1097095501

Imagen de Pantalla Inicial con Menú del Proyecto

<img width="585" height="407" alt="Captura de pantalla 2026-04-23 061818" src="https://github.com/user-attachments/assets/d5d96e16-edb1-42d6-a3c4-387a573a1455" />


📂 Estructura del Proyecto
Lista de Menú de Opciones con logo e ítems de navegación:

Estructura de Archivos y Paquetes
📦 projectpizza (Tu Proyecto): Es la carpeta raíz donde debe estar tu archivo universidad.db.

📂 poo (Paquete Principal): El contenedor de toda tu lógica orientada a objetos.

📂 controlador: Contiene las clases que gestionan los datos.

Conexion.java: Clase para conectar a SQLite.

ProfesorController.java: (Equivalente a PizzaDAO) Gestiona las consultas SQL de los profesores.

📂 imgs: Carpeta para recursos visuales (como el logo de las UTS si lo usas).

📂 modelo: Contiene las clases molde.

Persona.java y Profesor.java: (Equivalente a Pizza) Representan la entidad y sus datos.

📂 vista: Contiene los archivos de interfaz gráfica.

VistaPrincipal.java / .form: La ventana con la tabla.

VistaFormularioProfesor.java / .form: (Equivalente a VistaFormCrear) El formulario de registro.

🚀 Descripción del Proyecto Este sistema es una solución integral de facturación desarrollada en Java SE, utilizando la biblioteca Swing para la interfaz gráfica. El objetivo principal es aplicar los pilares de la POO,para gestionar procesos de negocio de forma eficiente.

Características Principales: Arquitectura: Implementación de un modelo de capas para separar la lógica de negocio de la interfaz de usuario.

Interfaz Moderna: Uso de un menú lateral de navegación intuitivo con transiciones entre paneles (CardLayout) para una mejor experiencia de usuario.

Persistencia de Datos: Conexión BD postgresql mediante el patrón de diseño DAO (Data Access Object) para asegurar la integridad de la información.

Seguridad Básica: Sistema de cierre de sesión con mensajes informativos y validación de usuarios.

Funcionalidades del CRUD: El módulo de Usuarios permite la gestión completa de las personas autorizadas para interactuar con el sistema, incluyendo:

Registro: Creación de nuevos perfiles con validación de campos obligatorios.

Consulta: Visualización en "tiempo real" de los datos almacenados mediante JTable.

Actualización: Modificación de información existente con persistencia inmediata.

Eliminación: Borrado lógico o físico de registros para mantener la base de datos depurada.

🧰 Lista de Tecnologías Usadas
Lenguaje: java21+ IDE: Apache NetBeans Base de Datos: postgresql Librerías: * JDBC Driver (Conector de base de datos) -Swing estándar (para la interfaz) Repositorio:-GitHub desktop -GitHub(repositorio).

Base de datos en la carpeta controlador.
