package com.example.recyclerview_ejemplo.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_ejemplo.Model.Pokemon
import com.example.recyclerview_ejemplo.R

class AdaptadorPokemon(val listaPokemon: List<Pokemon>):
    RecyclerView.Adapter<AdaptadorPokemon.ViewHolder>()
{

    //Paso 2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rv_pokemon,parent,false)
        return ViewHolder(vista)
    }

    //Paso 3
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pokemon = listaPokemon[position]

        holder.tvNombre.text = pokemon.Nombre
        holder.tvTipo.text = pokemon.Tipo
        holder.tvAtaque.text = pokemon.Ataque
        pokemon.Foto?.let { holder.IvFoto.setImageResource(it) }


    }

    //Paso 4
    override fun getItemCount(): Int {
        return listaPokemon.size
    }

    //Paso 1
        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            //Buscar el id de cada TV
            val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
            val tvTipo: TextView = itemView.findViewById(R.id.tvTipo)
            val tvAtaque: TextView = itemView.findViewById(R.id.tvAtaque)
            val IvFoto: ImageView = itemView.findViewById(R.id.ivFoto)

    }
}










