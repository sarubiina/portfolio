using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
    //lapsiluokka, perii GameObject luokan
     public class Vihollinen : GameObject
    {
         //ylikirjoitetaan attack metodi (tässä vaiheessa ei välttämättä tarpeellinen)
         //olisi voinut olla public new void Attack (GameObject e)
         public override void Attack(GameObject e)
         {
             //this.Nimi (this ei pakollinen), eli siis vihollisen nimi, 
             //joka on määritetty Paavo:ksi Game luokassa
             Game.GetRenderer().Render(this.Nimi + " yrittää iskua " + e.Nimi + ":aan");
             //jos toteutuu elinvoima vähenee yhdellä
             if (new Random().Next(100) < 60)
                 /*Voisi olla (pitempi 'kaava'):
                  * Random rand = new Random();
                  * if (rand.Next (1, 100) < 60);
                  */
             {
                 Game.GetRenderer().Render(this.Nimi + " osui!");
                 e.Elinvoima--;
             }
             else
             {
                 Game.GetRenderer().Render(this.Nimi + " *swiuh* miss! ");
             }
         }
        
    }
      class Lilliputti : Vihollinen
     {
         public Lilliputti()
         {
         //määritellään lilliputille oma elämäpiste, kesti vähän aikaa tajuta että miten homma pitikään tehdä :)
          elinvoima = 1;
         }
         public override void Attack(GameObject e)
         {
             Game.GetRenderer().Render(Nimi + " puree sinua varpaasta!");
         }
     
     }

