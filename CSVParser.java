import java.io.*;
import java.net.*;
import java.util.*;

class CSVParser {
  public CSVParser() {}

  /**
   * Opens the file and then parses the csv file and stores it in an arraylist. The program also
   * converts the arraylist into the required type requred for a Jtable. After this it creates a
   * JFrame and JTable to display the data visually
   *
   * @param filePath; the file path where the file to be parsed is located
   * @return void
   */
  public void parseFile(String filePath) {
    int numStrings = 0;
    String line = "";
    List<String> lines = new ArrayList<String>();
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      while ((line = br.readLine()) != null) {
        lines.add(line);
        numStrings++;
      }
      // the first of the table is the column headers
      String[] columnNames = lines.remove(0).split(",");
      // the rest is stored in 2d arrays to be used in the JTable
      String[][] data = new String[lines.size()][columnNames.length];
      // take the lines from the arraylist and add them to the 2d array
      for (int i = 0; i < numStrings - 1; i++) {
        data[i] = lines.remove(0).split(",");
      }

      OutputTable output = new OutputTable(data, columnNames);
    } catch (IOException e) {
      System.out.print(e);
    }

    return;
  }
  /**
   * Connects to the website and then parses the csv file and stores it in an arraylist. The program
   * also converts the arraylist into the required type requred for a Jtable. After this it creates
   * a JFrame and JTable to display the data visually
   *
   * @param url; the url that the data is being taken from
   * @return void
   */
  public void parseUrl(String url) {
    int numStrings = 0;
    String line = "";
    try {
      // steps to connect to the specified url
      URL csv = new URL(url);
      URLConnection connection = csv.openConnection();

      List<String> lines = new ArrayList<String>();
      try (Scanner br = new Scanner(connection.getInputStream())) {
        while (br.hasNextLine()) {
          line = br.nextLine();
          lines.add(line);
          numStrings++; // count while the lines are being added so you don't have to get the length
          // later
        }
        // the first of the table is the column headers
        String[] columnNames = lines.remove(0).split(",");
        // the rest is stored in 2d arrays to be used in the JTable
        String[][] data = new String[lines.size()][columnNames.length];
        // take the lines from the arraylist and add them to the 2d array
        for (int i = 0; i < numStrings - 1; i++) {
          data[i] = lines.remove(0).split(",");
        }

        OutputTable output = new OutputTable(data, columnNames);
      } catch (IOException e) {
        System.out.print(e);
      }
    } catch (Exception e) {
      System.out.print(e);
    }

    return;
  }
}
