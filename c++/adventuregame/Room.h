//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __Room_h__
#define __Room_h__
#include <string>
#include <iostream>
#include "Updateable.h"
#include "globals.h"

using namespace std;
//forward declared classes
class Game;
class MoveCommand;

class Room : public Updateable
{
private:
	Room * rooms[kNumDirs];
	string description;
	Game * game;
public:
	Room();
	virtual ~Room();
	//game
	Game * GetGame();
	void SetGame(Game * tmp);
	//description
	void SetDescription(const string & desc);
	const string & GetDescription() const;
	void SetNextRoom(Direction d, Room * pRoom);
	Room * GetNextRoom(Direction d);
	
	virtual Room * OnMoveCommand(MoveCommand * pCommand);
}; 
#endif