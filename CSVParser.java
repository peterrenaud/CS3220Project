import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

class CSVParser {
  String line = "";
  public CSVParser() {

  }
  public void parseFile(String fileName) {
    int numStrings = 0;
    String line = "";
    List<String> lines = new ArrayList<String>();
    try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
    while((line = br.readLine()) != null) {
      lines.add(line);
      numStrings++;
      //        String data = line.split(",");
      //        for (String n: data) {
      //  System.out.print(n);
      //}
      //        System.out.println(line);
      // System.out.println();
    }
    String[] columnNames = lines.remove(0).split(",");
    String[][] data = new String[lines.size()][columnNames.length];

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
