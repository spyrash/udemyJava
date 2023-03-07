public class Sim {

	private int numeroSim;
	private int importo;

	public Sim(int numeroSim, int importo) {
		this.importo = importo;
		this.numeroSim = numeroSim;
	}

	Telefonata[] telefonateFatte = new Telefonata[10];
	Telefonata[] telefonateRicevute = new Telefonata[10];

	public void costoTotaleTelefonate() {
		int costoTotale = 0;
		for (int i = 0; i < telefonateFatte.length; i++) {
			if (checkTelefonataIsNotNull(telefonateFatte[i])) {
				costoTotale = costoTotale + telefonateFatte[i].getCosto();
			}
		}
		System.out.println("costo Totale:" + costoTotale);
	}

	public void durataTotaleTelefonate() {
		int durataTotale = 0;
		for (int i = 0; i < telefonateFatte.length; i++) {
			if (checkTelefonataIsNotNull(telefonateFatte[i])) {
				durataTotale = durataTotale + telefonateFatte[i].getDurata();
			}
		}
		System.out.println("durata Totale :" + durataTotale);
	}

	public void aggiungiTelefonataFatta(Telefonata f) {
		for (int i = telefonateFatte.length - 2; i >= 0; i--) {
			telefonateFatte[i + 1] = telefonateFatte[i];
		}
		telefonateFatte[0] = f;
	}

	public void aggiungiTelefonataRicevuta(Telefonata f) {
		for (int i = telefonateRicevute.length - 2; i >= 0; i--) {
			telefonateRicevute[i + 1] = telefonateRicevute[i];
		}
		telefonateRicevute[0] = f;
	}

	public void stampaTelefonataFatte() {
		System.out.println("ELENCO TELEFONATE FATTE");
		for (int i = 0; i < telefonateFatte.length; i++) {
			if (checkTelefonataIsNotNull(telefonateFatte[i])) {
				System.out.println(telefonateFatte[i].getNumero());
			}
		}
	}

	public void stampaTelefonataRicevute() {
		System.out.println("ELENCO TELEFONATE RICEVUTE");
		for (int i = 0; i < telefonateFatte.length; i++) {
			if (checkTelefonataIsNotNull(telefonateFatte[i])) {
				System.out.println(telefonateFatte[i].getNumero());
			}
		}
	}

	public boolean checkTelefonataIsNotNull(Telefonata t) {
		return t != null;
	}

	public static void main(String[] args) {
		Telefonata t = new Telefonata();
		t.setNumero(122);
		t.setDurata(100);
		t.setCosto(200);

		Telefonata t1 = new Telefonata();
		t1.setNumero(122);
		t1.setDurata(100);
		t1.setCosto(200);

		Sim s = new Sim(1134, 10);
		s.aggiungiTelefonataFatta(t);
		s.aggiungiTelefonataFatta(t1);
		s.aggiungiTelefonataRicevuta(t1);

		s.stampaTelefonataFatte();
		s.stampaTelefonataRicevute();
		s.costoTotaleTelefonate();
		s.durataTotaleTelefonate();
	}
}
