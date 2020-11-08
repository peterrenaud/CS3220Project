import javax.swing.*;
import java.io.*;
class OutputTable extends JFrame {
  public OutputTable(String[][] data, String[] columns) {
    JTable table = new JTable(data, columns); // create a table with the data specified
    this.add(new JScrollPane(table)); // add a scroll bar
    //this.setTitle(String.valueOf(year));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }
}
