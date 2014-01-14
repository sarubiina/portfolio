//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __Command_h__
#define __Command_h__
#include "TextRenderer.h"
#include <sstream>
#include <iostream>
#include <cstdlib>
#include <fstream>
#include <sstream>
#include <string>
//forward declaration
class Game; //why class? Because it is bad idea to include too many .h files
using namespace std;
////////////////////////////////////////////////////////////////////////////////
//command class
class Command
{
protected:
  Game * pGame; //pointer to Game
public:
  Command(Game * tmp)
  {
	pGame = tmp;
  }
  Game * GetGame()
  {
	return pGame;
  }
  void SetGame ( Game * tmp)
  {
	pGame = tmp;
  }
  ~Command() {}
  virtual void Execute() = 0; //virtual function which is implemented in other classes
  TextRenderer rnd; //textrenderer which is used to print text
};
////////////////////////////////////////////////////////////////////////////////
class AttackCommand : public Command 
{
private:
 Game * pGame;
public:
 AttackCommand(Game *tmp) : Command(tmp)
 {
	pGame = tmp;
 }
 ~AttackCommand();
 void Execute();
};
////////////////////////////////////////////////////////////////////////////////
class SearchCommand : public Command 
{
private:
 Game * pGame;
public:
 SearchCommand(Game *tmp) : Command(tmp)
 {
	pGame = tmp;
 }
 ~SearchCommand();
 void Execute();
};
////////////////////////////////////////////////////////////////////////////////
class QuitCommand : public Command 
{
private:
 Game * pGame;
public:
 QuitCommand(Game *tmp) : Command(tmp) 
 {
	pGame = tmp;
 }
 ~QuitCommand() {}
 void Execute();
};
////////////////////////////////////////////////////////////////////////////////
#endif
