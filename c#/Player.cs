using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

    //perii GameObject luokan
    public class Player : GameObject
    {
        //muodostin
        public Player()
        {
        }

        //hajotin
        ~Player()
        {
        }

        //käytetään StreamReaderia, Huomaa ettet laita tähän tiedoston-nimeä vaan fileName!!
        public void Load (string fileName )
        {
            try
            {
                using (StreamReader sr = new StreamReader(fileName))
                {
                    nimi = sr.ReadLine();
                    rotu = sr.ReadLine();
                    hahmoLuokka = sr.ReadLine();
                    ika = Convert.ToInt32(sr.ReadLine());
                    sukupuoli = Convert.ToChar(sr.ReadLine());
                    kokemuspisteet = Convert.ToInt32(sr.ReadLine());
                    taso = Convert.ToInt32(sr.ReadLine());
                }
            }
            //jos tiedostoa ei löydy, heittää ilmoituksen, eikä pelaajan tietoja voida tulosteta
            //peli ei kuitenkaan kaadu
            catch (FileNotFoundException ex)
            {
                Game.GetRenderer().Render("tiedostoa ei löytynyt! " + ex);
            }
            catch (Exception e)
            {
                Game.GetRenderer().Render("tiedostoa ei voitu lukea " + e.Message);
            }
         }
    
        //tietojen tulostus, metodi
        public void PrintSummary()
        {
            Game.GetRenderer().Render("Nimi: " + nimi);
            Game.GetRenderer().Render("Rotu: " + rotu);
            Game.GetRenderer().Render("Hahmoluokka: " + hahmoLuokka);
            Game.GetRenderer().Render("Ikä: " + ika);
            Game.GetRenderer().Render("Sukupuoli: " + sukupuoli);
            Game.GetRenderer().Render("kokemus: " + kokemuspisteet);
            Game.GetRenderer().Render("taso: " + taso);
        }
        //attack, muista luokka ja "nimike" (tässä e)
        public override void Attack(GameObject e)
        {
            //this.Nimi: pelaajan nimi. e.Nimi on paavo (vihollisen nimi)
            Game.GetRenderer().Render(this.Nimi + " yrittää osua " + e.Nimi + ":oon");
            //jos toteutuu niin sitten elinvoima vähenee
            if (new Random().Next(100) < 40)
            {
                Game.GetRenderer().Render(this.Nimi + " osuit!");
                e.Elinvoima--;
                
            }
            else
            {
                Game.GetRenderer().Render(this.Nimi + " nyt meni huti!");
            }
            }
       
 
      }
   
