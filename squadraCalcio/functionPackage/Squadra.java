package functionPackage;
import java.util.*;



public class Squadra {
    private String nome;
    private List<Giocatore> giocatori;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Giocatore> getGiocatori() {
        return this.giocatori;
    }

    public void setGiocatori(List<Giocatore> giocatori) {
        this.giocatori = giocatori;
    }
}
