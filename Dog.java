import java.util.Random;

public class Dog extends Animal {
  protected String breed;
  protected String[] breeds = new String[4];
  Random rand = new Random();
  
  
  public Dog(String name) {
    super(name);
    breeds[0] = "Wolf";
    breeds[1] = "Lab";
    breeds[2] = "Chihuahua";
    breeds[3] = "Husky";
    this.name = name;
    this.breedNum = rand.nextInt(3);
    this.breed = breeds[(breedNum)];
    this.energy = 100;
    this.age = rand.nextInt(5);
  }
  
  public void talk() {
    System.out.println(this.name + " barks at you!");
  }
  
  public String checkBreed() {
    return breed;
  }
  
} 