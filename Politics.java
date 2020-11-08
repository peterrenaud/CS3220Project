import java.util.*;
import java.io.*;

class Politics {
  String fileType;
  public Politics() {

  }
  public Politics(String fileType) {
    this.fileType = fileType;
    getOfficialsInformation();
  }

  public void getOfficialsInformation() {
    System.out.print("would you like the information of the elected officials or the results\n");
    System.out.print("(officials) or (results)\n");
    Scanner sc = new Scanner(System.in);
    fileType = sc.nextLine();
    int year = 1;
    switch(fileType) {
    case "official":
      ElectedOfficials officials = new ElectedOfficials();
      break;
    case "results":
      System.out.print("what year would you like to get the results from?\n");
      System.out.print("options are ... ... ... (or 0 for all results(optional))\n");
      year = sc.nextInt();
      ElectionResults electionResults = new ElectionResults();
      electionResults.getInformation(year);
      break;
    default :
      System.out.print("Invalid selection\n");
      break;
    }
  }
}
