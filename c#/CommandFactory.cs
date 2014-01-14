using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

//teemme commanfactory luokan joka luo command olioita annetun merkkijonon perusteella
   public class CommandFactory
    {
       //jälleen viittaus Game olioon jäsenmuuttujana
       private Game game = null;

       //muodostin
       public CommandFactory(Game g)
       {
           game = g;
       }
       //metodi, joka ottaa vastaan string parametrin ja palauttaa viittauksen ICommand olioon
       public ICommand Create(string input)
       {
           //alkuarvo nulliksi
           ICommand retval = null;
           if (input == "lopeta")
           {
               //arvoksi
               retval = new QuitCommand(game);
           }
           else if (input == "etsi")
           {
               retval = new SearchCommand(game);
           }
           else if (input.StartsWith("lyö "))
           {
               if (input.EndsWith("lilliputti"))
               {
                   AttackCommand cmd = new AttackCommand(game);
                   cmd.EnemyId = 1;
                   retval = cmd;
               }
               else if (input.EndsWith("paavo"))
               {
                   AttackCommand cmd = new AttackCommand(game);
                   cmd.EnemyId = 0;
                   retval = cmd;
               }
               else
               {
                   retval = new UnknownCommand(game);
               }
           }

           else
           {
               retval = new UnknownCommand(game);
           }
           return retval;
       }
    }

