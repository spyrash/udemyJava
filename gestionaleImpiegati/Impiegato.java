package gestionaleImpiegati;

import java.util.List;

public class Impiegato {
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private List<Dipartimento> dipartimenti;
    private List<Progetto> progetti;

    public String getCodiceFiscale() {
        return this.codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public List<Dipartimento> getDipartimenti() {
        return this.dipartimenti;
    }

    public void setDipartimenti(List<Dipartimento> dipartimenti) {
        this.dipartimenti = dipartimenti;
    }

    public List<Progetto> getProgetti() {
        return this.progetti;
    }

    public void setProgetti(List<Progetto> progetti) {
        this.progetti = progetti;
    }

}
