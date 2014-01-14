using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


    class QuitCommand : Command
    {
        public QuitCommand(Game g)
            : base(g)
        {
        }

        public override void Execute()
        {
            this.game.Running = false;
        }
    }

