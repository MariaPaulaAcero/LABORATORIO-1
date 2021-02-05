import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (Maria Paula Acero Rengifo, Natalia Mayorga y Juliana Giraldo ) 
 * @version (05/02/2021)
 */
public class RobotWorld extends World
{
     
    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
       
     
       super(800, 600, 1); 
       
       prepare();
    }
       
       private void prepare()
       {
            
       addObject(new Robot(),48,50);
       
       addObject(new Wall(),52,147);
       addObject(new Wall(),159,147);
       addObject(new Wall(),266,147);
       addObject(new Wall(),587,147);
       addObject(new Wall(),692,147);
       addObject(new Wall(),791,147);
       
       addObject(new Block(),427,145);
       addObject(new Home(),751,552);
       addObject(new ScorePanel(),71,551);
       
       addObject(new Pizza(),728,46);
       addObject(new Pizza(),443,38);
       addObject(new Pizza(),183,302);
       addObject(new Pizza(),632,312);
       addObject(new Pizza(),417,537);
    
        
    }
}
