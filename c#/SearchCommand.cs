using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

    class SearchCommand : Command
    {
        public SearchCommand(Game g)
            : base(g)
        {
        }
        public override void Execute()
        {
            //uusi satunnaisluku
            Random rand = new Random();
            //43,6 % tod.näköisyys
            bool loytyiKultaa = rand.Next(1000) < 436;
            //jos todennäköisyys toteutuu
            if (loytyiKultaa)
            {
                //GoldFactory-olio
                GoldFactory f = new GoldFactory();
                /*Teemme "Gold" tyyppisen oliomuuttujan nimeltään "gold". 
                 * Sitten kutsumme GoldFactory-tyyppisen oliomuuttujalta "f" metodia "Create". 
                 * "Create"-metodille välitetään parametrina mitä rand-olion "Next"-metodikutsu parametreilla 1 ja 101 palauttaa.* */
                Gold gold = f.Create(rand.Next(1, 101));
                Game.GetRenderer().Render("Löysit " + gold.Amount + "kultaa!");
            }
            else
            {
                Game.GetRenderer().Render("Et löytänyt mitään.");
            }
        }
    }

