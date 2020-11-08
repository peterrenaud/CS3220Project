import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

class CSVParser {
  public CSVParser() {

  }
  /**
   * Opens the file and then parses the csv file and stores it in an arraylist. The program
   * also converts the arraylist into the required type requred for a Jtable. After this it creates a
   * JFrame and JTable to display the data visually
   * @param filePath; the file path where the file to be parsed is located
   * @return void
   */
  public void parseFile(String filePath) {
    int numStrings = 0;
    String line = "";
    List<String> lines = new ArrayList<String>();
    try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
    while((line = br.readLine()) != null) {
      lines.add(line);
      numStrings++;
    }
    // the first of the table is the column headers
    String[] columnNames = lines.remove(0).split(",");
    // the rest is stored in 2d arrays to be used in the JTable
    String[][] data = new String[lines.size()][columnNames.length];
    // take the lines from the arraylist and add them to the 2d array
    for (int i = 0; i<numStrings-1; i++) {
      data[i] = lines.remove(0).split(",");
    }

    OutputTable output = new OutputTable(data, columnNames);
    } catch (IOException e) {
      System.out.print(e);
    }


    return;

  }

}
