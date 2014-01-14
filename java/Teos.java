/*Toteuta Teos-luokka kirjastokäyttöön. Luokan tulee sisältää ainakin seuraavat 
attribuutit: 
Tekijä, teoksen nimi, genre, ISBN, sivumäärä ja tila. 
Tila-attribuutti kertoo, onko teos saatavilla, lainassa, hävinnyt tms.

Luokan tulee sisältää ainakin seuraavan toiminnallisuuden mahdollistavat metodit:

Teoksen tila täytyy voida muuttaa ja tarkistaa tai tulostaa.
Teoksen tiedot täytyy voida syöttää käyttäjän toimesta.
Teoksen tiedot täytyy voida tulostaa käyttäjälle.

Laadi lisäksi pääohjelma, jossa testaat luomasi luokan toiminnallisuuden.*/

import java.util.*;
//kirja luokka
class kirja {
	//kirjan attribuutit
	private String tekija;
	private String teoksenNimi;
	private String genre;
	private int ISBN;
	private int sivumaara;
	private String tila;
	
	public kirja (String auth, String name, String gen, int BN, int pages, String til)
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//otetaan tiedot käyttäjältä
		//tekijä
		System.out.println("Anna kirjan tekijä: ");
		auth = lukija.nextLine();
		setTekija(auth);
		//teoksen nimi
		System.out.println("Anna kirjan nimi: ");
		name = lukija.nextLine();
		setTeoksenNimi(name);
		//teoksen genre
		System.out.println("Anna kirjan genre: ");
		gen = lukija.nextLine();
		setGenre(gen);
		//teoksen ISBN numero
		System.out.println("Anna kirjan ISBN numero: ");
		BN = lukija.nextInt();
		setISBN(BN);
		//teoksen sivumaara
		System.out.println("Anna kirjan sivumaara: ");
		pages = lukija.nextInt();
		setSivumaara(pages);
		//lukija menee sekaisin int tyypin jälkeen, pitää 'lukea' rivi, jotta voidaan lukea seuraava string
		lukija.nextLine();
		//teoksen tila
		System.out.println("Anna kirjan tila (saatavilla, lainassa..): ");
		til = lukija.nextLine();
		setTila(til);
		
	}
	//getterit
	public String getTekija() {return tekija;}
	public String getTeoksenNimi() {return teoksenNimi;}
	public String getGenre() {return genre;}
	public int getISBN() {return ISBN;}
	public int getSivumaara() {return sivumaara;}
	public String getTila() {return tila;}
	//setterit
	public void setTekija(String uusitekija)
	{
		tekija = uusitekija;
	}
	public void setTeoksenNimi(String uusinimi)
	{
		teoksenNimi = uusinimi;
	}
	public void setGenre(String uusigenre)
	{
		genre = uusigenre;
	}
	public void setISBN(int uusiisbn)
	{
		ISBN = uusiisbn;
	}
	public void setSivumaara(int uusisivumaara)
	{
		sivumaara = uusisivumaara;
	}
	public void setTila(String uusitila)
	{
		tila = uusitila;
	}
	//tulostetaan teoksen tiedot
	public void tulosta()
	{
		System.out.println("Tekija: " + getTekija());
		System.out.println("Nimi: " + getTeoksenNimi());
		System.out.println("Genre: " + getGenre());
		System.out.println("ISBN: " + getISBN());
		System.out.println("sivumaara: " + getSivumaara());
		System.out.println("tila: " + getTila());
	}
	//muutetaan teoksen tila
	public void muutaTila()
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		System.out.println("muuta tila: ");
		tila = lukija.nextLine();
		setTila(tila);
	}
}
	
public class Teos {
	//pääohjelma
	public static void main(String[] args) 
	{
		int muutos;
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		
		
		System.out.println("Anna seuraavat tiedot: ");
		kirja teos = new kirja("tekija", "nimi", "genre", 0, 0, "tila");
		teos.tulosta();
		do
		{
			System.out.println("\nHaluatko muuttaa teoksen tilaa (1) vai tulostaa teoksen tilan (2)? (lopetus 0): ");
			muutos = lukija.nextInt();
		
			if (muutos == 1)
			{
				teos.muutaTila();
			}
			if (muutos == 2)
			{
				System.out.println(teos.getTila());
			}
		} while (muutos != 0);
	}
}