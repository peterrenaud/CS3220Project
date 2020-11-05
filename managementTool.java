import java.util.*;
import java.io.*;
class managementTool {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Would you like to view election results or Elected official information?\n");
    System.out.print("Enter (officials) or (results)\n");
    String input = sc.nextLine();


    if(input == "officials" ||input =="results") {
      Politics polotics = new Politics(input);
    } else {
      System.out.print("Input was incorrect\n");
    }

  }
}
