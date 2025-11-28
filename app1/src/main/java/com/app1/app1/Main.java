package com.app1.app1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> genere = new ArrayList<>();
        genere.add("Fantasy");
        genere.add("Avventura");

        Film film = new Film("Harry Potter", 1994, genere);

        film.setRegista("Chris Columbus");
        film.addAttore("Daniel Radcliffe");
        film.addAttore("Emma Watson");
        film.addAttore("Rupert Grint");

        System.out.println(film);
    }
}