/*Laadi ohjelma, joka toimii erittäin pelkistettynä laskimena. 
Ohjelma kysyy käyttäjältä kaksi lukua (operandia) ja luvun, 
joka kertoo kyseessä olevan operaattorin (+, -, *, tai /). Tämän 
jälkeen ohjelma suorittaa pyydetyn laskutoimituksen ja tulostaa 
vastauksen. Käytä ohjelmassasi switch-lausetta.*/

 import java.util.*;
 public class laskin {
 
	public static void main(String[] args) {
	//käyttäjältä kysyttävät luvut
	double luku1 = 0;
	double luku2 = 0;
	//käyttäjältä kysyttävä operaatio
	int operaatio;
	//lukija
	Scanner lukija;
	lukija = new Scanner(System.in);
	
	System.out.println("tervetuloa vajaaseen laskimeen!");
	System.out.println("anna ensimmäinen luku: ");
	luku1 = lukija.nextDouble();
	System.out.println("anna toinen luku: ");
	luku2 = lukija.nextDouble();
	System.out.println("valitse operaatio: 1 = yhteen-, 2 = vähennys-, 3 = kerto-, 4 = jakolasku");
	operaatio = lukija.nextInt();
	//operaatiot
	switch(operaatio) {
		case 1: System.out.println("yhteenlaskun tulos on: " + (luku1 + luku2));
			break;
		case 2: System.out.println("vähennyslaskun tulos on: " + (luku1 - luku2));
			break;
		case 3: System.out.println("kertolaskun tulos on: " + (luku1 * luku2));
			break;
		case 4: System.out.println("jakolaskun tulos on: " + (luku1 / luku2));
			break;
		default: System.out.println("et antanut oikeata operaattoria");
			break;
	 }
	}
}