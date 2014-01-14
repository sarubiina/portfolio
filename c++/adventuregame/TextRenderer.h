//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//=================================
#ifndef __TextRenderer_h__
#define __TextRenderer_h__
#include <iostream>
#include "Renderer.h"
using namespace std;

class TextRenderer : public Renderer
{
public:
	void Render(const string & str)
	{
		cout << str;
	}
	
	TextRenderer() {} // {} = "implemention. You don't implement anything but you need to have it
	~TextRenderer() {} //otherwise will not compile
};
#endif