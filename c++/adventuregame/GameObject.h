//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
//remember how to use headers and guards? No? Well here we go:
#ifndef __GameObject_h__ //if not defined, define
#define __GameObject_h__
#include <string>
#include <iostream>
#include "Updateable.h"
#include "Attacker.h"
using namespace std;

class GameObject : public Updateable, public Attacker
{
//protected so that player class can use these variables
//if private, cannot use
protected:
  	string name;
	string race;
	string Class;
	int age;
	string gender;
	int experience;
	int level;
	int hitPoints;
	int attackPower;

public:
	GameObject();
	//virtual always so that we can avoid possible mistakes ;) 
	virtual ~GameObject();
	void PrintSummary();
	virtual void AskInfo(GameObject & p);
	//attack function
	virtual void Attack(GameObject *target);
	void Update();
////////////////////////////////////////////////////////////////////////////////
	//let's set and get variables
	//name setGet
	void SetName(string Name);
    string GetName();
	//race setGet
	void SetRace(string Race);
    string GetRace();
	//class setGet
	void SetClass(string aClass);
    string GetClass();
	//age setGet
	void SetAge(int Age );
    int GetAge();
	//gender setGet
	void SetGender(string Gender);
    string GetGender();
	//experience setGet
	void SetExperience(int Experience);
    int GetExperience();
	//hitpoints setGet
	void SetHitPoints(int hp);
	int GetHitPoints();
	//attack power
	void SetAttackPower(int atk);
	int GetAttackPower();
////////////////////////////////////////////////////////////////////////////////	
	
};
#endif