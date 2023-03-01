package functionPackage;
import java.util.*;



public class Campionato {
    private String nome;
    private List<Squadra> squadre; 
    private List<Partita> partite;

    public void infoSquadra(Squadra sq){
        for (Partita partita : partite) {
            if(partita.getSquadraCasa().getNome().equals(sq.getNome()))
            {
                System.out.println(sq);
            }
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Squadra> getSquadre() {
        return this.squadre;
    }

    public void setSquadre(List<Squadra> squadre) {
        this.squadre = squadre;
    }

    public List<Partita> getPartite() {
        return this.partite;
    }

    public void setPartite(List<Partita> partite) {
        this.partite = partite;
    }
}