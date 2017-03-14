import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage right = new GreenfootImage("right.jpg");
    private GreenfootImage yellow = new GreenfootImage("yellow.png");
    private GreenfootImage left = new GreenfootImage("left.jpg");
    private GreenfootImage up = new GreenfootImage("up.jpg");
    private GreenfootImage down = new GreenfootImage("down.jpg");
    private int currentImage;
    private long imageSwapCounter;
    public player(){
        setImage(right);
        currentImage = 0;
        imageSwapCounter = System.currentTimeMillis();
    }
    public void act() 
    {
        lookForFood();
        checkKeys();
        if(isTouching(flag.class)){
            Greenfoot.playSound("yay_z.wav");
            Greenfoot.setWorld(new Winner());
        }
    }    
    private void checkKeys() {
        if(System.currentTimeMillis() - imageSwapCounter > 100) {
            imageSwapCounter = System.currentTimeMillis();
            currentImage++;
            if(currentImage > 1) {
                currentImage = 0;
            }
            if(currentImage == 0) {
                setImage(right);
            } else {
                setImage(yellow);
            }
        }
        if(Greenfoot.isKeyDown("left")){
            if(getObjectsAtOffset(-1, 0, grey.class).isEmpty()){
                setLocation(getX()-1,getY());//Greenfoot.delay(5);
                if(getImage() == left) setImage(yellow);
                else setImage(left);
                if(!getObjectsAtOffset(-1, 0, grey.class).isEmpty()){
                    Greenfoot.playSound("8BitHurt.wav");
                }
            }
            else setImage(left);
        }
        if(Greenfoot.isKeyDown("right")){
            if(getObjectsAtOffset(1, 0, grey.class).isEmpty()){
                setLocation(getX()+1,getY()); //Greenfoot.delay(5);
                if(getImage() == right) setImage(yellow);
                else setImage(right);
                if(!getObjectsAtOffset(1, 0, grey.class).isEmpty()){
                    Greenfoot.playSound("8BitHurt.wav");
                }
            }
            else setImage(right);
        }
        if(Greenfoot.isKeyDown("up")){
            if(getObjectsAtOffset(0, -1, grey.class).isEmpty()){
                setLocation(getX(),getY()-1);//Greenfoot.delay(5);
                if(getImage() == up) setImage(yellow);
                else setImage(up);
                if(!getObjectsAtOffset(0, -1, grey.class).isEmpty()){
                    Greenfoot.playSound("8BitHurt.wav");
                }
            }else setImage(up);
        }
        if(Greenfoot.isKeyDown("down")){
            if(getObjectsAtOffset(0, 1, grey.class).isEmpty()){
                setLocation(getX(),getY()+1);//Greenfoot.delay(5);
                if(getImage() == down) setImage(yellow);
                else setImage(down);
                if(getObjectsAtOffset(0, 1, grey.class).isEmpty()){
                    Greenfoot.playSound("8BitHurt.wav");
                }
            }else setImage(down);
        }
    }
    public void lookForFood(){
        if(isTouching(food.class)){
            removeTouching(food.class);
            Greenfoot.playSound("eating.wav");
            Easy.score++;
            Mudium.score++;
            Hard.score++;
        }
    }
}
