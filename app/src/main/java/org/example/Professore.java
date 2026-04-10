package org.example;

public class Professore extends Persona {
    private String settore;

    public Professore(String nome, String cognome, String settore) {
        if (settore == null) {
            throw new IllegalArgumentException("Settore non valido");
        }
        this.settore = settore;
        super(nome, cognome);
    }

    public String getSettore() {
        return settore;
    }
    public void setSettore(String settore) {
        this.settore = settore;
    }

    public void presenta() {
        System.out.println("Salve io sono: " + getNomeCompleto() + " ed insegno: " + this.getSettore());
    }
}
