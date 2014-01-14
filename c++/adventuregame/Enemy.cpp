//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#include <iostream>
#include <string>
#include <cstdlib>
#include <fstream>
#include <sstream>
#include "Enemy.h"
using namespace std;

Enemy::Enemy()
{	
	//we set name, hp and attack power to our enemy
	Enemy::SetName("Orc");
	Enemy::SetHitPoints(3);
	Enemy::SetAttackPower(1);
}
Enemy::~Enemy()
{

}
/////////////////////////////////////////////////////////////////////////
void Enemy::Attack(GameObject *target)
{
	cout << this->GetName() << " Attacks!" << endl;
	if ((rand() % 100 )< 40)
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