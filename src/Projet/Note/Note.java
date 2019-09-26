package Projet.Note;

public class Note {
    private int note;
    private int credit;
    private boolean valide;

    public Note(int note, int credit) {
        this.note = note;
        this.credit = credit;
        this.valide = note > 10;
    }

    public int getNote() {
        return note;
    }

    public int getCredit() {
        return credit;
    }

    public boolean isValide() {
        return valide;
    }

    public void setValide(boolean valide) {
        this.valide = valide;
    }
}
