import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flag extends Actor
{
    /**
     * Act - do whatever the flag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage image1, image2;
    private long imageSwapCounter;
    private int currentImage;
    
    public flag() {
        
        image1 = new GreenfootImage("Flag.png");
        image2 = new GreenfootImage("Flag2.png");
        
        imageSwapCounter = System.currentTimeMillis();
        currentImage = 0;
        
        setImage(image1);
    }
    
    public void act() {
        
        animate();
    }
    
    public void animate() {
    
        if(System.currentTimeMillis() - imageSwapCounter > 250) {
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
