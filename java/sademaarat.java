/*Laadi ohjelma, joka kysyy käyttäjältä seitsemän viikonpäivän sademäärät, jotka se tulostaa näytölle. 
Käytä ohjelmassasi vakiota ja taulukkoa. Mikäli pystyt toteuttamaan tietojen kysymisen käyttäjältä ja 
tietojen tulostamisen näytölle tehokkaammin käyttämällä myöhemmin opetettavaa toistolausetta, voit saada 
yhteensä kaksi bonuspistettä. .*/
import java.util.*;
 //luokka
 public class sademaarat
 {
	
	static final int indeksi = 7;
	
	public static void main(String[] args) {
	//taulukko
	double[] sademaara = new double [indeksi];
	//lukija
	Scanner lukija;
	lukija = new Scanner(System.in);
	
	System.out.println("anna seitseman paivan sademara: \n");
	//käyttäjän arvot
	for (int i = 0; i < indeksi; i++)
	{
		System.out.println("anna " + (i+1) + " paivan sademaara: ");
		sademaara[i] = lukija.nextDouble();
	}
	
	System.out.println("\nSademaarat: \n");
	for (int i = 0; i < indeksi; i++)
	{
		System.out.print ((i+1) + " paiva: " + sademaara[i] + " \n");
	}
 }
}