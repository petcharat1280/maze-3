import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Que here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Que extends World
{

    /**
     * Constructor for objects of class Que.
     * 
     */
    public Que()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(41, 41, 15); 
        addObject(new R(),36, 5);
        showText("How to play Maze Game.",getWidth()/2 , 7);
        showText("1. Click play for start game.",getWidth()/2, 11);
        showText("2. Player can choose level of Easy, Medium and Hard.",getWidth()/2, 13);
        showText("3. Player can control character by click keyboard. ",getWidth()/2, 15);
        showText("4. Click keyboard arrow of up, down, left and right.",getWidth()/2, 17);
        showText("5. You can eat candy for keep score.",getWidth()/2, 19);
        showText("6. You can restart by click restart.",getWidth()/2, 21);
        showText("7. You can return on Menu by click menu.",getWidth()/2, 23);
        showText("8. If you run crash monster were game over. ",getWidth()/2, 25);
        showText("9. Click next for see score and return to menu.",getWidth()/2, 27);
        showText("10. If you run to flag, you will winner. ",getWidth()/2, 29);
        showText("11. Player can click next for see score and return to menu.",getWidth()/2, 31);
    }
}
