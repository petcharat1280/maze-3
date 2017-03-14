import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOv extends World
{

    /**
     * Constructor for objects of class gameOv.
     * 
     */
    public gameOv()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(41, 41, 15); 
        addObject(new gover(),getWidth()/2, getHeight()/2);
        addObject(new next(), 35, 5);
    }
}
