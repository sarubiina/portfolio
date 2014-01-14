using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

public class AttackCommand : Command
{
    //tehdään int enemyId
    private int enemyId = 0;
    public AttackCommand(Game g)
        : base(g)
    {
    }
    //getteri ja setteri 
    public int EnemyId
    {
        get { return enemyId; }
        set { enemyId = value; }
    }
    public override void Execute()
    {
        //gameinstance command luokassa, viittaa game luokkaan
        //enemyid riippuu mitä kirjoittaa ja muuttaa arvon nollaksi tai ykköseksi
        GameInstance.Player.Attack(GameInstance.Vihulit[enemyId]);
    }
}
    