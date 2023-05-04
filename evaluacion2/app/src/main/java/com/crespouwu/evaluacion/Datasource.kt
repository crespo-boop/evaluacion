package com.crespouwu.evaluacion

class Datasource {
    fun loadComidas(): List<Comida>{
        return listOf<Comida>(
            Comida(1,R.string.tituloComida1,R.drawable.comida1),
            Comida(2,R.string.tituloComida2, R.drawable.comida2),
            Comida(3,R.string.tituloComida3, R.drawable.comida3),
            Comida(4,R.string.tituloComida4, R.drawable.comida4),
            Comida(5,R.string.tituloComida5, R.drawable.comida5)
        )
    }
}

