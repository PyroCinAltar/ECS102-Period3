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

        Topping topping = new Topping("Cheese");
        addObject(topping,359,142);
        Topping topping2 = new Topping("Pepperoni");
        addObject(topping2,59,192);
        Topping topping3 = new Topping("BellPeppers");
        addObject(topping3,508,240);
        pizza.setLocation(264,266);
        Topping topping4 = new Topping("Mushrooms");
        addObject(topping4,264,266);
        Topping topping5 = new Topping("Olives");
        addObject(topping5,218,109);
        Topping topping6 = new Topping("Pepperoni");
        addObject(topping6,152,328);
        Topping topping7 = new Topping("Olives");
        addObject(topping7,413,297);
        Topping topping8 = new Topping("BellPeppers");
        addObject(topping8,117,86);
        pizza.setLocation(311,264);
        Topping topping9 = new Topping("Mushrooms");
        addObject(topping9,311,264);
        Topping topping10 = new Topping("Cheese");
        addObject(topping10,85,272);
        Topping topping11 = new Topping("Pepperoni");
        addObject(topping11,475,77);
    }
}
