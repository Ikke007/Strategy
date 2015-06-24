package Hausaufgaben;

import java.util.ArrayList;

public class HTMLDruckStrategy implements DruckStrategy{

	@Override
	public void drucken(ArrayList<Artikel> list) {
		System.out.println("<table>");
		for(Artikel a : list){
			System.out.println("\t<tr>");
			System.out.println("\t\t<td>"+ a.getArtikelbezeichnung() +"</td>");
			System.out.println("\t\t<td>"+ a.getEinzelpreis() +"</td>");
			System.out.println("\t</tr>");
		}
		System.out.println("</table>");
		
	}
	
}
