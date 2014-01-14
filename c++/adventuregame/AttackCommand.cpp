//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#include "Command.h"
#include "Dungeon.h"
#include "Game.h"
#include <sstream>
using namespace std;
////////////////////////////////////////////////////////////////////////////////
void AttackCommand::Execute()
{
	Dungeon *pDungeon = dynamic_cast<Dungeon *>(GetGame()->GetCurrent());
	 Enemy & enemy = pDungeon->GetEnemy();
	 
    // If we have a dungeon as current room 
    if ( pDungeon != NULL )
    {
		if (enemy.GetHitPoints() >0)
		{
			dynamic_cast<Player*>(GetGame()->GetPlayer())->Attack(&enemy);
		}
		else 
        {
			cout << "Whoa! You already got your pound of flesh out of that one. Literally.\n" << endl;
		}
	}
	else
	{
		cout << "Attack what? There's nothing there!\n" << endl;
	}
}
////////////////////////////////////////////////////////////////////////////////
