package com.murallaromana.dam.model.entities

import java.io.Serializable

data class Pelicula(
    var puntuacion: Double,
    var director: String,
    var titulo: String,
    var genero: String,
    var url: String
) : Serializable
