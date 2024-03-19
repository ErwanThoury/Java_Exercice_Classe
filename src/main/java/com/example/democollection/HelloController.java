package com.example.democollection;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<Livre> col = new ArrayList<>(); // Instancier une collection de Type ArrayList<Livre>

        for (int i=0 ; i<3 ; i++){
            Livre l1 = new Livre();
            l1.saisie();
            col.add(l1); // ajout d’un livre dans la collection
        }
        for(int i=0 ; i < col.size() ; i++){
            System.out.println("plop");
            System.out.println(col.get(i));
        }
        for (Livre element : col) {
            System.out.println(element);
        }


        //launch();
        ArrayList<Integer> l = remplirNote(new int[] {1,2,3});
        l.add(2);l.add(20);l.add(0);

        //Eleve e = new Eleve("Pierre", l);

    }

    public void aff()
    {
        System.out.println("A");
    }
    public ArrayList<Integer> remplirNote(int[] args)
    {
        ArrayList <ArrayList<ArrayList<Integer>>> col = new ArrayList<>();
        HashMap <ArrayList<Integer>, ArrayList<ArrayList<Integer>>> col2 = new HashMap<>();
        /*for (int i=0 ; i<args.length ; i++){
            col.add(args[i]); // ajout d’un livre dans la collection
        }
        return col;
        */
         return null;
    }


}