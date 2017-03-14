import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class restart extends Actor
{
    /**
     * Act - do whatever the restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        /*if(Greenfoot.mouseClicked(this)) {
            /*Easy.score = 0;
            Mudium.score = 0;
            Hard.score = 0;
            
            Easy.timecounter = 180000;
            Mudium.score = 180000;
            Hard.score = 180000;
            */
           /*if(Easy.num == 1  ){
               Greenfoot.setWorld(new Easy());
            }
           else if( Mudium.num == 2  ){
               Greenfoot.setWorld(new  Mudium());
            }
           else if(Hard.num == 3  ){
               Greenfoot.setWorld(new Hard());
            }
        }*/
    }    
    
    public restart(){
        GreenfootImage image = getImage();
        image.scale(15, 15);
        setImage(image);
    }
}
