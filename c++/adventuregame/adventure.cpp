//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
//g++ *.cpp -o adventure.exe
#include "Game.h"
#include "CommandFactory.h"
int main ()
{
	Game g;
	g.Play(&g);
	return 0;
}