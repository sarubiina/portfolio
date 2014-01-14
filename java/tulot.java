/*Laadi ohjelma, joka ottaa taulukkoon talteen kahdentoista kuukauden tulot 
ja laskee sekä tulostaa näytölle tuloista yhteenlasketun vuositulon, keskitulon 
kuukautta kohti, sekä suurimman kuukausikohtaisen tulon.*/

 import java.util.*;
 public class tulot {
 
	public static void main(String[] args) {
	//taulukko
	int[] tulot = new int[12];
	//muuttujat
	double vuositulo = 0;
	double 	keskitulo = 0;
	int suurin = 0;
	//lukija
	Scanner lukija;
	lukija = new Scanner(System.in);
	
	System.out.println("Ohjelma laskee vuoden kokonaistulon, keskimääräisen kuukausikohtaisen tulon");
	System.out.println("ja suurimman kuukausikohtaisen tulon antamiesi tietojen perusteella.");
	System.out.println("Syötä kuukausikohtaiset tulot.");
	//käyttäjän arvot
	for (int i = 0; i < 12; i++)
	{
		System.out.println("anna " + (i+1) + " kuukauden tulo: ");
		tulot[i] = lukija.nextInt();
		vuositulo += tulot[i];
		keskitulo = vuositulo / 12;
		if (suurin < tulot[i])
			suurin = tulot[i];
		
	}
	
	System.out.println("\nTulot: \n");
	for (int i = 0; i < 12; i++)
	{
		System.out.print ((i+1) + " kuukausi: " + tulot[i] + " \n");
	}
	System.out.println("kokonaistulot ovat: " + vuositulo);
	System.out.println("Keskiarvoinen kuukausikohtainen tulo on: " + keskitulo);
	System.out.println("Suurin kuukausikohtainen tulo on: " + suurin);
 }
}