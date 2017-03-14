import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class next extends Actor
{
    /**
     * Act - do whatever the next wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new EndScore());
           Greenfoot.playSound("8BitHurt.wav");
        }
    }    
    public next(){
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
}
