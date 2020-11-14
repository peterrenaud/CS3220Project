import java.io.*;
import java.util.*;
import javax.swing.*;

// this class can be used later should other methods require the ability to perform arithatic on the
// data
class ElectionResults {
  private int year;
  private int ward;
  private int poll;
  private String pollName;
  private String officeTitle;
  private String candidate;
  private int totalVotes;
  private String[] data;

  public ElectionResults() {}

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
}
