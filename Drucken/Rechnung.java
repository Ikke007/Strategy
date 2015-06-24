package Hausaufgaben;

import java.util.ArrayList;

public class Rechnung {

	private ArrayList<Artikel> artikelListe;
	private DruckStrategy druckstrategy;
	

	public Rechnung(){
		artikelListe = new ArrayList<Artikel>();
	}
	
	public void add(Artikel artikel){
		artikelListe.add(artikel);
	}
	
	public void drucken(){
		druckstrategy.drucken(artikelListe);
	}
	
	public void setDruckstrategy(DruckStrategy druckstrategy) {
		this.druckstrategy = druckstrategy;
	}
	
	public static void main(String[] args) {
		
		Rechnung rechnung = new Rechnung();
		rechnung.add(new Artikel("Kuchen", 1.12));
		rechnung.add(new Artikel("Wasser", 12.12));
		rechnung.add(new Artikel("Luft", 17.32));
		
		rechnung.setDruckstrategy(new HTMLDruckStrategy());
		rechnung.drucken();
		
		rechnung.setDruckstrategy(new TextDruckStrategy());
		rechnung.drucken();
	}
	
}
