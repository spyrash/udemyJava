package gestionaleImpiegati;

import java.util.List;

public class Dipartimento {
    private String nome;
    private int numeroTelefono;
    private Impiegato impiegatoDirigente;
    private Citta citta;
    private List<Impiegato> impiegati;
    
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Impiegato getImpiegatoDirigente() {
        return this.impiegatoDirigente;
    }

    public void setImpiegatoDirigente(Impiegato impiegatoDirigente) {
        this.impiegatoDirigente = impiegatoDirigente;
    }

    public Citta getCitta() {
        return this.citta;
    }

    public void setCitta(Citta citta) {
        this.citta = citta;
    }

    public List<Impiegato> getImpiegati() {
        return impiegati;
    }

    public void setImpiegati(List<Impiegato> impiegati) {
        this.impiegati = impiegati;
    }

}
