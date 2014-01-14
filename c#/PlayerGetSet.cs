using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

//setterit ja getterit "omassa" luokassa, rotu esimerkkinä Player osassa
//ositettu luokka (GameObject-luokan kanssa)
    public partial class GameObject
    {
        public string Nimi
        {
            get { return nimi; }
            set { nimi = value; }
        }
        public string Hahmoluokka
        {
            get { return hahmoLuokka; }
            set { hahmoLuokka = value; }
        }
        public int Ika
        {
            get { return ika; }
            set { ika = value; }
        }
        public char Sukupuoli
        {
            get { return sukupuoli; }
            set { sukupuoli = value; }
        }
        public int Kokemuspisteet
        {
            get { return kokemuspisteet; }
            set { kokemuspisteet = value; }
        }
        public int Taso
        {
            get { return taso; }
            set { taso = value; }
        }
        public int Elinvoima
        {
            get { return elinvoima; }
            set { elinvoima = value; }
        }
    }


