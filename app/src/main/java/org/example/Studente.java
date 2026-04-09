package org.example;

public class Studente extends Persona {
    private final int matricola;

    public Studente(String nome, String cognome, int matricola) {
        super(nome, cognome);
        if (matricola <= 0) {
            throw new IllegalArgumentException("Nome, cognome, o matricola non validi");
        }
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public String saluta(){
        return "Buongiorno, io sono: " + getNomeCompleto();
    }

}
