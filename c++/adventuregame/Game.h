//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __Game_h__
#define __Game_h__
#include "Player.h"
#include "Enemy.h"
#include "GoldFactory.h"
#include "GameObject.h"
#include "CommandFactory.h"
#include "Command.h"
#include "TextRenderer.h"
#include "Dungeon.h"
#include "Hallway.h"
#include <iostream>
class Room;
//header files are essential, please do keep in mind when you star doing something!
//but add too many and you be in trouble!
enum RoomId { kDungeon, kHallway, kNumRooms };

class Game 
{
  protected:
	bool running;
	//let's make pointer to game object here, to enemy and player (check Game.cpp)
	GameObject * player; //create getter so AttackCommand can use
	Room * current;
	Room * rooms[kNumRooms];
	
  public:
	Game();
	virtual ~Game();
	void Play(Game *g);
	//getter for the running of the game
	void SetRunning(bool setting)
	{
		this->running = setting;
	}
	bool GetRunning()
	{
		return running;
	}
	Player * GetPlayer() //here we go. Remember to use *
	{
		//let's use dynamic cast so that the game will understand us (in attackCommand)
		return dynamic_cast<Player *>(player);
		//also easier to use in Game.cpp when it's already dynamic cast in here
	}
	Room * GetCurrent()
	{
		return current;
	}
	void SetCurrent(Room *pRoom)
	{
		current = pRoom;
	}
	
};
#endif