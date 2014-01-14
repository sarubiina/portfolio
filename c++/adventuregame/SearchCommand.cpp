//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#include "Command.h"
#include "Game.h"
#include "GoldFactory.h"
#include "TextRenderer.h"
#include <cstdlib>
#include <sstream>
#include <iostream>
////////////////////////////////////////////////////////////////////////////////

  void SearchCommand::Execute()
  {
    //43,6% possibility to find gold
			if ( (rand() % 1000 )< 436)
			{
				Gold gold;
				GoldFactory * factory = new GoldFactory(); //remember to use pointer
				gold  = factory->Create(0);
				stringstream ss;
				ss << gold.GetAmount();
				rnd.Render("you found " + ss.str() + " gold!\n");
				//release memory so no memory leaks
				delete factory;
			}
			else
			{
				rnd.Render("sorry, nothing found.\n");
			}
  }
////////////////////////////////////////////////////////////////////////////////
