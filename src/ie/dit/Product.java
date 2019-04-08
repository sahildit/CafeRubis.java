package ie.dit;

import processing.core.PApplet;
import processing.data.TableRow;

public class Product 
{
    private String name;
    private float price;

    public Product(String name, float price)
    {
        
        this.name = name;
        this.price = price;
    }

    public Product(TableRow row) {
        this((row.getString("Name")),row.getFloat("Price"));
	}

	/**
     * @return the ui
     */
    

    /**
     * @param ui the ui to set
     */
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    public String toString()
    {
        return name + "/t" + price;
    }

}