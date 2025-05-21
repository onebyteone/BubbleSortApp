# 🔢 BubbleSortApp

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Platform](https://img.shields.io/badge/Platform-Android-green.svg)](https://www.android.com/)
[![Language](https://img.shields.io/badge/Language-Kotlin-blue.svg)](https://kotlinlang.org/)

Una aplicación Android que permite ingresar cinco números y ordenarlos de forma ascendente o descendente utilizando el algoritmo de ordenamiento burbuja.

## 📋 Descripción

**BubbleSortApp** es una aplicación desarrollada en Kotlin para Android, diseñada con fines educativos para demostrar el funcionamiento del algoritmo de ordenamiento **burbuja (bubble sort)**. El usuario puede ingresar hasta cinco valores numéricos, los cuales se ordenan con solo presionar un botón.

## ✨ Características

- **Entrada de datos**: Permite al usuario ingresar cinco números enteros
- **Ordenamiento ascendente y descendente**: Selección del tipo de orden deseado
- **Interfaz simple**: Layout intuitivo y fácil de usar
- **Validación de datos**: Manejo de entradas no numéricas con mensajes de advertencia
- **Visualización clara**: Muestra los resultados ordenados en pantalla

## 🚀 Instalación

1. Clona este repositorio:
   ```bash
   git clone https://github.com/onebyteone/BubbleSortApp.git
   ````

2. Abre el proyecto en Android Studio

3. Sincroniza Gradle y ejecuta la aplicación en un emulador o dispositivo físico

## 💻 Requisitos

* Android Studio 4.0 o superior
* SDK mínimo: API 21 (Android 5.0 Lollipop)
* Dispositivo o emulador con Android 5.0 o superior

## 🛠️ Tecnologías utilizadas

* **Kotlin**: Lenguaje principal de programación
* **XML**: Para definir la interfaz de usuario
* **AndroidX**: Componentes modernos para desarrollo Android

## 📝 Uso

1. Inicia la aplicación
2. Ingresa cinco números enteros en los campos correspondientes
3. Presiona:

   * `ORDENAR ASC.` para ordenar los números de menor a mayor
   * `ORDENAR DESC.` para ordenar de mayor a menor
4. Visualiza el resultado en la parte inferior de la pantalla

## 🧠 Lógica de la aplicación

1. **Captura de datos**: Se toman los valores desde cinco `EditText`
2. **Validación**: Se verifica que todos los campos contengan números válidos
3. **Ordenamiento**:

   * Se implementa el algoritmo **bubble sort**
   * Ordenación controlada por el parámetro `ascendente = true/false`
4. **Resultado**: Se muestra la lista ordenada en un `TextView`

## 🔜 Próximas mejoras

* Permitir ingresar una cantidad variable de números
* Agregar animaciones para visualizar el proceso de ordenamiento
* Guardar historial de ordenamientos
* Soporte para temas claro/oscuro
* Mejora de diseño para pantallas pequeñas

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Para colaborar:

1. Haz Fork del proyecto
2. Crea una rama para tu función (`git checkout -b feature/nueva-funcionalidad`)
3. Realiza tus cambios y haz commit (`git commit -m 'Agrega nueva funcionalidad'`)
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.

## 📞 Contacto

Si tienes preguntas, sugerencias o detectas errores, abre un issue en este repositorio.
