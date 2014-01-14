//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __MoveCommand_h__
#define __MoveCommand_h__
#include <iostream>
#include "Command.h"
#include "Game.h"
#include "Room.h"
#include "globals.h"
#include "TextRenderer.h"

class MoveCommand : public Command
{
  private:
  Direction direction;
	
  public:
  MoveCommand(Game * tmp) : Command(tmp)
  {
  }
  virtual ~MoveCommand() {}
  
  void SetDirection(Direction d) {direction = d;}
  Direction GetDirection()
  {
	return direction;
  }
  void Execute()
  {
	Room * pRoom = GetGame()->GetCurrent();
	pRoom->OnMoveCommand(this);
	if ( pRoom ) 
	{
		Room * newRoom  = pRoom->OnMoveCommand(this);
		if ( newRoom )
			GetGame()->SetCurrent(newRoom);
		else
			cout << "Cannot go that way\n" <<endl;
	}
  }
};
#endif