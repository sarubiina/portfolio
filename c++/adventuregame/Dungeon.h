//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __Dungeon_h__
#define __Dungeon_h__
#include "Room.h"
#include "Enemy.h"
#include "Player.h"
#include <sstream>
using namespace std;

class Dungeon : public Room
{
private:
	Enemy enemy;
public:
	Dungeon() 
	{
		SetDescription("you are locked up in a dungeon. You see an orc!");
	}
	Enemy & GetEnemy()
	{
		return enemy;
	}	
	//update aka enemy attack
	void Update();
}; 
#endif