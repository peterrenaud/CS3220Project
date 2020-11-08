import java.util.*;
import java.io.*;
import java.net.*;

class Politics {
  public Politics() {

  }
  /**
   * Decides based on the year which path or url to send to the parser to display the corresponding
   * data in a JTable
   *
   * @param year; the year of the election results data that is to be displayed
   * @return void
   */
  public void getElectionResults(int year) {
    CSVParser parser = new CSVParser();
    // only working with the one year until it is working properly
    parser.parseFile("./results-2018.csv");
  }
}
