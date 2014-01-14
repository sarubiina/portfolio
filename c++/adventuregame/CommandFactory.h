//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __CommandFactory_h__
#define __CommandFactory_h__
#include <string>
#include "Command.h"
#include "UnknownCommand.h"
#include "Game.h"
using namespace std;
class Game;
class Command;
////////////////////////////////////////////////////////////////////////////////
class CommandFactory 
{
protected:
  Game * pGame;
public:
  CommandFactory(){}
  CommandFactory( Game *tmp ) 
  {
	pGame = tmp;
  }
  virtual ~CommandFactory() {}
  
  Command * Create( const string & str );
  
};
////////////////////////////////////////////////////////////////////////////////

#endif
