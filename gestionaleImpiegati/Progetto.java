package gestionaleImpiegati;

public class Progetto {
    private String nome;
    private Citta citta;
    private float budget;


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
