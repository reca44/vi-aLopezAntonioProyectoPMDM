package com.murallaromana.dam.adapters
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.murallaromana.dam.R
import com.murallaromana.dam.activities.DetallesActivity
import com.murallaromana.dam.model.entities.Pelicula
import com.squareup.picasso.Picasso

class ListaPeliculasAdapter(val peliculas: List<Pelicula>):RecyclerView.Adapter<ListaPeliculasAdapter.PeliculasViewHolder>() {

    class PeliculasViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val tvTitulo=itemView.findViewById<TextView>(R.id.tvTitulo)
        val ivFoto=itemView.findViewById<ImageView>(R.id.ivFoto)
        val tvGenero=itemView.findViewById<TextView>(R.id.tvGenero)
        //val tvUrl=itemView.findViewById<TextView>(R.id.tvUrl)
        val tvNota=itemView.findViewById<TextView>(R.id.tvNota)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculasViewHolder {
        val LayoutInflater=LayoutInflater.from(parent.context).inflate(R.layout.activity_item_pelicula,parent,false)

        return PeliculasViewHolder(LayoutInflater)
    }

    override fun onBindViewHolder(holder: PeliculasViewHolder, position: Int) {
        val pelicula = peliculas.get(position)
        holder.tvTitulo.setText(pelicula.titulo)
        holder.tvGenero.setText(pelicula.genero)
        holder.tvNota.setText(pelicula.puntuacion.toString())
        Picasso.get().isLoggingEnabled = true
        Picasso.get().load(pelicula.url).into(holder.ivFoto)

       holder.itemView.setOnClickListener {
           val intent = Intent(holder.itemView.context, DetallesActivity::class.java)
           intent.putExtra("pelicula",pelicula)
           holder.itemView.context.startActivity(intent)
       }
    }

    override fun getItemCount(): Int {
       return peliculas.size
    }
}