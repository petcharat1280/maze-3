import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monster extends Actor
{
    /**
     * Act - do whatever the monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image1, image2;
    
    private int currentImage, direction;
    private long imageSwapCounter;
    
    private static final int RIGHT = 0;
    private static final int LEFT = 1;
    private static final int UP = 2;
    private static final int DOWN = 3;

    public monster() {

        image1 = new GreenfootImage("g1.png");
        image2 = new GreenfootImage("g2.png");

        currentImage = 0;
        imageSwapCounter = System.currentTimeMillis();

        setImage(image1);
        
    }

    public void act() {
        
        picmonster();
        
        int i = Greenfoot.getRandomNumber(3)+1;
        if(i ==1){
            if(getObjectsAtOffset(-1, 0, grey.class).isEmpty()){
                setLocation(getX()-1,getY());
            }
        }
        if(i==2){
            if(getObjectsAtOffset(1, 0, grey.class).isEmpty()){
                setLocation(getX()+1,getY()); 
            }
        }
        if(i==3){
            if(getObjectsAtOffset(0, -1, grey.class).isEmpty()){
                setLocation(getX(),getY()-1);
            }
        }
        if(i==4){
            if(getObjectsAtOffset(0, 1, grey.class).isEmpty()){
                setLocation(getX(),getY()+1);
            }
        }
    }    
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    public void picmonster() {

        if(System.currentTimeMillis() - imageSwapCounter > 100) {
            imageSwapCounter = System.currentTimeMillis();
            currentImage++;
            if(currentImage > 1) {
                currentImage = 0;
            }
            if(currentImage == 0) {
                setImage(image1);
            } else {
                setImage(image2);
            }
        }
        if(isTouching(player.class)){
            Greenfoot.playSound("Dead.wav");
            Greenfoot.setWorld(new gameOv());
        }
    }
}
