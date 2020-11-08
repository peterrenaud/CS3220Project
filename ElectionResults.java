import java.io.*;
import java.util.*;
import javax.swing.*;
class ElectionResults{
  public int year;
  private int ward;
  private int poll;
  private String pollName;
  private String officeTitle;
  private String candidate;
  private int totalVotes;
  private String[] data;
  public ElectionResults() {

  }
  public ElectionResults(int year) {
    this.year = year;
    //    getInformation(year);
  }
  public int getWard() {
    return ward;
  }
  public int getPoll() {
    return poll;
  }
  public String getPollName() {
    return pollName;
  }
  public String getOfficeTitle() {
    return officeTitle;
  }

  public String getName() {
    return candidate;
  }
  public int getTotalVotes() {
    return totalVotes;
  }
  public void getInformation(int year) {

    List<String> strings = new ArrayList<String>();
    strings.add("Race, Name, Value, Display Name");
    strings.add("mayor, Drew DILKENS, 31201, MAYOR");
    strings.add("mayor, Franz (Frank) DYCK, 785, MAYOR");
    strings.add("mayor, Tom HENSEL, 797, MAYOR");
    strings.add("mayor, Ernie LAMONT, 1121, MAYOR");
    strings.add("mayor, Matt MARCHAND, 18626, MAYOR");
    //below is used to convert data parsed from the csv file into the required format for a JTable
    int numStrings = strings.size();
    String[] columnNames = strings.remove(0).split(",");
    System.out.print(columnNames.length);
    String[][] data = new String[strings.size()][columnNames.length];

    for (int i = 0; i < numStrings-1; i++) {
      data[i] = strings.remove(0).split(",");
    }

    OutputTable output = new OutputTable(data, columnNames);

    return;
  }

}
