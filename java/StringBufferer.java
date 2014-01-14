/*Laadi kaksi funktiota: Ensimmäinen funktio kysyy ja palauttaa käyttäjältä tämän nimen 
ja toinen funktio kysyy ja palauttaa käyttäjältä tämän syntymäajan. Laadi myös 
pääohjelma, jossa yhdistät edellisten funktioiden palauttamat tiedot yhdeksi 
merkkijonoksi, minkä tulostat käyttäjälle. Käytä ratkaisussasi StringBuffer-luokkaa 
(ei String-luokkaa).*/

import java.util.*;
public class StringBufferer
{
public static void main(String[] args)
	{
	String nimi;
	int paiva;
	int kuukausi;
	int vuosiluku;
	
	StringBuffer Bnimi = new StringBuffer(20);
	StringBuffer BsyntymaAika = new StringBuffer(20);
	//lukija
	Scanner lukija;
	lukija = new Scanner(System.in);
	//toimiva ratkaisu, mutta ei käytä funktioita :( 
		//nimi
		System.out.println("anna nimesi: ");
		nimi = lukija.nextLine();
		//syntymäaika
		System.out.println("anna syntymäaikasi");
		System.out.println("päivä: ");
		paiva = lukija.nextInt();
		System.out.println("kuukausi: ");
		kuukausi = lukija.nextInt();
		System.out.println("vuosiluku: ");
		vuosiluku = lukija.nextInt();	

		Bnimi.append(nimi);
		BsyntymaAika.append(paiva).append(".").append(kuukausi).append(".").append(vuosiluku);
		System.out.println(Bnimi + " " + BsyntymaAika);
	}
}