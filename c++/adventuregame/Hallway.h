//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __Hallway_h__
#define __Hallway_h__
#include <string>
#include <sstream>
#include "Room.h"
using namespace std;
class Hallway : public Room
{
public:
	Hallway() 
	{
		SetDescription("You are standing in a pretty damp hallway.");
	}
	void Update()
	{
	}
}; 
#endif