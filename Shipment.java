package shipment;


import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Shipment {

  public static void main(String[] args) 
  {
    
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of shipments: ");
    int numOfShipments = sc.nextInt();
    
    
    for(int i=0;i<numOfShipments;i++) 
    {   
      System.out.println("Enter the name of shipper name: ");
      System.out.println("Enter the mode of transportation: ");
      System.out.println("Enter the total weight: ");
      System.out.println("Enter the arrival port: ");
      System.out.println("Enter the departure port : ");
      createNewShipment(sc.nextInt(),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextLine(),sc.nextLine());
       
     }
      sc.close();
   }
  
   public static shipset createNewShipment(int id,String shipperName,String modeOfTransportation,Double totalWeight,String arrivalPort,String departurePort) 
   {
     List<shipset> data = new ArrayList<>();
     shipset ship = new shipset();
     ship.setId(id);
     ship.setShipperName(shipperName);
     ship.setModeOfTransportation(modeOfTransportation);
     ship.setTotalWeight(totalWeight);
     ship.setArrivalPort(arrivalPort);
     ship.setDeparturePort(departurePort);
     data.add(ship);
    return ship;
    
   
    
  }
  
  
  
  
 

 
}