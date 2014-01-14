/*Laadi luokka tehtävien listaamista varten. Luokan tulee sisältää merkkijono, joka 
sisältää tehtävän kuvauksen. Luokan tulee lisäksi sisältää metodit, joiden avulla 
tehtäväkuvaus voidaan kysyä käyttäjältä ja tulostaa näytölle.

Määrittele pääohjelmassa jono, johon voidaan tallettaa tehtävä-luokan mukaisia 
olioita. Testaa pääohjelmassa monipuolisesti jonosi ja tehtävä-luokkasi toimintaa.*/

import java.util.*;
//toteutettava luokka
public class tehtava {
	
//tehtävälista luokka
public static class tehtavalista {
	protected String kuvaus;
	
	public tehtavalista(String desc)
	{
		kuvaus = desc;
	}
	//getteri
	public String getKuvaus() {return kuvaus;}
	//setteri
	public void setKuvaus(String uusikuvaus)
	{
		kuvaus = uusikuvaus;
	}
	//käyttäjältä kuvaus
	public void annaKuvaus()
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//tiedot käyttäjältä
		System.out.println("tehtävän kuvaus: ");
		kuvaus = lukija.nextLine();
		setKuvaus(kuvaus);
	}
	//tulostetaan kuvaus
	public void tulosta()
	{
		System.out.println(getKuvaus());
	}
}

	//pääohjelma
	public static void main(String[] args)
	{
		int valinta;
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//uusi tehtävälista
		tehtavalista Tehtava = new tehtavalista("kuvaus");
		Tehtava.annaKuvaus();
		System.out.println("\nsyötit: ");
		Tehtava.tulosta();
		//jono
		Queue<Object> jono = new LinkedList<Object>();
		jono.add(Tehtava.kuvaus);
		//kysytään kunnes käyttäjä antaa 0 syötteenä
		do
		{
			System.out.println("\nlisää tehtävä (1) tulosta tehtävät (2) (lopetus 0): ");
			valinta = lukija.nextInt();
			//lisätään tehtävä
			if (valinta == 1)
			{
				Tehtava.annaKuvaus();
				jono.add(Tehtava.kuvaus);
			}
			if (valinta == 2)
			{
				//tehdään jonosta taulukko
				Object[]objArray = jono.toArray();
				System.out.println("tehtävälista: ");
				for (int i = 0; i < objArray.length; i++)
				System.out.println(objArray[i]);
			}
		} while (valinta != 0);
	}
}