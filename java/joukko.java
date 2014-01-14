/*Määrittele pääohjelmassa kaksi joukkoa ja talleta kumpaankin viisi kokonaislukua 
siten, että vain osa eri joukkoihin talletetuista luvuista on samoja. Toteuta 
ohjelmassa joukko-opin mukaisista joukkojen perusoperaatioista unioni, leikkaus 
ja erotus joukko-kokoelman tarjoamien metodien avulla. Tulosta tulosjoukko aina 
jokaisen operaation jälkeen. */

import java.util.*;

//toteutettava luokka
public class joukko {

	//pääohjelma
	public static void main(String[] args)
	{
		//luodaan kaksi joukkoa
		Set<Integer> joukko = new HashSet<Integer>();
		Set<Integer> joukko2 = new HashSet<Integer>();
		//lisätään alkioita
		joukko.add(2);
		joukko.add(4);
		joukko.add(6);
		joukko.add(9);
		joukko.add(16);
		//toinen joukko
		joukko2.add(1);
		joukko2.add(3);
		joukko2.add(7);
		joukko2.add(9);
		joukko2.add(11);
		//unioni
		joukko.addAll(joukko2);
		System.out.println(joukko);
		//leikkaus
		joukko.retainAll(joukko2);
		System.out.println(joukko);
		//erotus
		joukko.removeAll(joukko2);
		System.out.println(joukko);
	}
}