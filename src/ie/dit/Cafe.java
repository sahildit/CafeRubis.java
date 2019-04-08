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
    
    public void settings()
    {
        size(800,600);
    }

    public void setup()
    {
        loadData();
        printProducts();
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
    public void printProducts()
    {
        for(int i = 0; i < products.size(); i++)
        {
            System.out.println(products.get(i));
        }
    }

    public void DisplayProducts()
    {
        
    }

    public void draw()
    {
        
    }
    
}