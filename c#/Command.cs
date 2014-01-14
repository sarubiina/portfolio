using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

    public abstract class Command : ICommand
    {
        //command luokalla on oltava yksi suojattu jsenmuuttuja, viittaus Game luoka olioon
        protected Game game;

        //luomme muodostimen, jonka on otettava vastaan yksi paratmetri
        //jälleen viittaus game luokan olioon
        public Command(Game g)
        {
            //ja tallennamme jäsenmuuttujan olevaan game luokan viittaukseen
            game = g;
        }
        public Game GameInstance
        {
            get { return game; }
            set { game = value; }
        }

        public abstract void Execute();
    }

