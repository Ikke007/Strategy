package Hausaufgaben;

import java.util.ArrayList;

public class TextDruckStrategy implements DruckStrategy{

	public void drucken(ArrayList<Artikel> list){
		for(Artikel a : list){
			System.out.println(a.getArtikelbezeichnung() + ":\t" + a.getEinzelpreis());
		}
	}
	
}
