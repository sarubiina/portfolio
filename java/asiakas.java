/*Laadi asiakas-luokka, joka sisältää asiakkaan ID:n, nimen, sähköpostiosoitteen ja 
puhelinnumeron. Toteuta luokkaan metodi tietojen kysymistä varten.

Laadi tämän jälkeen luokkaan metodi, joka kirjoittaa luokan mukaisen olion sisältämät
tiedot talteen tekstitiedostoon. Toteuta metodi siten, että kaikkien asiakkaiden 
(kyseisestä luokasta luotujen olioiden) tiedot talletetaan samaan tekstitiedostoon. 
Alla on esimerkki tiedoston sisällöstä:

Data for customer #1
Name: Tino Torni
E-mail: TT@gmail.com
Phone number: 12345
Data for customer #2
Name: Andy Ant
E-mail: AA@luukku.com
Phone number: 56789 */

import java.util.*;
import java.io.*;
//asiakas luokka
class asiakas {
	//asiakkaan attribuutit
	private int ID;
	private String nimi;
	private String sahkoposti;
	private String puhelinnumero;
	
	public asiakas (int id, String name, String email, String number)
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//tiedot käyttäjältä
		//ID
		System.out.println("anna ID numero: ");
		id = lukija.nextInt();
		setID(id);
		//lukija menee sekaisin int tyypin jälkeen, pitää 'lukea' rivi, jotta voidaan lukea seuraava string
		lukija.nextLine();
		//nimi
		System.out.println("anna nimi: ");
		name = lukija.nextLine();
		setNimi(name);
		//sähköposti
		System.out.println("anna sähköposti: ");
		email = lukija.nextLine();
		setSahkoposti(email);
		//puhelinnumero
		System.out.println("anna puhelinnumero: ");
		number = lukija.nextLine();
		setPuhelinnumero(number);
	}
	//getterit
	public int getID() {return ID;}
	public String getNimi() {return nimi;}
	public String getSahkoposti() {return sahkoposti;}
	public String getPuhelinnumero() {return puhelinnumero;}
	//setterit
	public void setID(int uusiID)
	{
		ID = uusiID;
	}
	public void setNimi(String uusinimi)
	{
		nimi = uusinimi;
	}
	public void setSahkoposti(String uusisahkoposti)
	{
		sahkoposti = uusisahkoposti;
	}
	public void setPuhelinnumero(String uusipuhelinnumero)
	{
		puhelinnumero = uusipuhelinnumero;
	}
	//kirjoitetaan tiedot tiedostoon nimeltä asiakkaat.txt
	public void kirjoita(String tiedosto)
	{
		try {
			//true, jotta uusi tieto ei pyyhi vanhaa tietoa pois
			FileWriter output = new FileWriter("asiakkaat.txt", true);
			BufferedWriter writer = new BufferedWriter(output);
			//varsinainen kirjoitus
			writer.write("Data for customer: #" + getID());
			writer.newLine();
			writer.write("name: " + getNimi());
			writer.newLine();
			writer.write("e-mail: " + getSahkoposti());
			writer.newLine();
			writer.write("phone number: " + getPuhelinnumero());
			writer.newLine();
			//suljetaan tiedosto
			writer.close();
			//poikkeukset
		} catch (FileNotFoundException e) 
			{
				System.out.println("tiedostoa ei löytynyt. Lopetan");
				System.exit(1);
			}
		catch(IOException e)
			{
				System.out.println("Syöte- ja tulostevirtojen käsittely epäonnistui");
				System.exit(1);
			}
		catch(Exception e)
			{
				System.out.println("jotain meni pieleen. Lopetan");
				System.exit(1);
			}
	}
	//pääohjelma
	public static void main(String[] args)
	{
		//luodaan uusi asiakas
		asiakas Asiakas = new asiakas(0,"nimi","sahkis","numero");
		//kutsutaan kirjoita metodi ja käytetään asiakkaat.txt-tiedostoa
		Asiakas.kirjoita("asiakkaat.txt");
	}
}

