import java.util.*;
import java.io.*;

class Politics {
  String fileType;
  public Politics() {

  }

  public void getElectionResults(int year) {
    CSVParser parser = new CSVParser();
    // only working with the one year until it is working properly
    parser.parseFile("./results-2018.csv");

  }
}
