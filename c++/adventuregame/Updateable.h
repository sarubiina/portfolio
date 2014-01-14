//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __Updateable_h__
#define __Updateable_h__
#include <string>
#include <iostream>
using namespace std;
class Updateable
{
public:
	Updateable() {}
	virtual ~Updateable() {}
	virtual void Update() = 0;
}; 
#endif