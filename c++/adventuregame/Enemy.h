//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __Enemy_h__ 
#define __Enemy_h__
#include <iostream>
#include <string>
#include "GameObject.h"
using namespace std;
//inherit GameObject class
class Enemy : public GameObject
{
public:
	Enemy();
	virtual ~Enemy();
	void Attack(GameObject *target);
};
#endif