import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class reH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reH extends Actor
{
    /**
     * Act - do whatever the reH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) Greenfoot.setWorld(new Hard());
    }    
    public reH(){
        GreenfootImage image = getImage();
        image.scale(15, 15);
        setImage(image);
    }
}
