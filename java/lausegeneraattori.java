/*Laadi surrealistinen lausegeneraattori. Generaattorin ideana on, että se arpoo 
satunnaisesti esimerkiksi kymmenestä mahdollisesta eri sanasta aina jokaisen 
lauseenjäsenen paikalle yhden sanan. Tällä tavalla muodostuu periaatteessa toimivia 
mutta omituisia lauseita. Laadi lauseet siten, että ne muodostuvat adjektiivista, 
subjektista, predikaatista, adjektiivista ja objektista. Laadi myös pääohjelma, 
joka tuottaa lauseita generaattorin avulla.*/

import java.util.*;

public class lausegeneraattori {

public static void main(String[] args)
{
	//adjektiivi
	String[] adj = {"Yummy", "outgoing", "fierce", "automatic", "milky", "broken", "superficial", "calculating", "rare", "boorish"};
	//subjektiivi
	String[]subj = {"wolf", "batman", "snaaaaake!", "tree", "hero", "villain", "princess", "toad", "angel", "demon"};
	//predikaatti
	String[] pred = {"boost","engineer","combine","launch","transform","attack","quote","frame","train","unveil"};
	//objekti
	String[]obj = {"chocolate","panda","cat","monkey","key","rocket","axe","knife","brocolli","sword"};
	//kuinka monta sanaa listassa on
	int adjPituus = adj.length;
	int subjPituus = subj.length;
	int predPituus = pred.length;
	int objPituus = obj.length;
	//generoidaan sattumanvaraiset numerot
	int rand1 = (int) (Math.random() * adjPituus);
	int rand2 = (int) (Math.random() * subjPituus);
	int rand3 = (int) (Math.random() * predPituus);
	int rand4 = (int) (Math.random() * adjPituus);
	int rand5 = (int) (Math.random() * objPituus);
	//asetetaan sattumanvarainen numero, niin että saadaan sana listasta
	String word1 = adj[rand1];
	String word2 = subj[rand2];
	String word3 = pred[rand3];
	String word4 = adj[rand4];
	String word5 = obj[rand5];
	//lopuksi tulostetaan lause
	System.out.println(word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5);
	
}
}