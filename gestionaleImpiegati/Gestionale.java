package gestionaleImpiegati;

import java.util.ArrayList;
import java.util.List;

public class Gestionale {
    private List<Impiegato> impiegati = new ArrayList<Impiegato>();
    private List<Dipartimento> dipartimenti = new ArrayList<Dipartimento>();
    private List<Progetto> progetti = new ArrayList<Progetto>();

    public List<Impiegato> getImpiegati() {
        return this.impiegati;
    }

    public void setImpiegati(List<Impiegato> impiegati) {
        this.impiegati = impiegati;
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


    public void addImpiegato (Impiegato imp){
        impiegati.add(imp);
    }

    public void deleteImpiegato (String codiceFiscale){
        for (Impiegato impiegato : impiegati) {
            if(impiegato.getCodiceFiscale().equals(codiceFiscale)){
                impiegati.remove(impiegato);
            }
        }
    }

    public void addProgetto(Progetto prog){
        progetti.add(prog);
    }

    public void linkImpiegatoProgetto(Progetto prog, Impiegato imp){
        for(Progetto progetto : progetti){
            if(progetto.getNome().equals(prog.getNome())){
                prog.getPartecipanti().add(imp);
            }
        }
    }

    public void addDipartimento(Dipartimento dip){
        dipartimenti.add(dip);
    }

    public void linkImpiegatoDipartimento(Dipartimento dip, Impiegato imp){
        for(Dipartimento dipartimento : dipartimenti){
            if(dipartimento.getNome().equals(dip.getNome())){
                dip.getImpiegati().add(imp);
            }
        }
    }

    @Override
    public String toString() {
        return "{" +
            " impiegati='" + getImpiegati() + "'" +
            ", dipartimenti='" + getDipartimenti() + "'" +
            ", progetti='" + getProgetti() + "'" +
            "}";
    }


    public static void main(String[] args){
        Gestionale g = new Gestionale();
        Impiegato i = new Impiegato();
        i.setCodiceFiscale("ii");
        g.addImpiegato(i);
        Progetto p = new Progetto("provaProgetto1");
        g.addProgetto(p);
        Impiegato f = new Impiegato();
        f.setCodiceFiscale("fff");
        g.linkImpiegatoProgetto(p, f);
        System.out.println("\n"+"\n"+"\n"+g.toString());

    }
}
