
public class Ausgabe extends AusgabeTemp{
	int key;
	double betrag;
	//Zahlunsmittel meinZahlungsmittel
	String beschreibung;
	int datum;
	AusgabenKategorie meineKategorie;
	boolean wiederholend;
	
	public Ausgabe(int key, AusgabenKategorie meineKategorie, double betrag, String beschreibung, int datum, boolean wiederholend) {
		edit_Ausgabe(key, meineKategorie, betrag, beschreibung, datum, wiederholend);	
	}

	public void edit_Ausgabe(int key, AusgabenKategorie meineKategorie, double betrag, String beschreibung, int datum, boolean wiederholend) {
		this.key = key;
		this.meineKategorie = meineKategorie;
		this.betrag = betrag;
		this.beschreibung = beschreibung;
		this.datum = datum;
		this.wiederholend = wiederholend;
	}
	
}
