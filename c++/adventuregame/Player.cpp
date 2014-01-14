//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
//let's include header
#include "Player.h"
//all needed libraries for file reading
#include <fstream>
#include <sstream>
#include <iostream>
#include <cstdlib>
using namespace std;
//constructor
Player::Player()
{
	//we set life points and attack points to the player
	Player::SetHitPoints(3); //player needs to have more life or will always die
	//or would need to change enemy's change to hit lower 
	Player::SetAttackPower(1);
}
//destructor
Player::~Player()
{
}
////////////////////////////////////////////////////////////////////////////////
void GameObject::AskInfo(GameObject & p) //set playerinfo from file
{
  ifstream f("playerdata.txt");
  while ( !f.eof()  )
  {
    string line;
    f >> line;
    if ( line == "#player")
    {
      int iTmp;
      string strTmp;
      f >> strTmp; p.SetName(strTmp); 
      f >> strTmp; p.SetRace(strTmp);
      f >> strTmp; p.SetClass(strTmp);
      f >> iTmp; p.SetAge(iTmp);
      f >> strTmp; p.SetGender(strTmp);
      f >> iTmp; p.SetExperience(iTmp);
      
    }

  }
}
////////////////////////////////////////////////////////////////////////////////
void GameObject::PrintSummary() //print player data
{
  cout << "Name:" << name << "\n";
  cout << "Race: " <<  race << "\n";
  cout << "Class: " << Class << "\n";
  cout << "age: " << age << "\n";
  cout << "gender: " << gender << "\n";
  cout << "experience: " << experience << "\n";
}
////////////////////////////////////////////////////////////////////////////////
//players attack command. 
void Player::Attack(GameObject *target)
{
	cout << this->GetName() << " Attacks!" << endl;
	if ((rand() % 100 )< 60)
	{
		cout<< this->GetName() << " hits!" << endl;
		target->SetHitPoints(target->GetHitPoints()- this->attackPower);
		cout<< target->GetName() << " hp: " << target->GetHitPoints()<<endl;
	}
	else
	{
		cout << this->GetName() << " misses" << endl;
	}
}


