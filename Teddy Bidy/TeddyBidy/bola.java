import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola extends Actor
{
    int x=3;
    int y=3;
    
    private boolean stuck = true;
    public void act()
    {
        if(!stuck)
        {
            move();
        }
        
        gerak();
        kanan();
        kiri();
        atas();
        papankayu();
        beruang();
    }
    
    public void move()
    {
        setLocation (getX() + x, getY() + y);
        papankayu();
        beruang();
    }
        
    
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bola()
    {
        GreenfootImage img=getImage();
        img.scale(img.getWidth()-20,img.getHeight()-20);
        setImage(img);
    }
    
   
    public void gerak()
    {
        setLocation(getX()+x,getY()+y);
    }
    public void kanan()
    {
        if(getX()>=getWorld().getWidth()-getImage().getWidth()/2){
            x=x-1;
        }
        }
    public void kiri()
    {
        if(getX()<=getImage().getWidth()/2){
            x=x+1;
        }
    }
    public void atas()
    {
        Actor teddybear=getOneIntersectingObject(teddy.class);
        if(getY()<=getImage().getHeight()/2){
            y=y+1;
        }
        if(teddybear !=null){
            ((MyWorld)getWorld()).tambah();
            getWorld().removeObject(teddybear);
        }
        
    }
    public void papankayu()
    {
        Actor kayu=getOneIntersectingObject(papan.class);
        if(kayu !=null){
            y=y-1;
        }
        if(getY()>=getWorld().getHeight()-getImage().getHeight()/2){
            Greenfoot.stop();
        }
        
    }
    public void beruang()
    {
        Actor teddy=getOneIntersectingObject(teddy.class);
        if(teddy !=null){
            y=y+1;
        }
        if(getY()>=getWorld().getHeight()-getImage().getHeight()/2){
            Greenfoot.stop();
        
           
        }
    }
    public void release()
    {
        x = 0;
        y = -5;
        stuck = false;
    }
   
}
