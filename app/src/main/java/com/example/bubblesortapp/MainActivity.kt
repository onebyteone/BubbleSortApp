package com.example.bubblesortapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lista de los 5 EditText de entrada
        val inputs = listOf<EditText>(
            findViewById(R.id.valor1),
            findViewById(R.id.valor2),
            findViewById(R.id.valor3),
            findViewById(R.id.valor4),
            findViewById(R.id.valor5)
        )

        // Referencias a botones y TextView de resultado
        val btnAsc = findViewById<Button>(R.id.btnOrdAsc)
        val btnDesc = findViewById<Button>(R.id.btnOrdDesc)
        val resultado = findViewById<TextView>(R.id.tvResultado)

        // Función para obtener los números ingresados en los EditText
        fun obtenerNumeros(): List<Int>? {
            return try {
                // .map aplica una función a cada elemento de la lista (inputs)
                // En este caso, convierte el texto de cada EditText a entero
                inputs.map { it.text.toString().toInt() }
            } catch (e: NumberFormatException) {
                // Si hay un error con las entradas, se muestra un mensaje
                Toast.makeText(
                    this,
                    "Por favor ingrese solo números válidos",
                    Toast.LENGTH_SHORT).show()
                null  // Se retorna null para indicar que no se pudo obtener la lista de números
            }
        }

        // Función para ordenar usando el método de la burbuja
        fun bubbleSort(lista: MutableList<Int>, ascendente: Boolean = true) {
            for (i in 0 until lista.size - 1) {
                for (j in 0 until lista.size - i - 1) {
                    // Se intercambian en los siguientes casos:
                    // Si se ordena ascendente y el valor actual es mayor que el siguiente
                    // Si se ordena descendente y el valor actual es menor que el siguiente
                    if ((ascendente && lista[j] > lista[j + 1]) ||
                        (!ascendente && lista[j] < lista[j + 1])) {
                        val temp = lista[j]
                        lista[j] = lista[j + 1]
                        lista[j + 1] = temp
                    }
                }
            }
        }

        // Acción cuando se presiona el botón "ORDENAR ASC."
        btnAsc.setOnClickListener {
            val numeros = obtenerNumeros()
            numeros?.let {  // Si numeros no es null, se ejecuta el bloque
                val lista = it.toMutableList()  // Se crea una lista mutable para ordenarla
                bubbleSort(lista, ascendente = true)  // Orden ascendente
                // Muestra la lista como texto
                resultado.text = "Resultado:\n${lista.joinToString(", ")}"
            }
        }

        // Acción cuando se presiona el botón "ORDENAR DESC."
        btnDesc.setOnClickListener {
            val numeros = obtenerNumeros()
            numeros?.let {
                val lista = it.toMutableList()
                bubbleSort(lista, ascendente = false)  // Orden descendente
                resultado.text = "Resultado:\n${lista.joinToString(", ")}"
            }
        }
    }
}