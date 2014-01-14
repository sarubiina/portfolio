//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
//remember how to use headers and guards? No? Well here we go:
#ifndef __Player_h__ //if not defined, define
#define __Player_h__
#include <string>
#include <iostream>
#include <fstream>
#include <sstream>
#include "GameObject.h"
//header files are essential, please do keep in mind when you star doing something!
using std::string;
//inherit GameObject class
class Player : public GameObject
{	
  public:
	Player();
	virtual ~Player();
	void Attack(GameObject *target);
};
#endif //remember to end it