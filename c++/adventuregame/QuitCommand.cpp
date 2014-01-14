//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#include "Command.h"
#include "Game.h"
using namespace std;
////////////////////////////////////////////////////////////////////////////////
//quit command implemention
void QuitCommand::Execute()
{
	GetGame()->SetRunning(false);
}
////////////////////////////////////////////////////////////////////////////////

