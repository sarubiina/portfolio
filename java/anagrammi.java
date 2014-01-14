/*Laadi funktio, joka tarkastaa ovatko kaksi sen parametrinaan saamaa 
merkkijonoa anagrammeja keskenään. Laadi myös pääohjelma, joka käyttää 
kyseistä funktiota.*/

import java.util.*;
//toteutettava luokka
public class anagrammi 
{
	public static boolean OnkoAnagrammi(String a, String b)
	{
		//onko sanojen pituus sama, jos ei, niin false
		if (a.length() != b.length()) 
		{
			return false;
		}
		//luodaan HashMap, jotta voidaan käydä sanat läpi ja verrata niitä keskenään
		HashMap counter = new HashMap();
		//Käydään ensimmäinen sana läpi kirjain kirjaimelta. Laskee kuinka monta samaa kirjainta sanassa on
    	for ( int i = 0 ; i < a.length() ; i++ ) //käydään läpi ensimmäisen sanan pituuden verran
		{
      		Character ch = new Character(a.charAt(i));//kirjain i:dennen kohdalla
      		Integer count = (Integer) counter.get( ch );
      		if ( count == null )
        		counter.put( ch, new Integer(1)); //jos kirjainta ei vielä ole, annetaan arvo 1 (muuten arvo nolla)
      		else{        
        		counter.put( ch, new Integer( count.intValue() + 1 )); //jos kirjain jo löytynyt, kasvatetaan integer arvoa yhdellä
      		}
    	}
    	// käydään toinen sana läpi ja verrataan ensimmäiseen.
		//integeriä vähennetään, jos arvosta tulee negatiivinen, sanat eivät ole anagrammeja
    	for ( int i = 0 ; i < b.length() ; i++ )
		{
      		Character ch = new Character(b.charAt(i));
      		Integer count = (Integer) counter.get( ch );
      		if ( count == null  || count.intValue() == 0 )
        		return false;
      		else{        
        		counter.put( ch, new Integer( count.intValue() - 1 ));
      		}
    	}
    	// jos läpäisee tarkastukset palautetaan tosi
    	return true;   
	}

	
	//pääohjelma
	public static void main(String[] args) 
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//muuttujat
		String eka = "";
		String toka = "";
		
		System.out.println("Ohjelma tarkistaa ovatko antamasi sanat anagrammeja keskenään");
		//ensimmäinen merkkijono
		System.out.println("\nAnna ensimmäinen sana: ");
		eka = lukija.nextLine();
		//toinen
		System.out.println("Anna toinen sana: ");
		toka = lukija.nextLine();
		//onko anagrammi?
		boolean value = OnkoAnagrammi(eka, toka);
		//jos funktio OnkoAnagrammi palauttaa tosi
		if (value == true)
		System.out.println("sanat ovat anagrammeja keskenään");
		//muuten tämä
		else
		System.out.println("sanat eivät ole anagrammeja keskenään");
	}
}