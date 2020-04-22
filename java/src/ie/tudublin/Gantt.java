package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Gantt extends PApplet
{	
	
	public void settings()
	{
		size(800, 600);
		String displayTask;
		private String taskName;
		private float start;
		private float end;

	}

	public void loadTasks(TableRow tr)
    {
        this(tr.getString("Task Name"), tr.getFloat("Start"), tr.getFloat("End"));
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
		for(int i = 0; i < tasks.size(); i++){
			Task task = tasks.get(i);
			if (dist(mouseX, mouseY)

		}	

	}

	public void mouseDragged()
	{
		println("Mouse dragged");
		//alternate the width size of the rectangle
	}

	
	
	public void setup() 
	{
	}
	
	public void draw()
	{			
		background(0);
		printTasks();
		//float h = height / (float) theChart.height;
		//float colorG = 255 / (float) theChart.height;
		noStroke();
		colorMode(HSB);
		//for(int i = 0; i < theChart.height; i ++){
			//float x = i * w;
			//fill(i*colorG,255,255);
			//rect (width,h,x,theChart.height);
		//}

	}
}
