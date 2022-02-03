package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {

	float  playerX;
	float  playerY; 
	float  playerWidth;

	float bugX;
	float bugY;
	float bugWidth;

	int score = 0;

    public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);

		smooth();

		playerX = width / 2;
		playerY = height - 50;
		playerWidth = 50;

		resetBug();
		
	}

	private void resetBug() 
	{
		bugX = random(bugWidth / 2, width - (bugWidth / 2));
		bugY = 50;
		bugWidth = 50;
	}

	void drawBug(float x, float y, float w)
	{
		float halfw = w / 2;
		stroke(255);
		noFill();
		triangle(x - halfw, y + halfw, x, y - halfw, x + halfw, y + halfw);
	}

	void moveBug()
	{
		bugY ++;
		bugX += random(-20,20);
	}

	void drawPlayer(float x, float y, float w)
	{
		stroke(255);
		noFill();
		rectMode(CENTER);
		rect(x,y,w,20);
		line(x,y-10,x,y-20);

	}

    public void draw()
	{	stroke(255);
		background(0,0,0); //greyscale
		drawPlayer(playerX,playerY,playerWidth);
		drawBug(bugX,bugY,bugWidth);
		if (frameCount % 20 == 0)
		{
		moveBug();
		}
		text("Score: " + score, 20, 20);
	}

	void drawLaser()
	{
		fill(255,255,255);
		line(playerX, playerY, playerX, 0);
	}

	float playerSpeed = 5;

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
			if ((playerX - playerWidth) != 0)
			{
			playerX -= playerSpeed;
			draw();
			}

		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
			if (playerX != 500)
			{
			playerX += playerSpeed;
			draw();
			}
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
			float halfw = bugWidth / 2;
			if (playerX > bugX - halfw && playerX < bugX + halfw)
			{
				score ++;
				resetBug();
				line(playerX, playerY - 10, playerX, playerY);
			}
			else
			{
			drawLaser();
			}
		}
	}
    
}
