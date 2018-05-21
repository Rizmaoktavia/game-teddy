import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class form1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class form1 extends World
{
    public playbutton playbutton = new playbutton ();
    /**
     * Constructor for objects of class form1.
     * 
     */
    public form1()
    {    
        //Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        addObject(playbutton,210,420);
        
        addObject(new quitbutton(), 206, 500);
    }
}
