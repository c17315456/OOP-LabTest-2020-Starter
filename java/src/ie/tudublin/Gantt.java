package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Gantt extends PApplet
{	
	
	public void settings()
	{
		size(800, 600);
		loadTasks();
		loadData();
		printTasks();
		String displayTask;

	}

	public void loadTasks()
	{
		loadData()
	}

	public void printTasks()
	{
		for(Task ta:tasks){
			println(ta)
		}
	}
	
	public void mousePressed()
	{
		println("Mouse pressed");	

	}

	public void mouseDragged()
	{
		println("Mouse dragged");
	}

	
	
	public void setup() 
	{
	}
	
	public void draw()
	{			
		background(0);
		printTasks();
	}
}
