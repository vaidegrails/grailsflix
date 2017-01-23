package com.vaidegrails.grailsflix

class Categoria {

    String nome

    static hasMany = [videos: Video]

    static constraints = {
    }
}
