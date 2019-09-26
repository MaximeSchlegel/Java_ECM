package Projet.Personne;


import Projet.Note.Note;

import java.util.ArrayList;

public class EleveDigital extends Eleve {

    private ArrayList<Note> notes;

    public EleveDigital(String nom, String prenom, String ine, String promo, int annee) {
        super(nom, prenom, ine, promo, annee);
        notes = new ArrayList<>();
    }

    public EleveDigital(String nom, String prenom, String adresse, String numSec, String ine, String promo, int annee) {
        super(nom, prenom, adresse, numSec, ine, promo, annee);
        notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
}
