package com.example.tarea_1

import android.app.Activity
import android.os.Bundle
import com.example.tarea_1.databinding.ActivityMainBinding
//La activity es una vista
// declarando una clase
class MainActivity : Activity() {
    // Una variable tipo privada
    // lateinit: sirve para declara una propiedad cuando se contruye un objeto
    private lateinit var binding: ActivityMainBinding
    //overrible: sobre escribir
    //Super: esta llamado a onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //asignado valor
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //modificar el valor de textview
        //binding.text.text="practica"

        //Edgar Ivan Velasco Ramirez



    }
}