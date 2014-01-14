using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

    //ositettu luokka (playerGetSet-luokan kanssa)
    public partial class GameObject
    {
        //nämä kaikki ominaisuudet ovat vihollis ja player luokan käytössä
        protected string nimi = "";
        //lyhyempi tapa tehdä aksessori ja mutaattori!!!
        public string rotu { get; set; }
        //*******************
        protected string hahmoLuokka;
        protected int ika;
        protected char sukupuoli; // m/f
        protected int kokemuspisteet;
        protected int taso;
        protected int elinvoima;

        //määritetään elinvoimalle arvo 3, metodin sisälle
        //periytyvät näin molemmille (playerille ja viholliselle ja lilliputille(!))
        public GameObject()
        {
            elinvoima = 3;
        }
        ~GameObject()
        {
        }


        //ylikirjoitusta varten virtual mutta ei tässä tapauksessa välttämättä tarpeellinen
        //riittäisi public void Attack
        public virtual void Attack(GameObject e)
        {
           Game.GetRenderer().Render("öh, miten?");
        }
    }

