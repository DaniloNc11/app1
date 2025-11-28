package com.app1.app1;

import java.util.ArrayList;
import java.util.List;

public class Contenuto {

    private String titolo;
    private int annoPubblicazione;
    private List<String> genere = new ArrayList<>();

    public Contenuto(String titolo, int annoPubblicazione, List<String> genere) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.genere = genere;
    }



    public List<String> getGenere() {
        return genere;
    }

    public void setGenere(List<String> genere) {
        this.genere = genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    @Override
    public String toString() {
        return "Contenuto{" +
                "titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", genere=" + genere +
                '}';
    }
}