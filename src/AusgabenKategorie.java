import java.util.ArrayList;
import java.util.List;

public class AusgabenKategorie extends AusgabeTemp{
    String name;
    List <AusgabeTemp> nachfolger;
    double gesamtausgaben;
    
    public AusgabenKategorie (String name) {
        this.name = name;
        nachfolger = new ArrayList <AusgabeTemp>();
    }
    
    public void add_unterkategorie(String name) {
        //TO-DO : Keine Namensduplikate
    	AusgabenKategorie kategorie = new AusgabenKategorie(this.name + "-" + name);
        nachfolger.add(kategorie);
    }
    
    public void add_ausgabe(Ausgabe a){
        nachfolger.add(a);
    }
    
    public void add_ausgabe(int key, double betrag, String beschreibung, int datum, boolean wiederholend) {
        //TO-DO: Key automatically generated
    	Ausgabe ausgabe = new Ausgabe(key, this, betrag, beschreibung, datum, wiederholend);
        nachfolger.add(ausgabe);
    }
    
    public String gib_name() {
    	return name;
    }
}
