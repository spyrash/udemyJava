package gestionaleImpiegati;

public class Citta {
    private String nome;
    private String regione;

    public Citta(String nome, String regione){
        this.nome = nome;
        this.regione = regione;
    }
    public String getNome() {
        return this.nome;
    }

    public String getRegione() {
        return this.regione;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", regione='" + getRegione() + "'" +
            "}";
    }

}
