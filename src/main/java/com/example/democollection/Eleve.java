package com.example.democollection;

import java.util.ArrayList;

public class Eleve {
    private String nom;
    private ArrayList<Integer> listeNotes;
    public Eleve(String nom)
    {
        this.nom = nom;
        listeNotes = new ArrayList<>();
    }
    public void ajouterNote(int note) {
        if (note < 0) {
            note = 0;
        }
        if (note > 20) {
            note = 20;
        }
        this.listeNotes.add(note);
    }
    public String getNom () {
        return this.nom;
    }
    private int sommeNote(){
        int somme=0;
        for (int element:this.listeNotes){
            somme+=element;
        }
        return somme;
    }
    public Double getMoyenne() {
        double moyenne = 0;
        moyenne = (double) sommeNote() /this.listeNotes.size();
        return moyenne;
    }
    public String toString(){
        return (this.nom +" "+ getMoyenne());
    }

}
