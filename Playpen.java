import java.util.Scanner;

public class Playpen {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    Horse horse = new Horse("Horsey");
    Dog dog = new Dog("Doggie");
    //welcome message
    System.out.println("Welcome to Pachelbel's Cat-Inn! Where we have two different pets every day, but never cats.");
    System.out.println("Today in our pet shop we have a " + horse.checkBreed() + " horse and a " + dog.checkBreed() + " dog!");
    System.out.println("How cute! What, you would like to see them?");
    divider();
    
    boolean game = true;
    
    while(game) {
      //Which pet to play with
      Animal currentPet = null;
      boolean petOut = false;
      while(!petOut) {
        System.out.println("Would you like to play with Horsey or Doggie?");
        String input = in.nextLine();
        if (input.equalsIgnoreCase("Horsey")) {
          currentPet = horse;
          System.out.println("Horsey is out of his spacious outdoor grazing pen! \n");
          petOut = true;
          
        } else if (input.equalsIgnoreCase("Doggie")) {
          currentPet = dog;
          System.out.println("Doggie is out of his cage! \n");
          petOut = true;
        }
      }
      //Ask user what to do
      while(petOut) {
        System.out.println("What would you like to do? \n Feed, Check Stats, Talk, Play, or Put Back your pet?");
        String input2 = in.nextLine();
        if (input2.equalsIgnoreCase("Feed")) {
          currentPet.feed();
          divider();
        } else if (input2.equalsIgnoreCase("Check Stats")) {
          currentPet.getStats();
          divider();
        } else if (input2.equalsIgnoreCase("Play")) {
          currentPet.play();
          divider();
        } else if (input2.equalsIgnoreCase("Talk")) {
            if (currentPet == dog) {
            dog.talk();
            }
            if (currentPet == horse) {
            horse.talk();
            }
            divider();
        }else if (input2.equalsIgnoreCase("Put Back")) {
          System.out.println("Your little friend goes back inside!");
          divider();
          System.out.println("Are you interested in providing him a loving home?");
            String input3 = in.nextLine();
          if (input3.equalsIgnoreCase("Yes")) {
            currentPet.getName();
            System.out.println(" is so happy to go home with you!");
            game = false;
          }
          divider();
          petOut = false;
        }
      }   
    }
    System.out.println("Thanks for stopping by! Have a wonderful life with your new companion.");
  }
  
  
  public static void divider() {
    System.out.println();
  }
}

