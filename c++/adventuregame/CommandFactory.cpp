//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#include "CommandFactory.h"
#include "UnknownCommand.h"
#include "Game.h"
#include "Command.h"
#include "MoveCommand.h"
#include <sstream>
#include <string>
#include <iostream>
//here is what input brings what command
Command *CommandFactory::Create( const string & str )
{
  istringstream s(str);
  string word;
  s >> word;
  if (word == "attack")
  {
	return new AttackCommand(pGame);
  }
  if (word == "search")
  {
	return new SearchCommand(pGame);  
  }
  if (word == "quit")
  {
	return new QuitCommand(pGame);
  }
  if (word == "move")
  {
	string dir;
	s >> dir;
	MoveCommand * command = NULL;
	if(dir == "north")
	{
		command = new MoveCommand(pGame);
		command->SetDirection(North);
		return command;
	}
	else if (dir == "south")
	{
		command = new MoveCommand(pGame);
		command->SetDirection(South);
		return command;
	}
	else if (dir == "east")
	{
		command = new MoveCommand(pGame);
		command->SetDirection(East);
		return command;
	}
	else if (dir == "west")
	{
		command = new MoveCommand(pGame);
		command->SetDirection(West);
		return command;
	}
  }
  
	return new UnknownCommand(pGame);  
}

////////////////////////////////////////////////////////////////////////////////
