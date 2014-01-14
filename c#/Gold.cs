using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


    class Gold
    {
        private int amount;

        public int Amount
        {
            get { return amount; }
            //määritetään arvot välille 1-100
            set 
            {
                if (value > 100)
                    amount = 100;
                else if (value < 1)
                    amount = 1;
                else
                    amount = value;
            }
        }
    }

