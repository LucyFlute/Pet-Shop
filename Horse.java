import java.util.Random;

public class Horse extends Animal {
  protected String breed;
  protected String[] breeds = new String[4];
    Random rand = new Random();
  
  
  public Horse(String name) {
    super(name);
    breeds[0] = "Thoroughbred";
  breeds[1] = "Shetland Pony";
  breeds[2] = "Zebra";
  breeds[3] = "Clydesdale";
    this.name = name;
    this.breedNum = rand.nextInt(4);
    this.breed = breeds[(breedNum-1)];
    this.energy = 100;
    this.age = 2;
  }
  
  public void talk() {
    System.out.println(this.name + " neighs at you!");
  }
  
} 