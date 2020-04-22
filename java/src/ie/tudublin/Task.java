package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;

public class Task extends PApplet {

    ArrayList<Task> tasks = new ArrayList<Task>();

    public Task(TableRow tr) {
    }

    public void loadData() {
        Table t = loadTable("tasks.csv","header");
        for(TableRow tr:t.rows()){
            Task ta = new Task(tr);
            tasks.add(ta);
        }
    }    
}