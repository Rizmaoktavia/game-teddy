import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playbutton extends Actor
{
    /**
     * Act - do whatever the playbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.mouseClicked(this))
       {
           Greenfoot.setWorld(new MyWorld());
       }
        // Add your action code here.
    }  
    
    public playbutton()
    {
        GreenfootImage img=getImage();
        img.scale(img.getWidth()-80,img.getHeight()-80);
        setImage(img);
    }
}
