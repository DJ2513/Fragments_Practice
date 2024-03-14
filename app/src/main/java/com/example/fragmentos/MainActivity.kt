package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ircalculadora = findViewById<Button>(R.id.btn_atras)
        val irIMC = findViewById<Button>(R.id.btn_adelante)
        reemplazarFragmento(Inicio())

        ircalculadora.setOnClickListener{
            reemplazarFragmento(Calculadora())
        }

        irIMC.setOnClickListener{
            reemplazarFragmento(IndiceMC())
        }
    }

    public fun reemplazarFragmento(fragmento: Fragment){
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, fragmento)
        transaction.commit()
    }
}