package com.example.recyclerview_ejemplo.Model

class Pokemon {

    var Nombre: String? = null
    var Tipo: String? = null
    var Ataque: String? = null
    var Foto: Int? = null

    constructor(Nombre: String?, Tipo: String?, Ataque: String?, Foto: Int?) {
        this.Nombre = Nombre
        this.Tipo = Tipo
        this.Ataque = Ataque
        this.Foto = Foto
    }
}