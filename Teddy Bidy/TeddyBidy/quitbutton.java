import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class quitbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class quitbutton extends Actor
{
    /**
     * Act - do whatever the quitbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new form1());
            Greenfoot.stop();
            //System.exit(10);
        }
        // Add your action code here.
    }    
    public quitbutton()
    {
        GreenfootImage img=getImage();
        img.scale(img.getWidth()-50,img.getHeight()-75);
        setImage(img);
    }
}
