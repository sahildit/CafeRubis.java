/* Sahil Sahil D17124269*/

package ie.dit;

import java.util.ArrayList;
import processing.core.*;
import processing.data.*;
import processing.core.PApplet;

public class Cafe extends PApplet
{
    PApplet ui;
    private ArrayList <Product> products = new ArrayList<Product>();
    private ArrayList <Product> bill = new ArrayList<Product>();

    public void settings()
    {
        size(800,600);
    }

    public void setup()
    {
        loadData();
        printProducts();
        Bill(); 
    }

    public void loadData()
    {
        Table table = loadTable("cafe.csv","header");
        for(TableRow row : table.rows())
        {
            Product p = new Product(row);
            products.add(p);
        }
    }

    public void Bill()
    {
        Table table = loadTable("cafe.csv","header");
        for(TableRow row : table.rows())
        {
           
            Product b = new Product(row);
           
            bill.add(b);
        }
    }
    public void printProducts()
    {
        for(int i = 0; i < products.size(); i++)
        {
            System.out.println(products.get(i));
        }
    }

    float border = 20;
    float buttonWidth = 200;
    float buttonHeight = 50;
    float gap = 20;

    public void DisplayProducts()
    {
        for(int i = 0; i< products.size(); i ++)
        {
            
            // textAlign(LEFT,CENTER);
            // background(200);
            // fill(0);
            // String name = "Your Stop - All About coffee";

            Product p = products.get(i);
            float x = border;
            float y = border + (i * (buttonHeight + gap));
            noFill();
            stroke(0);
            // fill(100,100,200);
            // text("Your Stop - All About coffee",400,70);
            rect(x,y,buttonWidth,buttonHeight);
            line(400,100,400,500);
            textAlign(CENTER,TOP);
            fill(0);
            text(p.getName(), x + buttonWidth * 0.5f, y + buttonHeight * 0.5f);
            textAlign(CENTER,BOTTOM);
            fill(0);
            text(p.getPrice(), x + buttonWidth * 0.5f, y + buttonHeight * 0.5f);
            String price = nf(products.get(i).getPrice(),0,2);
        }
    }

    public void mouseClicked()
    {
        int start = -1;
        
        if((mouseX) > border && mouseX < border + buttonWidth)
        {
            if((mouseY - border) % (buttonHeight + gap) < buttonHeight)
            {
                start = (int)((mouseY - border) / buttonHeight + gap);

            }
        }
       if(start != -1)
       {
           System.out.println(bill.get(start));
       }

    }

    public void DisplayBill()
    {
        float total = 0.0f;
        int i;
        for(i = 0; i < bill.size(); i++)//prints orders to screen in box
        {
            float x = 19 * width/32;
            String price = nf(bill.get(i).getPrice(),0,2);
            float y = 4 * height/24 + (i * height/24);
            textAlign(LEFT, CENTER);
            text(bill.get(i).getName(),x,y);
            textAlign(RIGHT, CENTER);
            text(price,width - 3 * width/32,y);
            total += bill.get(i).getPrice();
        }
    }

    public void draw()
    {
        DisplayProducts();
        DisplayBill();
    }
    
}