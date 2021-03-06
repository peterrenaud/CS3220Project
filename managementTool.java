import java.io.*;
import java.util.*;

class managementTool {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] mainCategories = {"1 politics", "2 emergency services"};
    String[] politicsCategories = {"1 results", "2 Elected officials information"};
    String[] emergencyCategories = {"1 police", "2 fire", "3 hospital"};
    String[] resultsYears = {"2018", "2020"};
    displayCategories(mainCategories);
    int selection = sc.nextInt();
    System.out.flush();
    switch (selection) {
      case 1:
        Politics politics = new Politics();
        displayCategories(politicsCategories);
        //      System.out.print("Would you like to view election results or Elected official
        // information?\n");
        selection = sc.nextInt();
        switch (selection) {
          case 1:
            System.out.println("What year would you like to view?");
            displayCategories(resultsYears);
            int year = sc.nextInt(); // filler until later years are added
            politics.getElectionResults(year);
            break;
          case 2:
            politics.getElectedOfficials();
            break;
          default:
            System.out.print("invalid selection");
            break;
        }
        break;
      case 2:
        EmergencyServices emergency = new EmergencyServices();
        displayCategories(emergencyCategories);
        //      System.out.print("police, fire, or hospital");
        selection = sc.nextInt();
        switch (selection) {
          case 1:
            emergency.getPolice();
            break;
          case 2:
            emergency.getFire();
            break;
          case 3:
            emergency.getHospital();
            break;
          default:
            System.out.print("invalid selection");
        }
        break;
      default:
        System.out.print("invalid selection");
        break;
    }
  }

  public static void displayCategories(String[] category) {
    for (String n : category) {
      System.out.println(n);
    }
  }
}
