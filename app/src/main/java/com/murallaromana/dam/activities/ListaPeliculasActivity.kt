package com.murallaromana.dam.activities
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import com.murallaromana.dam.adapters.ListaPeliculasAdapter
import com.murallaromana.dam.model.data.PeliculasDaoMockImpl
import androidx.recyclerview.widget.DividerItemDecoration
import com.murallaromana.dam.App
import com.murallaromana.dam.App.Companion.peliculas
import com.murallaromana.dam.R
import com.murallaromana.dam.databinding.ActivityListaPeliculasBinding


class ListaPeliculasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListaPeliculasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_main)

        binding = ActivityListaPeliculasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    //obtenemos datos
        //val peliculasDao = PeliculasDaoMockImpl()
        val listaPeliculas = App.peliculas
    //creamos componentes
        val layoutManager = LinearLayoutManager(this)
        val adapter = ListaPeliculasAdapter(listaPeliculas,this)

        //asociamos el recyclesview con sus componentes
        binding.rvListaPeliculas.adapter=adapter
        binding.rvListaPeliculas.layoutManager=layoutManager
        binding.rvListaPeliculas.setHasFixedSize(true)

        val divider = DividerItemDecoration(binding.rvListaPeliculas.context, layoutManager.orientation)
        binding.rvListaPeliculas.addItemDecoration(divider)


        binding.fBoton.setOnClickListener{
            val intent = Intent(binding.root.context, DetallesActivity::class.java)
            startActivity(intent)

        }

    }


    override fun onResume() {
        super.onResume()
        val adapter=ListaPeliculasAdapter(peliculas , this)
        binding.rvListaPeliculas.adapter=adapter
    }
}