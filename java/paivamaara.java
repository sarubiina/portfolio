/*Laadi metodi (eli funktio), joka ottaa parametrinaan vuoden, kuukauden, 
päivän ja tulostusformaatin. Metodi tulostaa päivänmäärän halutussa formaatissa. 
Alla on mahdolliset formaattivaihtoehdot:

6. joulukuuta 1917 (normaali formaatti)
6.12.1917 (lyhyt formaatti esimerkiksi taulukoihin)
1917-12-06 (kansainvälinen formaatti)

Laadi myös pääohjelma, jossa kutsutaan kyseistä metodia.*/

import java.util.*;
public class paivamaara
{
	//metodi, void tyyppinen, ottaa paivan, kuukauden, vuoden ja formaatin
	public static void formaatti(int paiva, int kuukausi, int vuosi, int formaatti)
	{
		//jos formaatti on yksi, niin tulostetaan tämä
		if (formaatti == 1)
		{
			switch (kuukausi)
			{
				case 1: System.out.println(paiva +". tammikuuta " + vuosi);
					break;
				case 2: System.out.println(paiva +". helmikuuta " + vuosi);
					break;
				case 3: System.out.println(paiva +". maaliskuuta " + vuosi);
					break;
				case 4: System.out.println(paiva +". helmikuuta " + vuosi);
					break;
				case 5: System.out.println(paiva +". toukokuuta " + vuosi);
					break;
				case 6: System.out.println(paiva +". kesäkuuta " + vuosi);
					break;
				case 7: System.out.println(paiva +". heinäkuuta " + vuosi);
					break;
				case 8: System.out.println(paiva +". elokuuta " + vuosi);
					break;
				case 9: System.out.println(paiva +". syyskuuta " + vuosi);
					break;
				case 10: System.out.println(paiva +". lokakuuta " + vuosi);
					break;
				case 11: System.out.println(paiva +". marraskuuta " + vuosi);
					break;
				case 12: System.out.println(paiva +". joulukuuta " + vuosi);
					break;
			}
		}
		//jos formaatti 2 niin tämä
		if (formaatti == 2)
		{
			 System.out.println(paiva + "." + kuukausi + "." + vuosi);
		}
		//formaatti 3
		if (formaatti == 3)
		{
			System.out.println(vuosi + "-" + kuukausi + "-" + paiva);	
		}
	}
	
	public static void main(String[] args)
	{
	//lukija
	Scanner lukija;
	lukija = new Scanner(System.in);
	//muuttujat
	int paiva;
	int vuosi;
	int kuukausi;
	int formaatti;
	//kysytään päivä
	System.out.println("anna päivä: ");
	paiva = lukija.nextInt();
	//kuukausi
	System.out.println("anna kuukausi: ");
	kuukausi = lukija.nextInt();
	//vuosi
	System.out.println("anna vuosi: ");
	vuosi = lukija.nextInt();
	//ja haluttu formaatti
	System.out.println("mika formaatti (1,2,3)? : ");
	formaatti = lukija.nextInt();
	System.out.println("nyt on: "); 
	//kutsutaan metodi formaatti ja tulostetaan metodin sisältö
	formaatti(paiva, kuukausi, vuosi, formaatti);
	
	
	
	}
}