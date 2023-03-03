package gestionaleImpiegati;

import java.util.List;

public class Progetto {
    private String nome;
    private Citta citta;
    private float budget;
    private List<Impiegato> partecipanti;
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Impiegato> getPartecipanti() {
        return this.partecipanti;
    }

    public void setPartecipanti(List<Impiegato> partecipanti) {
        this.partecipanti = partecipanti;
    }


    public Progetto(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public Citta getCitta() {
        return this.citta;
    }

    public void setCitta(Citta citta) {
        this.citta = citta;
    }

    public float getBudget() {
        return this.budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

}
