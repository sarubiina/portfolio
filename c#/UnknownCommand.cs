using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


    class UnknownCommand : Command
    {
        public UnknownCommand(Game g)
            : base(g)
        {
        }

        public override void Execute()
        {
            Game.GetRenderer().Render("Anteeksi, nyt en ihan ymmärtänyt, mitä tarkoitit?");
        }
    }

