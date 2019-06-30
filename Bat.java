package zookeeper2;

public class Bat extends Mamal{
    
    
    
    public void fly(){
    energyLevel = 5;
    System.out.println("Flap, flap, flap!");
    this.energyLevel = energyLevel - 50;
    
    }
    public void eatHuman(){
        System.out.println("Yummy yummy humans!");
        this.energyLevel = energyLevel + 25;
    }
    
    public void attackTown(){
        System.out.println("Whoooosh! A town is a blaze!!!");
        this.energyLevel = energyLevel - 100;
    
    
    
    }
    }