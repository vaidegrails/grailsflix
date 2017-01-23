package com.vaidegrails.grailsflix

class Video {

    static belongsTo = [categoria: Categoria]

    String titulo
    Double duracao

    static constraints = {
    }
}
