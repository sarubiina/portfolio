using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


  public interface Renderer
    {
      void Render(string viesti);
    }


 class TextRenderer : Renderer
{
     public void Render(string viesti)
    {
        Console.WriteLine( viesti );
    }
}