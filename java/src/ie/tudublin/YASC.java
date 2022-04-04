<<<<<<< HEAD
package ie.tudublin;

import processing.core.PApplet;

public class YASC extends PApplet{

    float x, y;
    float w;
    float halfW;
    void drawPlayer(float x, float y, float w)
    {
        stroke(255);
        line(x - halfW, y + halfW, x, y - halfW);
        line(x, y - halfW, x + halfW, y + halfW);
        line(x + halfW, y + halfW, x, y);
        line(x, y, x - halfW, y + halfW);
    }

    public void setup()
    {
        x = width / 2;
        y = height / 2;
        w = 100;
        halfW = w / 2.0f;
    }

    public void settings()
    {
        size(500,500);
    }

    public void draw()
    {
        background (0);

        drawPlayer(x, y, w);
    }    
}
=======
package ie.tudublin;

import processing.core.PApplet;

public class YASC extends PApplet
{

   Player p;


    public void setup()
    {
        p = new Player(100, 100, 50, this);
    }

    public void settings()
    {
        size(500,500);
    }

    public void draw()
    {
        background(0);

        p.render();	
    }    
}
>>>>>>> 5331da2b4fcaf65684dbf742f946d9b39e6e6171
