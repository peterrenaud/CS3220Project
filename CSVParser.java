import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class CSVParser {
  String line = "";
  public CSVParser() {

  }
  public void parseFile(String fileName) {
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      while((line = br.readLine()) != null) {
        String[] data = line.split(",");
        for (String n: data) {
          System.out.println(n);
        }
      }
      br.close();
    } catch (IOException e) {
      System.out.print(e);
    }
  }
}
