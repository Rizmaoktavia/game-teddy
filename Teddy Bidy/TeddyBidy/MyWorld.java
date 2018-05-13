import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter("Poin: ");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        addObject(counter,70,580);
        
        addObject(new bola(), 200, 550);
        addObject(new papan(), 200, 580);
        
        addObject(new teddy(), 30, 40);
        addObject(new teddy(), 100, 40);
        addObject(new teddy(), 170, 40);
        addObject(new teddy(), 235, 40);
        addObject(new teddy(), 300, 40);
        addObject(new teddy(), 372, 40);
        
        addObject(new teddy(), 30, 115);
        addObject(new teddy(), 100, 115);
        addObject(new teddy(), 170, 115);
        addObject(new teddy(), 235, 115);
        addObject(new teddy(), 300, 115);
        addObject(new teddy(), 372, 115);
        
        addObject(new teddy(), 30, 190);
        addObject(new teddy(), 100, 190);
        addObject(new teddy(), 170, 190);
        addObject(new teddy(), 235, 190);
        addObject(new teddy(), 300, 190);
        addObject(new teddy(), 372, 190);
        
        
    }
    
    public void tambah(){
        counter.add(5);
    }
}
