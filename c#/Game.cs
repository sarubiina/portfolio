using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

//poistin kaikista nimen, joka tuntui tuovan paljon kärhämää ohjelman kanssa (en edes ajatellut että voisi haitata kääntymistä
    public class Game
    {
        private Player player = new Player();
        private GameObject[] vihulit = new GameObject[2];

        private static Renderer renderer = new TextRenderer(); // Renderöijä

        private bool running = true;

        public bool Running
        {
            get { return running; }
            set {running = value; }
        }
        
       //konstruktori
       public Game()
        {
          //nimetään vihollinen
            vihulit[0] = new Vihollinen();
            vihulit[0].Nimi = "Paavo";
            vihulit[1] = new Lilliputti();
            vihulit[1].Nimi = "Lilliputti";
        }
        //destruktor
        ~Game()
        {
        }

        public static Renderer GetRenderer()
        {
            return renderer;
        }

        //en tajunnutkaan että playerin voi laittaa setterillä ja getterillä
        public Player Player
        {
            set { player = value; }
            get { return player; }
        }
        public GameObject[] Vihulit
        {
            set { vihulit = value; }
            get { return vihulit; }
        }

       public void Play()
        {
            renderer.Render("\n\nTervetuloa Sankareita ja Sammakoita-seikkailupeliin! \n");
             renderer.Render("\n\nOle hyvä ja syötä tietosi: \n");
            
           //StreamReader, tänne tiedoston nimi! 
                player.Load("playerdata.txt");
                renderer.Render("\n\nPelaajan yhteenveto: \n");
            
           //kutsutaan olion normaalia metodia
                player.PrintSummary();
                renderer.Render("\n\nJa katso, seikkailu alkaa!\n");
                renderer.Render("Vihollinen " + vihulit[0].Nimi + " ilmestyi!");
                renderer.Render("Lilliputti ilmestyi!\n");

            while (running)
            {
                string command = Console.ReadLine();

                //tehdään CommandFactorysta 
                CommandFactory cmdFactory = new CommandFactory(this);
                ICommand cmd = cmdFactory.Create(command);
                //metodi
                cmd.Execute();

                 //kutsutaan talukko niin ei tarvitse kirjoittaa kaikkia erikseen
                for (int i = 0; i < vihulit.Length; i++)
                {
                    //jos ei ole tätä, vihollinen voi iskeä vaikka olisi kuollut
                    if (vihulit[i].Elinvoima > 0)
                        vihulit[i].Attack(player);
                }

                //pelaaja kuolee
                if (player.Elinvoima <= 0)
                {
                    renderer.Render("se on loppu nyt, niin mikä? no tämä peli!");
                    running = false;
                }
                //vihollinen kuolee
                else if (vihulit[0].Elinvoima <= 0 && vihulit[1].Elinvoima <= 0)
                {
                    renderer.Render("kunniankellot soivat sinulle, vihollisesi on kuollut!");
                    running = false;
                }
             }

            renderer.Render("poistun, heippa!");
            Console.ReadLine();
        }
    }

