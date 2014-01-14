/*Laadi ohjelma, joka kyselee käyttäjältä vuosilukuja, kunnes käyttäjä 
syöttää luvun -1. Vuosiluvun perusteella ohjelma tulostaa kyseisen 
vuoden jokaisen kuukauden päivien lukumäärän. Laadi ohjelma siten, 
että se osaa huomioida karkausvuoden.*/

 import java.util.*;
 public class vuosiluvut {
 
	public static void main(String[] args) {
	int vuosiluku = 0;
	
	int tammikuu = 31;
	int helmikuu = 28;
	int khelmikuu = 29;
	int maaliskuu = 31;
	int huhtikuu = 30;
	int toukokuu = 31;
	int kesäkuu = 30;
	int heinäkuu = 31;
	int elokuu = 31;
	int syyskuu = 30;
	int lokakuu = 31;
	int marraskuu = 30;
	int joulukuu = 31;
	//lukija
	Scanner lukija;
	lukija = new Scanner(System.in);
	
	System.out.println("tämä ohjelma kertoo sinulle vuoden jokaisen kuukauden päivien lukumäärän");
	//niin kauan kysytään kunnes -1
	do 
	{
		System.out.println("anna vuosiluku: ");
		vuosiluku = lukija.nextInt();
		System.out.println("vuodessa " + vuosiluku + " on");
		//tarkistetaan onko vuosi karkausvuosi.
		if ( (vuosiluku % 400 == 0) || (vuosiluku % 4 == 0 && vuosiluku % 100 != 0))
		{
			System.out.println("tammikuussa : " + tammikuu + " päivää");
			System.out.println("helmikuussa : " + khelmikuu + " päivää (karkausvuosi)");
		}
		else
		{
			System.out.println("tammikuussa : " + tammikuu + " päivää");
			System.out.println("helmikuussa : " + helmikuu + " päivää");
		}
		System.out.println("maaliskuussa : " + tammikuu + " päivää");
		System.out.println("huhtikuussa : " + huhtikuu + " päivää");
		System.out.println("toukokuussa : " + toukokuu + " päivää");
		System.out.println("kesäkuussa : " + kesäkuu + " päivää");
		System.out.println("heinäkuussa : " + heinäkuu + " päivää");
		System.out.println("toukokuussa : " + toukokuu + " päivää");
		System.out.println("syyskuussa : " + syyskuu + " päivää");
		System.out.println("lokakuussa : " + lokakuu + " päivää");
		System.out.println("marraskuussa : " + marraskuu + " päivää");
		System.out.println("joulukuussa : " + joulukuu + " päivää");
	} while (vuosiluku != -1);
 }
}