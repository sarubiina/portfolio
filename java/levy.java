/*Laadi luokka, joka sisältää tiedot yksittäisestä cd-levystä. Minimissään tiedoista 
löytyvät artisti, levyn nimi ja vuosi. Laadi luokalle metodit, joiden avulla voit 
kysyä levyn tiedot käyttäjältä ja tulostaa levyn tiedot näytölle.

Toteuta myös pääohjelma, jolla testaat edellä esiteltyjen luokkien toimintaa. */

import java.util.*;
//toteutettava luokka
public class levy {
//cd-levy luokka
public static class CD {
	//CD attribuutit
	protected String nimi;
	protected String artisti;
	protected int vuosi;
	
	public CD(String name, String artist, int year)
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//tiedot käyttäjältä
		//nimi
		System.out.println("anna CD:n nimi: ");
		name = lukija.nextLine();
		setNimi(name);
		//artisti
		System.out.println("anna CD:n artisti: ");
		artist = lukija.nextLine();
		setArtisti(artist);
		//vuosi
		System.out.println("anna CD:n vuosiluku: ");
		year = lukija.nextInt();
		setVuosi(year);
	}
	//getterit
	public String getNimi() {return nimi;}
	public String getArtisti() { return artisti;}
	public int getVuosi() {return vuosi;}
	//setterit
	public void setNimi(String uusinimi)
	{
		nimi = uusinimi;
	}
	public void setArtisti (String uusiartisti)
	{
		artisti = uusiartisti;
	}
	public void setVuosi(int uusivuosi)
	{
		vuosi = uusivuosi;
	}
	//tulosta tiedot
	public void tulosta()
	{
		System.out.println("\nnimi: " + getNimi());
		System.out.println("artisti: " + getArtisti());
		System.out.println("vuosi: " + getVuosi());
	}
}
/*Laadi seuraavaksi levykokoelma-luokka. Levykokoelma-luokka sisältää vektorin, johon 
levyt talletetaan. Tämän lisäksi luokka sisältää metodit levyjen lisäämistä ja 
poistamista sekä kokoelman tulostamista varten.*/
//levykokoelma-luokka
public static class levykokoelma {
	
	//luodaan vektori
	Vector<Object> vektori = new Vector<Object>();
	
	//lisätään cd
	public void lisaa()
	{
		//levy
		CD cd = new CD("nimi","artist",0);
		//tulostetaan käyttäjän syöte
		cd.tulosta();
		//lisätään tiedot vektorille
		vektori.add(cd.nimi + " by " + cd.artisti + " in " + cd.vuosi);
	}
	//poistetaan vektorista tieto
	public void poistaCD()
	{
		int numero;
		//0 on ensimmäinen tieto. Kysytään käyttäjältä minkä vektorin tiedon haluaa poistaa
		System.out.println("minkä levyn tiedot haluaisit poistaa?(anna numero)");
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		numero = lukija.nextInt();
		vektori.remove(numero);
	}
	//tulostetaan vektori
	public void tulostaKokoelma()
	{
		//tehdään vektorista taulukko
		Object[]objArray = vektori.toArray();
		System.out.println("levykokoelma: ");
		for (int i = 0; i < objArray.length; i++)
		System.out.println(objArray[i]);
	}
}
	//pääohjelma
	public static void main(String[] args)
	{
		int muutos;
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//uusi levykokoelma
		levykokoelma kokoelma = new levykokoelma();
		kokoelma.lisaa();
		//kysytään kunnes käyttäjä antaa 0 syötteenä
		do
		{
			System.out.println("\nlisää levy (1) poista levy (2) tulosta levykokoelma (3) (lopetus 0): ");
			muutos = lukija.nextInt();
		
			if (muutos == 1)
			{
				kokoelma.lisaa();
			}
			if (muutos == 2)
			{
				kokoelma.poistaCD();
			}
			if (muutos == 3)
			{
				kokoelma.tulostaKokoelma();
			}
		} while (muutos != 0);
	}
}