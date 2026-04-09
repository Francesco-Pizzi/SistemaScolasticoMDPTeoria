package org.example;

public class Professore {
    private String nome;
    private String cognome;
    private String settore;

    public Professore(String nome, String cognome, String settore) {
        if (nome == null || cognome == null || settore == null) {
            throw new IllegalArgumentException("Argomenti non validi");
        }
        this.nome = nome;
        this.cognome = cognome;
        this.settore = settore;
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
    public String getSettore() {
        return settore;
    }
    public void setSettore(String settore) {
        this.settore = settore;
    }
    public String getNomeCompleto() {
        return this.nome + " " + this.cognome;
    }
    public String presenta() {
        return "Salve io sono: " + getNomeCompleto() + " ed insegno: " + this.getSettore();
    }
}
