import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class R here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R extends Actor
{
    /**
     * Act - do whatever the R wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new Manu());
        }
    }    
     public R(){
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
}
