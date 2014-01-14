/*Muokkaa edellistä tehtävää seuraavasti.

Lisää asiakas-luokkaan metodi tietojen näytölle tulostamista varten. Lisää luokkaan 
tämän jälkeen metodi, jonka avulla voit lukea halutun asiakkaan tiedot edellisen 
tehtävän mukaisesti toteutetusta tekstitiedostosta asiakkaan ID:n perusteella, 
tyyliin:

public void readFromFile(String searchID)

Vihje: hyödynnä halutun asiakkaan etsinnässä String-luokan merkkijonojen käsittelyyn
tarjoamia metodeja.*/

import java.util.*;
import java.io.*;
//asiakas luokka
class asiakasb {
	//asiakkaan attribuutit
	private int ID;
	private String nimi;
	private String sahkoposti;
	private String puhelinnumero;
	
	public asiakasb (int id, String name, String email, String number)
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
	public void readFromFile(String searchID)
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//mikä tieto haetaan
		int etsiID;
		System.out.println("\nAnna asiakkaan ID: ");
		etsiID = lukija.nextInt();
		//luetaan tiedosto
		try {
			BufferedReader reader = new BufferedReader(new FileReader("asiakkaat.txt"));
			String luetturivi;
			while ((luetturivi = reader.readLine()) != null)
			{
				//jos luettu rivi sisältää kyseisen tiedon (käyttäjän antama ID)
				if (luetturivi.contains("Data for customer: #" + etsiID))
				{
					//kolmen rivin verran, niin että tiedot tulostetaan
					for (int i = 0; i < 3; i++)
					{
						luetturivi = reader.readLine();
						System.out.println(luetturivi);
					}
				}
				
			}
			reader.close();
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
		asiakasb Asiakas = new asiakasb(0,"nimi","sahkis","numero");
		//kutsutaan kirjoita metodi ja käytetään asiakkaat.txt-tiedostoa
		Asiakas.kirjoita("asiakkaat.txt");
		Asiakas.readFromFile("asiakkaat.txt");
	}
}

