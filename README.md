PROYECTO NOTEPASS - GESTOR DE CONTRASEÑAS (TAREA 1)

=========================================================================
Autor: Jaime
Versión: 1.0
Entorno de Desarrollo: NetBeans IDE
Lenguaje: Java (Swing)

DESCRIPCIÓN DEL PROYECTO

NotePass es una aplicación de escritorio desarrollada en Java Swing que simula
un gestor de contraseñas personal.

El objetivo de esta práctica es demostrar la implementación de una arquitectura
Modelo-Vista (separación entre DTO y GUI) y el uso de componentes gráficos
avanzados, siguiendo las pautas establecidas en los vídeos 5 y 6 de la asignatura.

La aplicación permite:

Visualizar un listado de contraseñas (simulado en memoria).

Registrar nuevas credenciales mediante un formulario detallado.

Validar y confirmar la información antes de guardarla.

ESTRUCTURA DEL CÓDIGO (ARQUITECTURA)

El proyecto se divide estrictamente en dos paquetes para separar responsabilidades:

A. PAQUETE: GestionContrasenas_DTO

Clase Registro.java:
Actúa como el Data Transfer Object (DTO). Encapsula los 7 atributos de
una contraseña (servicio, usuario, clave, categoría, seguridad, 2FA, notas).
Incluye métodos personalizados para facilitar la visualización (toString)
y la inserción en tablas (toArrayStringRegistro).

B. PAQUETE: GestionContrasenas_GUI

Clase PantallaPrincipal.java (JFrame):
Ventana inicial. Contiene la JTable donde se listan los registros y los
botones de navegación. Implementa la lógica para recibir datos de la ventana hija.

Clase PantallaRegistro.java (JDialog):
Formulario de alta. Es una ventana modal que bloquea la principal hasta que
se termina el registro. Contiene toda la lógica de validación y captura de datos.

CUMPLIMIENTO DE REQUISITOS (RÚBRICA)

La aplicación integra TODOS los componentes solicitados en el enunciado:

[x] Estructura Principal/Alta similar a los vídeos de referencia.
[x] Panel con Layout (Uso de BorderLayout y GroupLayout/Diseño Libre).
[x] RadioButton (Selección de Nivel de Seguridad: Alta/Baja).
[x] CheckBox (Selección de Doble Factor de Autenticación).
[x] ComboBox (Lista desplegable para Categoría del servicio).
[x] Campo de texto multilínea (JTextArea con Scroll para Notas).
[x] JOptionPane de Información (Resumen del registro al guardar).
[x] JOptionPane de Confirmación (Pregunta "¿Seguro?" antes de guardar y al salir).

APORTACIONES CREATIVAS Y MEJORAS

Para aportar valor adicional a la práctica, se han implementado las siguientes
funcionalidades no solicitadas explícitamente pero útiles en un contexto real:

A. SEGURIDAD Y USABILIDAD

Uso de JPasswordField: La contraseña se oculta por defecto con asteriscos
en lugar de usar un campo de texto plano inseguro.

CheckBox "Mostrar": Permite al usuario ver/ocultar la contraseña dinámicamente
manipulando el 'echoChar' del componente.

B. GENERADOR DE CONTRASEÑAS

Se ha programado un botón "GENERAR" que crea automáticamente una cadena
robusta de 12 caracteres aleatorios (letras mayúsculas, minúsculas,
números y símbolos) para facilitar el registro.

C. ESTÉTICA PERSONALIZADA ("CONSOLA SUAVE")

Se ha huido del diseño por defecto de Java (Nimbus/Metal).

Se ha aplicado una paleta de colores coherente (Gris Oscuro / Blanco / Azul Acero)
y una tipografía monoespaciada (DialogInput) para simular una interfaz
profesional y técnica, mejorando la experiencia visual.

NOTAS SOBRE LA EJECUCIÓN

La aplicación no utiliza base de datos real. Los datos se almacenan en la
memoria de la JTable y se pierden al cerrar la aplicación (conforme al alcance
de la tarea).

Para una correcta visualización de la estética retro, se recomienda ejecutar
el proyecto desde NetBeans o mediante el archivo JAR generado.

=======================================================================
