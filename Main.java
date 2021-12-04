import java.util.Scanner; 

public class Main {

  public static void main(String[] args) { //method
    System.out.println("What is your name?");

    //type identifier = new type();
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    System.out.println("Hello " + name);
  }
}