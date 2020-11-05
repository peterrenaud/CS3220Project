class Politics {
  String fileType;
  public Politics() {

  }
  public Politics(String fileType) {
    this.fileType = fileType;
    int year = 1;
    switch(fileType) {
    case "official":
      ElectedOfficials officials = new ElectedOfficials();

    case "results":
      System.out.print("what year would you like to get the results from?\n");

      ElectionResults electionResults = new ElectionResults(year);

  }


  }
}
