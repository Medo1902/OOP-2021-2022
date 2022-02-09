package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
	}

	
	public void draw()
	{	
		int a = 0;
		int b = 50;
		int color = 0;
		for(int i=1; i<=10;i++){
			fill(color);
			rect(a, 0, b, 500);
			a = a + 50;
			b = b + 50;
			color = color + 30;
		}
	}
}
