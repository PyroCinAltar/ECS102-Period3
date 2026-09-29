import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Pizza pizza = new Pizza();
        addObject(pizza,300,300);
        Topping topping = new Topping();
        addObject(topping, 0, 0);
        Topping topping2 = new Topping();
        addObject(topping2, 599, 399);
        Topping topping3 = new Topping();
        addObject(topping3, 88, 283);
        Topping topping4 = new Topping();
        addObject(topping4, 250, 15);
        Topping topping5 = new Topping();
        addObject(topping5, 314, 200);
        Topping topping6 = new Topping();
        addObject(topping6, 101, 101);
        Topping topping7 = new Topping();
        addObject(topping7, 479, 302);
        Topping topping8 = new Topping();
        addObject(topping8, 534, 3);
        Topping topping9 = new Topping();
        addObject(topping9, 43, 396);
        Topping topping10 = new Topping();
        addObject(topping10, 599, 207);
        Topping topping11 = new Topping();
        addObject(topping11, 4, 223);
        Topping topping12 = new Topping();
        addObject(topping12, 7, 104);
        Topping topping13 = new Topping();
        addObject(topping13, 203, 301);
        Topping topping14 = new Topping();
        addObject(topping14, 417, 20);
        Topping topping15 = new Topping();
        addObject(topping15, 302, 82);
        Topping topping16 = new Topping();
        addObject(topping16, 17, 253);
        topping7.setLocation(486,280);
    }
}
