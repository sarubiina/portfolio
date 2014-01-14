/*Laadi ohjelma, joka tallettaa viikonpäivät kolmella eri kielellä 
taulukkoon/taulukkoihin. Kielet voit valita vaapasti. Ohjelman tulee 
tietojen tallettamisen jälkeen kysyä, monennenko viikonpäivän nimen 
käyttäjä haluaa tietää ja millä kolmesta kielestä, sekä tulostaa 
vastaus näytölle.*/

import java.util.*;

public class kielet {
	public static void main(String[] args) {
	//muuttujat
	int kieli;
	int paiva;
	String[] suomi = {"maanantai", "tiistai", "keskiviikko", "torstain", "perjantai", "lauantai", "sunnuntai"};
	String[] englanti = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
	String[] espanja = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
	//lukija
	Scanner lukija;
	lukija = new Scanner(System.in);
	
	System.out.println("Ohjelma pyytää sinua valitsemaan päivän ja kielen,");
	System.out.println("ja tulostaa kyseisen päivän kyseisellä kielellä.");
	System.out.println("Millä kielellä haluat tulostuksen (1=Suomi, 2=Englanti, 3=Espanja)?");
	kieli = lukija.nextInt();
	if (kieli == 1)
	{
		System.out.println("Minkä päivän nimen haluat tietää (1=maanantai, ..., 7=sunnuntai)?");
		paiva = lukija.nextInt();
		
		switch(paiva) {
			case 1: System.out.println("1.viikonpaiva on suomeksi " + suomi[0]);
					break;
			case 2: System.out.println("2.viikonpaiva on suomeksi " + suomi[1]);
					break;
			case 3: System.out.println("3.viikonpaiva on suomeksi " + suomi[2]);
					break;
			case 4: System.out.println("4.viikonpaiva on suomeksi " + suomi[3]);
					break;
			case 5: System.out.println("5.viikonpaiva on suomeksi " + suomi[4]);
					break;
			case 6: System.out.println("6.viikonpaiva on suomeksi " + suomi[5]);
					break;
			case 7: System.out.println("7.viikonpaiva on suomeksi " + suomi[6]);
					break;
			//jos luku ei väliltä 1-7
			default: System.out.println("et antanut todellista paivaa");
					break;
		}
	}
	if (kieli == 2)
	{
		System.out.println("Minkä päivän nimen haluat tietää (1=maanantai, ..., 7=sunnuntai)?");
		paiva = lukija.nextInt();
		
		switch(paiva) {
			case 1: System.out.println("1.viikonpaiva on englanniksi " + englanti[0]);
					break;
			case 2: System.out.println("2.viikonpaiva on englanniksi " + englanti[1]);
					break;
			case 3: System.out.println("3.viikonpaiva on englanniksi " + englanti[2]);
					break;
			case 4: System.out.println("4.viikonpaiva on englanniksi " + englanti[3]);
					break;
			case 5: System.out.println("5.viikonpaiva on englanniksi " + englanti[4]);
					break;
			case 6: System.out.println("6.viikonpaiva on englanniksi " + englanti[5]);
					break;
			case 7: System.out.println("7.viikonpaiva on englanniksi " + englanti[6]);
					break;
			//jos luku ei väliltä 1-7
			default: System.out.println("et antanut todellista paivaa");
					break;
		}
	}
	if (kieli == 3)
	{
		System.out.println("Minkä päivän nimen haluat tietää (1=maanantai, ..., 7=sunnuntai)?");
		paiva = lukija.nextInt();
		
		switch(paiva) {
			case 1: System.out.println("1.viikonpaiva on espanjaksi " + espanja[0]);
					break;
			case 2: System.out.println("2.viikonpaiva on espanjaksi " + espanja[1]);
					break;
			case 3: System.out.println("3.viikonpaiva on espanjaksi " + espanja[2]);
					break;
			case 4: System.out.println("4.viikonpaiva on espanjaksi " + espanja[3]);
					break;
			case 5: System.out.println("5.viikonpaiva on espanjaksi " + espanja[4]);
					break;
			case 6: System.out.println("6.viikonpaiva on espanjaksi " + espanja[5]);
					break;
			case 7: System.out.println("7.viikonpaiva on espanjaksi " + espanja[6]);
					break;
			//jos luku ei väliltä 1-7
			default: System.out.println("et antanut todellista paivaa");
					break;
		}
	}
 }
}