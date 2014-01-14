//=============
//Introduction to C++
//Name: Katariina Pohjola
//Student id: 1201141
//Assigment: Simple game 4
//=============
//g++ module4.cpp -o module4.exe
////////////////////////////////////////////////////////////////////////////////
#include <iostream>
#include <string>
#include <sstream>
////////////////////////////////////////////////////////////////////////////////
using namespace std;
////////////////////////////////////////////////////////////////////////////////
//player information
  struct Player
  {
	string name;
	int hits;
	int misses;
	bool isActive;
  };
  //game information, includes player in Player players[]
  struct Game
  {
	int player_num;
	char level;
	bool gameIsOn;
	Player *players;
  };
////////////////////////////////////////////////////////////////////////////////
  
  
int main ()
{
  //game
  cout << "\tWelcome to Toight v1.0\n\n" /*\n\n is for double empty line*/;
  cout << "How many players will participate in the game: ";
  //using Game structure with letter 'g', allocating memory
  Game *g = new Game();
  //add variable values. Now instead of g. we are using g->
  g->gameIsOn = true;
  g->player_num = -1;
  //this part is running until player gives at least one player
  while (g->player_num < 1)
  {
	 //take only numbers (I found this in Jonne's program, thanks Jonne!)
	while (!cin);
	{
		//get number of players from user
		cin >> g->player_num; 
		//this is here so that game doesn't ignore asking player name 
		cin.clear();
		//ignores cin of not number
		cin.ignore();
		if(g->player_num < 1)
			{
				cout <<"there must be at least one player! Please, try again: ";
			}
		//game supports only 8 players
		else if (g->player_num > 8)
			{	
				cout <<"Sorry, but only 8 players supported at this time. \n";
				//turn player number to 8 (don't but the damn == in here, you fool!)
				g->player_num = 8;
				cout << "starting game with 8 player." << endl ;
			}
	}
  }
  //allocating Player array
  g->players = new Player[g->player_num];
  //pointer, you point/refer to array?
  Player *p = &g->players[0];
  //creating player information to all players participating
  //why p++? Because of Player? Saving active, hits and misses?
  for (int i = 1; i<=g->player_num; i++,p++)
	{
		cout << "Please give your name, player " << i<<": ";
		//get player [number i] name
		getline (cin, p->name);
		//this so we can make sure if player is active or not
		p->isActive = true;
		p->hits = 0;
		p->misses = 0;
	}
  cout << "Please choose difficulty level (e)asy or ( h )ard: ";
  //let's get difficulty level from player
  cin >> g->level;
  //this part will be repeated as long as gameIsOn is true
while (g->gameIsOn)
{
	int i;
	for (p=&g->players[0],i=0;i<g->player_num;i++,p++)
	{
		//determing if [i] player is active, ignore empty 'spaces' if not 8 players
		if ( p->isActive == false) continue;
		//player guess and computer guess
		int guess;
		int computerguess;
	
	if (g->level == 'e')
		{
			cout << "\n" << p->name << " I'm thinking of a number. Try to guess a bigger one: ";
			cin >> guess;
			computerguess = guess-1;
			cout << "I was thinking of number " << computerguess << ". You won Toightly!\n"; p->hits++;
		}
	else
		{
			cout << "\n" << p->name << " I'm thinking of a number. Try to guess a bigger one: ";
			cin >> guess;
			computerguess = guess+1;
			cout << "I was thinking of number " << computerguess << ". You lost Toightly!\n"; p->misses++;
		}
		char again;
		cout << "\nDo you want to play again (y/n).";
		cin >> again;
		//terminating active players and if last player, end game
		if (again == 'n')
			{
				p->isActive = false;
				g->gameIsOn = false;
			}
	}
		//checking if there are active players, if there is, continue game
		for( int i=0;i<g->player_num;i++)
		{
			if (g->players[i].isActive)
			{
				g->gameIsOn = true;
				break;
			}
		}
	
}
  cout << "\nplayer statistic: " << endl;
  cout << "name " << "\thits " << "\tmisses " << endl;
  //allocating int i
  int *i= new int(0);
  for ( ;(*i)<g->player_num;(*i)++)
  {
		Player *p =&g->players[*i];
		cout << p->name << "\t" << p->hits << "\t" << p->misses << endl;
  }
  cout << "\n\nBye bye!" << endl;
  //deallocating
  delete i;
  delete [] g->players;
  delete g;
  return 0;
}