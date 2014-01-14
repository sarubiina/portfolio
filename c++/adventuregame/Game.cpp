//=================================
//C++ OOP
//Name: Katariina Pohjola
//Student id: 1201141
//Assignment: the adventure game 6
//==================================
#include <iostream>
#include <cstdlib>
#include <fstream>
#include <sstream>
#include <string>
#include "Game.h"

using namespace std;
//class Game, Game constructor
Game::Game() : running (true) //we initialize member
{
	//create a player
	player = new Player();
	rooms[kDungeon] = new Dungeon();
	rooms[kDungeon]->SetGame(this);

	rooms[kHallway] = new Hallway();
	rooms[kHallway]->SetGame(this);
	rooms[kHallway]->SetNextRoom(South,rooms[kDungeon]);
	rooms[kDungeon]->SetNextRoom(North,rooms[kHallway]);
	current = rooms[kDungeon];
}
Game::~Game()
{
	//destructor
}

//function Game Play
void Game::Play(Game *g) 
{
	string cmd;
	//textRenderer. We use this to print text
	TextRenderer * rnd = new TextRenderer();
	
	rnd->Render("Welcome to Fiends'n'Frogs adventure game!");
	rnd->Render("by anssi.grohn@pkamk.fi(c) 2011. Licensed under GPLv3.\n\n");
	rnd->Render("\nPlayer statistics:\n");
	//printing player information
	player->AskInfo(*player);
	player->PrintSummary();
	rnd->Render("And behold, the adventure begins!\n");
	//cin.ignore(); //if we had player input, we would need ignore. 
	//but when we read from the file, it just confuses the program
	
	
    // Main loop begins here
    this->SetRunning(true); //while true
	while(running)
    {
		cout <<GetCurrent()->GetDescription();
		rnd->Render("\n> ");
		
		//get command from user
		getline(cin,cmd);
		//commandFactory 
		CommandFactory cmf (this);
		//execute command
		Command * pCommand = cmf.Create(cmd);
		if (pCommand) pCommand->Execute();
		delete pCommand;
		
		GetCurrent()->Update();
		
		//if player loses all points
		if (player->GetHitPoints() <= 0)
		{
			rnd->Render("Orc wiped the floor with you. Game over dude!\n");
			this->SetRunning(false);
		}
	} 
    // final message to player
    rnd->Render("Exiting, bye!\n");
}

