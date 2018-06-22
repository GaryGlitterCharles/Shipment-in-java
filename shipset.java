package shipment;

public class shipset {
  
  public static int nextShipmentId = 1000;
  int id;
  String shipperName;
  String modeOfTransportation;
  Double totalWeight;
  String arrivalPort;
  String departurePort;
  

shipset()
  {
   nextShipmentId++;
  }
  
  
  public int getId() {
  return id;
}
public void setId(int id) {
  this.id = id;
}
  public String getShipperName() {
    return shipperName;
  }
  public void setShipperName(String shipperName) {
    this.shipperName = shipperName;
  }
  public String getModeOfTransportation() {
    return modeOfTransportation;
  }
  public void setModeOfTransportation(String modeOfTransportation) {
    this.modeOfTransportation = modeOfTransportation;
  }
  public Double getTotalWeight() {
    return totalWeight;
  }
  public void setTotalWeight(Double totalWeight) {
    this.totalWeight = totalWeight;
  }
  public String getArrivalPort() {
    return arrivalPort;
  }
  public void setArrivalPort(String arrivalPort) {
    this.arrivalPort = arrivalPort;
  }
  public String getDeparturePort() {
    return departurePort;
  }
  public void setDeparturePort(String departurePort) {
    this.departurePort = departurePort;
  }
  
  @Override
  public String toString() {
    return String.format("%-15d%-15s%-25s%-15s%-20s%s",this.id,this.shipperName,this.modeOfTransportation,this.totalWeight.toString()+"Kg",this.arrivalPort,this.departurePort);
     
  }
  
  
}
