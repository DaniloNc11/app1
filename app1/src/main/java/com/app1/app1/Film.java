package com.app1.app1;

import com.app1.app1.Contenuto;
import java.util.ArrayList;

public class Film extends Contenuto {
    private String regista;
    private ArrayList<String> attori;

    public Film(String titolo, int annoPubblicazione, ArrayList<String> genere) {
        super(titolo, annoPubblicazione, genere);
        this.attori = new ArrayList<>();
    }

    public Film(String titolo, int annoPubblicazione, ArrayList<String> genere,
                String regista, ArrayList<String> attori) {
        super(titolo, annoPubblicazione, genere);
        this.regista = regista;
        this.attori = attori;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public ArrayList<String> getAttori() {
        return attori;
    }

    public void setAttori(ArrayList<String> attori) {
        this.attori = attori;
    }

    public void addAttore(String attore) {
        if (this.attori == null) {
            this.attori = new ArrayList<>();
        }
        this.attori.add(attore);
    }

    @Override
    public String toString() {
        return "Film{" +
                "titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getAnnoPubblicazione() +
                ", genere=" + getGenere() +
                ", regista='" + regista + '\'' +
                ", attori=" + attori +
                '}';
    }
}