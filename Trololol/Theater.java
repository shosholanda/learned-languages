import java.util.Scanner;

public class Theater {
  public static void main (String[] args) {

    Scanner nice = new Scanner (System.in);

    System.out.println("Welcome to the best theater in town!!!");
    System.out.println("Type in your age for a 20% discount");

    int age = nice.nextInt();

    if (age < 18) {
      System.out.println("Congratulations!!! You're qualified for out 20% discount");
    } else {
      System.out.println("Ooooops,  We're very sorry. You're too old to enjoy this discount. But you can still enjoy the show all the same");
    } System.out.println("Enjoy!");
  }
}
