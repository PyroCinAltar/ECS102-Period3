import greenfoot.*;
/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon extends Actor 
{
    // instance variables - replace the example below with your own
    private int hp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;
    
    public Pokemon(int hp, int ap, String name, String attack, String type){
        this.hp = hp;
        this.ap = ap;
        this.name = name;
        this.attack = new Attack(attack);
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

    public void attack(String attackName, User enemy){
        takeDamage(enemy.getPokemon().getAPower(attackName, enemy));
    }
    
    public void takeDamage(int amount){
        this.hp-=amount;
        if(this.hp<0){
            this.hp=0;
        }
    }
    
    public void heal(){
        this.hp+=20;
    }
    
    public Attack getAttack(){
        return this.attack;
    }
    
    public int getAPower(String attackName, User enemy){
        Attack a = enemy.getPokemon.getAttack();
        return a.getPower();
    }
    
    public int getHp(){
        return this.hp;
    }
    
    public int getAp(){
        return this.ap;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean isOut(){
        return this.hp<=0;
    }
}
