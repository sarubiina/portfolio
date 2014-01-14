//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __Gold_h__
#define __Gold_h__
#include <string>
//header files are essential, please do keep in mind when you star doing something!
class Gold //class definition
{
  private:
	int amount; //our private variable amount
	
  public:
	Gold() {} //constructor, remember, no ;
	~Gold() {} //destructor, also remember NO ;
	void SetAmount(int value); //setter
	int GetAmount(); //getter, in getter notice that int not void
};
#endif