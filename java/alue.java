/*Laadi metodi, joka ottaa parametrinaan alueen leveyden ja pituuden metreinä, 
sekä tiedon siitä palautetaanko tulos aareina tai hehtaareina. Tämän jälkeen 
metodi laskee alueen alan ja palauttaa tuloksen.

Laadi myös pääohjelma, jonka avulla testaat metodia.*/

import java.util.*;
public class alue
{
	//void metodi
	public static void laskeAla(double leveys, double pituus, int hehtaariAari)
	{
		//jos valitaan aarit
		if (hehtaariAari == 1)
		{
			int ala = (leveys*pituus) /100;
			System.out.println("alueen ala aareina on: " + ala);
		}
		//hehtaarit
		if (hehtaariAari == 2)
		{
			int ala =(leveys*pituus) /10000;
			System.out.println("alueen ala hehtaareina on: " + ala);
		}
	}
	public static void main(String[] args)
	{
	//lukija
	Scanner lukija;
	lukija = new Scanner(System.in);
	//muuttujat
	double leveys;
	double pituus;
	int hehtaariAari;
	//kysytään leveys
	System.out.println("Anna alueen leveys: ");
	leveys = lukija.nextDouble();
	//pituus
	System.out.println("Anna alueen pituus: ");
	pituus = lukija.nextDouble();
	//aareina vai hehtaareina
	System.out.println("haluatko alan aareina vai hehtaareina? (1,2)");
	hehtaariAari = lukija.nextDouble();
	//tulostetaan ala
	System.out.println("Alueen ala on: ");
	laskeAla(leveys, pituus, hehtaariAari);
	}
}