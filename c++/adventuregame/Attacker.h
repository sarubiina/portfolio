//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __Attacker_h__
#define __Attacker_h__
#include <string>
#include <iostream>
using namespace std;
class GameObject;

class Attacker
{
public:
	Attacker() {}
	~Attacker() {}
	virtual void Attack(GameObject * target) = 0;
}; 
#endif