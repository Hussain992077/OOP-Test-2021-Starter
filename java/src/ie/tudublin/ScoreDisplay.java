package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class ScoreDisplay extends PApplet
{
	
	ArrayList<Note> notes = new ArrayList<Note>();


	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void loadScore()
	{
		Table t = loadTable("note.csv","header");
		for(TableRow r:t.rows())
		{
			Note note = new Note(r);
			notes.add(note);
		}
		
	}
	

	public void printScores()
	{
		for(Note t:notes)
		{
			println(t);
		}		
	}
	
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		loadScore();
		printScores();
	}

	public void draw()
	{
		background(255);
		
	}


	//void drawNotes()
	//{
	//}
}
