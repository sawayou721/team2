import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int timecount = 3000;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
     GreenfootSound backgroundMusic = new GreenfootSound("musicfile.mp3");
     
    public MyWorld()
    { 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject( new player(), 10, 10 );
        addObject( new goalflag(), 580, 380 );
        backgroundMusic.playLoop();
        
        for(int i=0;i<20;i++){
            int x = 570;
            int y = 370;
            addObject( new kabe(), x, y );  
        
        }  
        
    }
    public void act() 
        {
            timecount--;
            showText( ""+timecount, 570, 10 );
            if( timecount == 0 ){
                showText( "TIME OVER", 300, 200 );
                Greenfoot.stop();
            }
        }
    public void stopped()
    {
        backgroundMusic.pause();
    }
 
    public void started()
    {
        backgroundMusic.playLoop();
    }
}
