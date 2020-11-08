import java.util.*;
import java.io.*;
class managementTool {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //    System.out.print("Would you like to view election results or Elected official information?\n");
    //    System.out.print("Enter (politics)\n");
    //String input = sc.nextLine();
    String input = "politics";
    if(input.equals("politics")) {
      Politics politics = new Politics();
      System.out.print("Would you like to view election results or Elected official information?\n");
      //      input = sc.nextLine();
      input = "results"; // filler until the other section is added
      if (input.equals("results")) {
        System.out.print("which year would you like to view?");
        int number = 10; // filler until later years are added
        politics.getElectionResults(number);
      } else {
        System.out.println("not implemented");
      }
    } else {
      System.out.print("Input was incorrect\n");
    }

  }
}
