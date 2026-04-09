package org.example;

public class Professore extends Persona {
    private String settore;

    public Professore(String nome, String cognome, String settore) {
        super(nome, cognome);
        if (settore == null) {
            throw new IllegalArgumentException("Settore non valido");
        }
        this.settore = settore;
    }

    public String getSettore() {
        return settore;
    }
    public void setSettore(String settore) {
        this.settore = settore;
    }

    public String presenta() {
        return "Salve io sono: " + getNomeCompleto() + " ed insegno: " + this.getSettore();
    }
}
