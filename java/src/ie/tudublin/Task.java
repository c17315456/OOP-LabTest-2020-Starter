package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;

public class Task extends PApplet {
    public void loadData(){
        Table t = loadTable("tasks.csv","header");
        for(TableRow tr:t.row()){
            Task ta = new Task(tr);
            tasks.add(ta);
        }
    }    
}