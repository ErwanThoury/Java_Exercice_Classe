package com.example.democollection;

import java.util.Scanner;

public class Livre {
    private String titre;
    private String auteur;
    public String toString(){
        return "Titre : "+this.titre+" auteur : "+this.auteur;
    }
    public void saisie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le titre du livre : ");
        this.titre = sc.next();
        System.out.println("Saisir l'auteur du livre : ");
        this.auteur = sc.next();
    }

}
