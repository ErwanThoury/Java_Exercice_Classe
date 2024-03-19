package com.example.democollection;

import java.util.ArrayList;

public class Unite {
    private String classe; //sio1
    ArrayList<Eleve> lesEleves; // Brahim Sara ...

    public Unite(String classe) {
        this.classe = classe;
        this.lesEleves = new ArrayList<>();
    }

    void ajouteEleve(Eleve e){
        lesEleves.add(e);
    }

    public String getClasse() {
        return classe;
    }

    public ArrayList<Eleve> getLesEleves() {
        return lesEleves;
    }

    public Eleve getMeilleurEleve(){
        Eleve meilleurEleve = lesEleves.getFirst();
        for (int i = 1; i<lesEleves.size(); i++){
            if(lesEleves.get(i).getMoyenne()>meilleurEleve.getMoyenne()){
                meilleurEleve = lesEleves.get(i);
            }
        }
        return meilleurEleve;
    }

    public Eleve getEleve(String nom){
        for(int i = 0; i< lesEleves.size();i++){
            if(lesEleves.get(i).getNom()==nom){
                return lesEleves.get(i);
            }
        }
        return null;
    }

    public ArrayList getElevesMoyInf10(){
        ArrayList<Eleve> listeEleveInf10 = new ArrayList<>();
        for(int i = 0; i< lesEleves.size();i++){
            if (lesEleves.get(i).getMoyenne()<10){
                listeEleveInf10.add(lesEleves.get(i));
            }
        }
        return listeEleveInf10;
    }


}
