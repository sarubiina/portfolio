//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#include "GoldFactory.h"

Gold GoldFactory::Create(size_t amount) 
/*again, not using void because of the peculiar 
function thingie*/
{
	Gold gold; //Gold gold, instance of Gold class? 
	if ( amount == 0)
	{
		amount = rand() % 100 + 1; //generating random number between 1-100
	}
	gold.SetAmount(amount); //we put to gold the amount, set it
	return gold; //then we return it to..Gold?
}
