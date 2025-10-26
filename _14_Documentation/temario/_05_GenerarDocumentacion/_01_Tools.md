# Herramientas para generar documentación automática

## Java
- **Javadoc**: `javadoc -d doc MiClase.java` genera documentación HTML.
- Plugins Maven/Gradle disponibles para automatizar la generación.

## Python
- **Sphinx**: Genera documentación HTML/PDF a partir de docstrings.
- Instalación: `pip install sphinx`
- Inicialización: `sphinx-quickstart`

## JavaScript
- **JSDoc**: Genera documentación a partir de comentarios `/** ... */`.
- Instalación: `npm install -g jsdoc`
- Generación: `jsdoc archivo.js -d docs`

## C#
- **XML Documentation**: Comentarios `///` y compilación con `/doc`.
- Genera archivo `.xml` que puede ser usado con herramientas como Sandcastle.
