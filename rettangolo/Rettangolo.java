
public class Rettangolo {

	int base;
	int altezza;

	public void CalcolaArea() {
		int area = base * altezza;
		System.out.println("l'area è:" + area);
	}

	public void calcolaPerimetro() {
		int perimetro = 2 * base + 2 * altezza;
		System.out.println("il perimentro è:" + perimetro);
	}
}
yh