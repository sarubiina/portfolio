/*Laadi ohjelma, joka laskee ympyrän pinta-alan tai pallon tilavuuden. 
Ohjelman tulee kysyä ensin käyttäjältä, onko kyse pallosta vai ympyrästä. 
Tämän jälkeen ohjelman tulee kysyä käyttäjältä ympyrän tai pallon säde ja 
laskea sen perusteella pinta-ala tai tilavuus. Lopuksi Ohjelman tulee tulostaa 
pinta-ala tai tilavuus näytölle.*/

 import java.util.*;
 public class pallovaiympyra {
 
	public static void main(String[] args) {
	double ala = 0.0;
	double tilavuus = 0.0;
	//lukijan numero
	int kumpi;
	//käyttäjältä kysyttävä arvo
	double sade;
	//kirjaston valmis piin arvo
	double pii = Math.PI;
	
	//lukija
	Scanner lukija;
	lukija = new Scanner(System.in);
	
	System.out.println("lasken ympyrän pinta-alan tai pallon tilavuuden");
	System.out.println("onko kyse 1= ympyrä vai 2= pallo?");
	kumpi = lukija.nextInt();
	if (kumpi == 1)
	{
		System.out.println("valitsit ympyrän. Kerro minulle ympyrän säde: ");
		sade = lukija.nextDouble();
		//lasketaan ala
		ala = pii * (sade * sade);
		System.out.println("ympyrän pinta-ala on: " + ala);
	}
	if (kumpi == 2)
	{
		System.out.println("valitsit pallon. Kerro minulle pallon säde: ");
		sade = lukija.nextDouble();
		//lasketaan tilavuus
		tilavuus = (4 * pii * (sade * sade * sade))/ 3;
		System.out.println("pallon tilavuus on: " + tilavuus);
	}
	}
}