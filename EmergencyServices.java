class EmergencyServices {
  public EmergencyServices() {}

  public void getPolice() {
    CSVParser parser = new CSVParser();
    parser.parseUrl("https://opendata.citywindsor.ca/Uploads/Police.csv");
  }

  public void getFire() {
    CSVParser parser = new CSVParser();
    parser.parseUrl("https://opendata.citywindsor.ca/Uploads/Fire_Stations.csv");
  }

  public void getHospital() {
    CSVParser parser = new CSVParser();
    parser.parseUrl("https://opendata.citywindsor.ca/Uploads/Hospitals.csv");
  }
}
