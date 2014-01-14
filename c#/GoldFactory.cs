using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


    class GoldFactory
    {
       //metodi Create, amount on aluksi 0
        public Gold Create(int amount = 0)
        {
            //Gold-olio
            Gold gold = new Gold();
            if (amount == 0)
            {
                //1-100 välillä oleva satunnaisluku tulee arvoksi
                amount = (new Random()).Next(1, 101);
            }
            //olio Gold nimeltä gold Amount on amount
            gold.Amount = amount;
            //palautetaan kulta
            return gold;
        }

      
    }

