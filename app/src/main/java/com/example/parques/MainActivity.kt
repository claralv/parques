package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val TAG="info"
        binding.btnGuardar.setOnClickListener {
            //Para los checkbox
            /*if (binding.zonamascotas.isChecked)
                Log.d(TAG," Las actvidades del parque son: ${binding.zonamascotas.text}")

            //Para el spinner:
            Log.d(TAG,"La hora de apertura es ${binding.SpinnerOpeningTime.selectedItem}") */
            val miDialogo = MiDialogFragment()
            miDialogo.show(supportFragmentManager, "MiDialogo")

        }


    }
}