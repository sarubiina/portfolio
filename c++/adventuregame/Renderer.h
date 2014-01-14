//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#ifndef __Renderer_h__
#define __Renderer_h__
#include <string>
#include <iostream>
using namespace std;
class Renderer
{
public:
	Renderer() {}
	~Renderer() {}
	virtual void Render( const string & str) = 0;
}; 
#endif