import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class q here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class q extends Actor
{
    /**
     * Act - do whatever the q wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new Que());
           Greenfoot.playSound("8BitHurt.wav");
        }
    }    
    public q(){
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
    }
}
