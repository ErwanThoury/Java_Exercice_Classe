package com.example.democollection;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.Random;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //launch();
        /*
        Eleve hugo = new Eleve("Hugo");
        Eleve laura = new Eleve("Laura");
        Eleve brahim = new Eleve("Brahim");
        Eleve paul = new Eleve("Paul");
        Eleve sara = new Eleve("Sara");
        Eleve lorenz = new Eleve("Lorenz");
        Eleve pierre = new Eleve("Pierre");
        Eleve arthur = new Eleve("Arthur");
        Eleve justin = new Eleve("Justin");
        Eleve tomPer = new Eleve("TomPer");


        System.out.println(hugo.getNom());
        System.out.println(hugo.getMoyenne());
        System.out.println(hugo.toString());

        hugo.ajouterNote(23);
        hugo.ajouterNote(-6);
        hugo.ajouterNote(15);

        sara.ajouterNote(10);
        sara.ajouterNote(15);


        hugo.ajouterNote(13);
        hugo.ajouterNote(16);


        Unite sio = new Unite("sio1");

        sio.ajouteEleve(hugo);
        sio.ajouteEleve(brahim);
        sio.ajouteEleve(sara);

    */
        // Create a unit (class) named "sio1"
        Unite unite = new Unite("sio1");

        // Generate 10 students and add them to the unit
        for (int i = 1; i <= 10; i++) {
            Eleve student = generateStudent();
            unite.ajouteEleve(student);
        }
        unite.ajouteEleve(new Eleve("Tom"));
        // Display the information of all students in the unit
        System.out.println("Students in class " + unite.getElevesMoyInf10() + ":");
        System.out.println(unite.getMeilleurEleve());
        System.out.println(unite.getLesEleves());
        System.out.println(unite.getEleve("Tom"));
        System.out.println(unite.getEleve("scaze"));





    }
    // Method to generate a student with 2 random grades
    public static Eleve generateStudent() {
        // Generate random grades for the student
        int grade1 = generateRandomGrade();
        int grade2 = generateRandomGrade();

        // Create a new student with a name and add grades
        Eleve student = new Eleve("Student" + (new Random().nextInt(100) + 1));
        student.ajouterNote(grade1);
        student.ajouterNote(grade2);

        return student;
    }

    // Method to generate a random grade between 0 and 20
    public static int generateRandomGrade() {
        Random random = new Random();
        return random.nextInt(21); // Generates a random integer between 0 and 20
    }
}