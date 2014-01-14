//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __UnknownCommand_h__
#define __UnknownCommand_h__
////////////////////////////////////////////////////////////////////////////////
#include "Command.h"
////////////////////////////////////////////////////////////////////////////////
using namespace std;
class UnknownCommand : public Command
{
public:
  UnknownCommand( Game *tmp ) : Command(tmp) { }
  ~UnknownCommand() {}
  ////////////////////
// Executes command.
  void Execute()
  {
    rnd.Render("Sorry, I did not quite get that?\n");
  }
};
////////////////////////////////////////////////////////////////////////////////
#endif
