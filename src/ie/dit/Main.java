package ie.dit;
import processing.core.PApplet;

public class Main
{
    public void cafe()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Cafe());
	}
	public static void main(String[] args)
	{
		Main main = new Main();
		main.cafe();			
	}
}