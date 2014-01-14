//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#include "GameObject.h"
#include <iostream>
#include <fstream>
#include <sstream>
#include <cstdlib>
#include <string>
using namespace std;

GameObject::GameObject()
{
}
GameObject::~GameObject()
{
}
//setters and getters
////////////////////////////////////////////////////////////////////////////////
void GameObject::SetName(string Name) 
{
  name = Name;
}
string GameObject::GetName() 
{
  return name;
}
////////////////////////////////////////////////////////////////////////////////
void GameObject::SetRace(string Race)
{
  race = Race;
}
string GameObject::GetRace() 
{
  return race;
}
////////////////////////////////////////////////////////////////////////////////
void GameObject::SetClass(string aClass)
{
   Class = aClass;
}
string GameObject::GetClass() 
{
  return Class;
}
////////////////////////////////////////////////////////////////////////////////
void GameObject::SetAge(int Age )
{
  age = Age;
}
int GameObject::GetAge() 
{
  return age;
}
////////////////////////////////////////////////////////////////////////////////
void GameObject::SetGender( string Gender)
{
  gender = Gender;
}
string GameObject::GetGender() 
{
  return gender;
}
////////////////////////////////////////////////////////////////////////////////
void GameObject::SetExperience( int Experience )
{
  experience = Experience;
}
int GameObject::GetExperience() 
{
  return experience;
}
////////////////////////////////////////////////////////////////////////////////
void GameObject::SetHitPoints (int hp)
{
	hitPoints = hp;
}
int GameObject::GetHitPoints()
{
	return hitPoints;
}
////////////////////////////////////////////////////////////////////////////////
void GameObject::SetAttackPower (int atk)
{
	attackPower = atk;
}
int GameObject::GetAttackPower()
{
	return attackPower;
}
////////////////////////////////////////////////////////////////////////////////
void AskInfo(GameObject & p)
{
}
//attack command
void GameObject::Attack(GameObject *target)
{
}
void GameObject::Update()
{	
}
	