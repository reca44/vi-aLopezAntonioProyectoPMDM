package com.murallaromana.dam.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.murallaromana.dam.R

class login : AppCompatActivity() {
    private lateinit var btRegistrarse: Button
    private lateinit var btIniciar: Button
    private  lateinit var textIUsuario: TextInputEditText
    private  lateinit var textIpassLogin: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        btRegistrarse = findViewById(R.id.Registrarse)
        btIniciar=findViewById(R.id.btIniciar)
        btRegistrarse.setOnClickListener {
            Toast.makeText(this, "Registro", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, registro::class.java)
            startActivity(intent)
    }

        btIniciar.setOnClickListener{
        textIUsuario=findViewById(R.id.inputUsuario)
        textIpassLogin=findViewById(R.id.inputPass)
//            val sharedPref =getPreferences(MODE_PRIVATE)
//           // val defaultValue = resources.getString(R.integer.saved_high_score_default_key)
//
//            val highScore = sharedPref.getString("Usuario", "")
//            val highScore2 = sharedPref.getString("Password", "")
//            if (highScore.equals(textIUsuario.text.toString())&&
//                highScore2.equals(textIpassLogin.text.toString())){
//                Toast.makeText(this,"Datos correctos",Toast.LENGTH_SHORT).show()
//
//
//            }else{
//                Toast.makeText(this,"Error,datos mal",Toast.LENGTH_SHORT).show()
//               // textIUsuario.setText(highScore)
//               // textIpassLogin.setText(highScore2)
//            }
            Toast.makeText(this, "Listado", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, registro::class.java)
            startActivity(intent)
        }

    }
}