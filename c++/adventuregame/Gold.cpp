//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#include <string>
#include <iostream>
#include "Gold.h"
using std::string;
//we want gold amount to stay between 0-100, not more, not less
void Gold::SetAmount(int value) //our private variable in function
{
	if ( value < 0 )		amount = 0; //if number smaller than 0 it becomes 0
	else if ( value > 100 )	amount = 100; //if number larger than 100, becomes 100
	else			        amount = value; //otherwise amount is random number between 1-100
}
int Gold::GetAmount()
{
	return amount; //return the amount
}
		
