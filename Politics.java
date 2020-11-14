import java.io.*;
import java.net.*;
import java.util.*;

class Politics {
  public Politics() {}

  /**
   * Decides based on the year which path or url to send to the parser to display the corresponding
   * data in a JTable
   *
   * @param year; the year of the election results data that is to be displayed
   * @return void
   */
  public void getElectionResults(int year) {
    CSVParser parser = new CSVParser();
    switch (year) {
      case 2018:
        parser.parseUrl("https://opendata.citywindsor.ca/Uploads/results-2018.csv");
        break;
      case 2020:
        parser.parseUrl("https://opendata.citywindsor.ca/Uploads/Results-2020.csv");
        break;
      default:
        System.out.println("Invalid year");
    }
  }

  public void getElectedOfficials() {
    CSVParser parser = new CSVParser();
    parser.parseUrl(
        "https://opendata.citywindsor.ca/Uploads/City%20Windsor%20Elected%20Officials.csv");
  }
}
