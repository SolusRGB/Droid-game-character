// A droid that performs tasks, can give evergy to a friend and give a health report.
// Brandon Eddy 2021
public class Droid{
    String name;
    int batteryLevel;
    int health;
    
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
      health = 100;
    }
    
    //toString METHOD
    public String toString(){
      return "Hello! I'm the Droid " + name;
    }
    //performTask METHOD
    public void performTask(String task){
      System.out.println(name + " has just " + task + ".");
      batteryLevel = batteryLevel - 10;
      health = health - 5;
      this.energyReport();
      this.healthReport();
    }
    //energyReport METHOD
    public void energyReport(){
      System.out.println(name + " has " + batteryLevel + "% Battery left.");
    }
    //healthReport METHOD
    public void healthReport(){
      System.out.println(name + " has " + health + "HP left!");
    }
    //energyTransfer METHOD
    public void energyTransfer(Droid otherDroid, int amount){
      this.batteryLevel = this.batteryLevel - amount;
      System.out.println(otherDroid + " has transferred " + amount + "% of its battery to " + name);
      System.out.println(otherDroid + " is currently at " + this.batteryLevel + "%");
      System.out.println(name + " is now at " + (batteryLevel + amount) + "% battery.");
    }
    // Main METHOD
    public static void main(String[] args){
      Droid one = new Droid("Ele");
      Droid two = new Droid("Butts");
  
      one.performTask("choked");
      two.performTask("swallowed");
  
      one.energyTransfer(two, 10);
  
    }
  }