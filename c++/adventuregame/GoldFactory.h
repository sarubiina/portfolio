//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __GoldFactory_h__
#define __GoldFactory_h__
#include <string>
#include <cstdlib> 
#include "Gold.h"
//header files are essential, please do keep in mind when you star doing something!
class GoldFactory //class definition
{
  public:
	GoldFactory() {} //you know this already right?
	~GoldFactory() {} //RIGHT??!
	Gold Create(size_t amount = 0); 
	/*now here is an interesting one. Notice that it's
	Gold Create? This example is from Henri, cuz I had no idea how to do this.
	So we call/use/or whatever Gold, is it class or constructor? Either way it works 
	instead of void.*/
};
#endif