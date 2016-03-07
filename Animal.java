public class Animal {
  protected String name;
  protected int energy;
  protected int age;
  protected int breedNum;
  
  public Animal(String name) {
    this.name = name;
    this.energy = 100;
  }
  
  public void getStats() {
    System.out.println("This one's name is " + this.name + ".");
    System.out.println(this.name + " is " + this.age + " years old.");
    System.out.println("Energy bar is " + this.energy + "% full!");
    if (this.energy < 50) {
      System.out.println(this.name + " is hungry!");
    } else {
      System.out.println(this.name + " is pretty full.");
    }
  }
  
  public void getName() {
    System.out.print(this.name);
  }
  
  public void feed() {
    if (this.energy == 100) {
      System.out.println(this.name + " doesn't really seem interested in food...");
    } else if (this.energy > 90) {
      this.energy = 100;
      System.out.println(this.name + "is full now! Thank you!");
    } else {
      this.energy += 10;
      System.out.println(this.name + " looks really happy now!");
    }  
  }
  
  public void play() {
    System.out.println(this.name + " runs around a bit! Now " + this.name + " looks at you expectantly.");
    this.energy -= 15;
  }
}