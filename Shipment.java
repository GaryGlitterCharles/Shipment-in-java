import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Shipment {

  public static void main(String[] args) 
  {
    
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of shipments: ");
    int numOfShipments = sc.nextInt();
    List<shipset> data = new ArrayList<>();
    
    for(int i=0;i<numOfShipments;i++) 
    {   
        shipset ship= new shipset(); 
        System.out.println("Enter shipment "+(i+1)+" details");
        System.out.println("Enter the name of shipper name: ");
        ship.setShipperName(sc.next());
        sc.nextLine();
        System.out.println("Enter the mode of transportation: ");
        ship.setModeOfTransportation(sc.nextLine());
        System.out.println("Enter the total weight: ");
        ship.setTotalWeight(sc.nextDouble());
        System.out.println("Enter the arrival port: ");
        ship.setArrivalPort(sc.next());
        sc.nextLine();
        System.out.println("Enter the departure port : ");
        ship.setDeparturePort(sc.nextLine());
        ship.setId(shipset.nextShipmentId);
        data.add(ship);
        
       
     }
    
   for(shipset output: data) 
    {
      System.out.println(output);
    }
    sc.close();
   }
}


