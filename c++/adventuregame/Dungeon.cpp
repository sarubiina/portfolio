//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#include "Game.h"
#include "Dungeon.h"
void Dungeon::Update()
{
	//if enemy is alive, will attack player
		if (enemy.GetHitPoints() > 0) 
		{
			Player * player = GetGame()->GetPlayer();
			enemy.Attack(player);
		}
		else 
		{
			SetDescription("You are locked up in a dungeon. There is a pretty dead orc here.");
		}
}