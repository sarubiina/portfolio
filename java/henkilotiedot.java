/*Laadi ohjelma, joka kysyy käyttäjältä kuvitteellisen henkilön
 seuraavat tiedot: ikä, pituus metreinä, paino, ja tieto siitä, 
 omistaako kyseinen henkilö ajokortin. Valitse tarvittavien 
 muuttujien tietotyypit siten, että ne vievät mahdollisimman 
 vähän turhaa tilaa. Kun olet kysynyt tiedot käyttäjältä, tulosta 
 ne näytölle. Mikäli pystyt tekemään tulostuksestasi elegantimpaa 
 hyödyntämällä ratkaisussasi myöhemmin opetettavaa ehtolausetta, 
 saat yhden bonuspisteen. */
 
 
 import java.util.*;
 //luokka
 public class henkilotiedot {
	
	public static void main(String[] args) {
	//muuttujat ja 
	int ika = 0;
	double pituus = 0;
	double paino = 0;
	char ajokortti;
	//lukija
	Scanner lukija;
	lukija = new Scanner(System.in);
	
	//luetaan tiedot käyttäjältä
		System.out.println("hei, tarvitsemme tietosi!");
		//looppi jotta ei kaadu virheelliseen syötteeseen ja jotta saadaan oikea syöte käyttäjältä
		do {
			try
			{
				System.out.println("Anna ikasi:");
				ika = lukija.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("virheellinen syote");
				lukija = new Scanner(System.in);
				//asetetaan nollaksi, eikä ota virheellistä syötettä
				ika = 0;
			}
		}while (ika == 0); //tehdään niin kauan kun ika on nolla
		//sama looppi pituudelle
		do {
			try
			{
				System.out.println("Anna pituutesi (metreina):");
				pituus = lukija.nextDouble();
			}
			catch (InputMismatchException e)
			{
				System.out.println("virheellinen syote");
				lukija = new Scanner(System.in);
				pituus = 0;
			}
		}while (pituus == 0);
		//looppi painolle
		do {
			try
			{
				System.out.println("Anna painosi:");
				paino = lukija.nextDouble();
			}
			catch (InputMismatchException e)
			{
				System.out.println("virheellinen syote");
				lukija = new Scanner(System.in);
				paino = 0;
			}
		}while (paino == 0);
		//varmistetaan että syöte on joko y tai n
		do {
		System.out.println("onko sinulla ajokorttia? (y/n)");
		ajokortti = lukija.next().charAt(0);
		} while (ajokortti != 'y' && ajokortti != 'n');
		
		//tulostetaan tiedot
		System.out.println("Tassa ovat syottamasi tiedot:");
		System.out.println("ika: " + ika);
		System.out.println("pituus: " + pituus);
		System.out.println("paino: " + paino);
		System.out.println("omistaa ajokortin: " + ajokortti);
	}
 }
 