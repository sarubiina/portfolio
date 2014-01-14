/*Muuta edellistä tehtävää siten, että se tallettaa tiedot tekstitiedoston sijaan 
binääritiedostoon.

Vihje:
Voit hyödyntää tietojen tallentamisessa ja lukemisessa esimerkiksi alla olevia 
ObjectInputStream:in tarjoamia metodeja asianmukaisten tyyppimuunnosten kera.

Filewriter.writeObject(email);
Filewriter.writeInt(phonenumber);
email = (String) Filereader.readObject();
phonenumber = Filereader.readInt();*/

import java.util.*;
import java.io.*;
//asiakas luokka
class asiakasc {
	//asiakkaan attribuutit
	private int ID;
	private String nimi;
	private String sahkoposti;
	private String puhelinnumero;
	
	public asiakasc (int id, String name, String email, String number)
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
			FileOutputStream output = new FileOutputStream("asiakkaatbin.bin", true);
			ObjectOutputStream writer = new ObjectOutputStream(output);
			//varsinainen kirjoitus
			writer.writeInt(ID);
			writer.writeObject(nimi);
			writer.writeObject(sahkoposti);
			writer.writeObject(puhelinnumero);
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
		ObjectInputStream reader = null;
		//luetaan tiedosto
		try {
			FileInputStream tiedosto = new FileInputStream("asiakkaatbin.bin");
			reader =  new ObjectInputStream(tiedosto);
			while (true)
			{
				ID = reader.readInt();	
				nimi = (String) reader.readObject();
				sahkoposti = (String) reader.readObject();
				puhelinnumero = (String) reader.readObject();
			} 
		 }catch (EOFException eof)
			{
				System.out.println("tiedosto loppui\n");
				try 
				{
					reader.close();
				}
				catch(IOException e)
				{
					System.out.println("Tiedoston sulkeminen epäonnistui. Lopetan");
					System.exit(1);
				}
			}
		catch (FileNotFoundException e) 
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
			System.out.println("Data for customer: #" + ID);
			System.out.println("name: " + nimi);
			System.out.println("e-mail: " + sahkoposti);
			System.out.println("number: " + puhelinnumero);
	}
	//pääohjelma
	public static void main(String[] args)
	{
		//luodaan uusi asiakas
		asiakasc Asiakas = new asiakasc(0,"nimi","sahkis","numero");
		//kutsutaan kirjoita metodi ja käytetään asiakkaat.txt-tiedostoa
		Asiakas.kirjoita("asiakkaatbin.bin");
		Asiakas.readFromFile("asiakkaatbin.bin");
	}
}

