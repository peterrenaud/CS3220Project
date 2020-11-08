import javax.swing.*;
class OutputTable extends JFrame {
  private Object[][] data;
  private String[] columns;
  public OutputTable(String[][] data, String[] columns) {
    JTable table = new JTable(data, columns);
    this.add(new JScrollPane(table));
    this.setTitle("test");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }
}
