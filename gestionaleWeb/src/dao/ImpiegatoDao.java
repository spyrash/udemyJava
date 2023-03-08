package dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthStyle;

import model.Impiegato;

public class ImpiegatoDao {

	private List<Impiegato> listaImpiegato = new ArrayList<>();

	public Impiegato ricercaPerCodiceFiscale(String codiceFiscale) {
		for (Impiegato impiegato : listaImpiegato) {
			if (impiegato.getCodiceFiscale() == codiceFiscale) {
				return impiegato;
			}
		}
		return null;
	}

	public void inserisci(Impiegato i) {
		listaImpiegato.add(i);
	}

	public boolean aggiorna(Impiegato i) {
		Impiegato impiegatoTrovato = ricercaPerCodiceFiscale(i.getCodiceFiscale());
		if (impiegatoTrovato == null) {
			return false;
		} else {
			int indexImpiegato = listaImpiegato.indexOf(impiegatoTrovato);
			listaImpiegato.set(indexImpiegato, i);
			return true;
		}
	}

	public boolean elimina(String codiceFiscale) {
		Impiegato impiegatoTrovato = ricercaPerCodiceFiscale(codiceFiscale);
		if (impiegatoTrovato == null) {
			return false;
		} else {
			int indexImpiegato = listaImpiegato.indexOf(impiegatoTrovato);
			listaImpiegato.remove(indexImpiegato);
			return true;
		}
	}

	public void stampaLista() {
		for (Impiegato impiegato : listaImpiegato) {
			System.out.println(impiegato.getNome() + ' ' + impiegato.getCognome());
		}
	}

	public static void main(String[] args) {
		Impiegato impiegato1 = new Impiegato();
		impiegato1.setCodiceFiscale("asdasd");
		impiegato1.setNome("diego");
		impiegato1.setCognome("udemy");
		impiegato1.setMatricola(11226);

		Impiegato impiegato2 = new Impiegato();
		impiegato2.setCodiceFiscale("asdasd2");
		impiegato2.setNome("diego2");
		impiegato2.setCognome("udemy2");
		impiegato2.setMatricola(112262);

		Impiegato impiegato3 = new Impiegato();
		impiegato3.setCodiceFiscale("asdasd3");
		impiegato3.setNome("diego3");
		impiegato3.setCognome("udemy3");
		impiegato3.setMatricola(112263);

		ImpiegatoDao impiegatoDao = new ImpiegatoDao();
		impiegatoDao.inserisci(impiegato1);
		impiegatoDao.inserisci(impiegato2);
		impiegatoDao.inserisci(impiegato3);
		impiegatoDao.stampaLista();
		impiegatoDao.elimina("asdasd3");
		impiegatoDao.stampaLista();
		impiegato2.setNome("nome cambiato");
		impiegatoDao.aggiorna(impiegato2);
		impiegatoDao.stampaLista();
	}
}
