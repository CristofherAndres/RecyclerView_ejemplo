package com.example.recyclerview_ejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_ejemplo.Adapter.AdaptadorPokemon
import com.example.recyclerview_ejemplo.Model.Pokemon

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvPokemon = findViewById<RecyclerView>(R.id.rv_pokemon)
        rvPokemon.layoutManager = LinearLayoutManager(this)

        val listPokemon = ArrayList<Pokemon>()

        listPokemon.add(Pokemon("Pikachu","Electrico","Impactrueno",R.drawable.pikachu))
        listPokemon.add(Pokemon("Charmarder","Fuego","Ascuas",null))
        listPokemon.add(Pokemon("Squirtle","Agua","Burbujas",null))

        val adaptadorPokemon = AdaptadorPokemon(listPokemon)
        rvPokemon.adapter = adaptadorPokemon

    }
}






