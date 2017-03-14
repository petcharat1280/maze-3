import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class food extends Actor
{
    /**
     * Act - do whatever the food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private GreenfootImage image1, image2;
     private int currentImage;
    private long imageSwapCounter;
    public food(){
        image1 = new GreenfootImage("food.png");
        image2 = new GreenfootImage("food1.png");
        setImage(image1);
         currentImage = 0;
        imageSwapCounter = System.currentTimeMillis();
    }
    public void act() 
    {
        picmonster();
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
    }
}
