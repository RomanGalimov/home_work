package main.java;

/**
 * Created by Vo4ik on 26.11.2016.
 */
public class Viking extends Warrior implements Cloneable {

    private final int DAMAGE = 55;
    private final long HEALTH = 200;


    public Viking(){
        damage = 55;
        health = 200;
    }

    public Viking(String warriorName, String squadName){
        damage = 55;
        health = 200;
        this.warriorName = warriorName;
        this.squadName = squadName;
    }

    public Viking(String warriorName){
        damage = 55;
        health = 200;
        this.warriorName = warriorName;
    }
}
