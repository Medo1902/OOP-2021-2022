package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		
	}
	
	public void draw()
	{	stroke(255);
		background(255,0,0); //greyscale
		
		fill(255,255,0);
		circle (255,255,450); //cx,cy, r

		fill(0,0,255);
		triangle(255,20,20,450,480,450);

		fill(142,142,142);
		ellipse(255,255,235,70);//cx,cy,w,h

		fill(0,0,0);
		circle(255,255,50);

	}
}
