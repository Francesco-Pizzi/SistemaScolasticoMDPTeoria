package org.example;

public class Studente {
    private String nome;
    private String cognome;
    private final int matricola;

    public Studente(String nome, String cognome, int matricola) {
        if (nome == null || cognome == null || matricola <= 0) {
            throw new IllegalArgumentException("Nome, cognome, o matricola non validi");
        }
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public int getMatricola() {
        return matricola;
    }
    public String getNomeCompleto(){
        return this.nome + " " + this.cognome;
    }
    public String saluta(){
        return "Buongiorno, io sono: " + getNomeCompleto();
    }
}
